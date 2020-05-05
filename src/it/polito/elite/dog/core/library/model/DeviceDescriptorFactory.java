/*
 * Dog - Core
 * 
 * Copyright (c) 2010-2013 Dario Bonino
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package it.polito.elite.dog.core.library.model;

import it.polito.elite.dog.core.library.jaxb.Device;
import it.polito.elite.dog.core.library.jaxb.DogHomeConfiguration;

import java.io.IOException;
import java.io.StringWriter;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.log.NullLogChute;
import org.apache.velocity.runtime.resource.loader.URLResourceLoader;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

/**
 * 1) given a valid descriptor xml (jaxb Device object) generates a descriptor
 * instance (by simply calling the constructor)
 * 
 * 2) given an hashmap of device-specific parameters and a template "folder or
 * classpath" generates a descriptor instance by filling the template, parsing
 * it into a jaxb Device and finally calling the constructor.
 * 
 * @author bonino
 * 
 */
public class DeviceDescriptorFactory
{
    // the velocity engine used to generate the descriptor XML
    private VelocityEngine vtEngine;

    private XmlMapper mapper;
    /**
     * Common variables for templates
     */
    public static String NAME = "name";
    public static String GATEWAY = "gateway";
    public static String LOCATION = "location";
    public static String DESCRIPTION = "description";

    /**
     * 
     */
    public DeviceDescriptorFactory(URL url)
    {
        // set the template directory
        Properties p = new Properties();
        p.put(RuntimeConstants.RESOURCE_LOADER, "url");
        p.put("url.resource.loader.class", URLResourceLoader.class.getName());
        p.put("url.resource.loader.root", url.toString());
        p.put(RuntimeConstants.RUNTIME_LOG_LOGSYSTEM_CLASS,
                NullLogChute.class.getName());

        // create the engine
        this.vtEngine = new VelocityEngine(p);

        // initialize the engine
        this.vtEngine.init();

        // create a JacksonXmlModule to customize XML parsing
        JacksonXmlModule xmlModule = new JacksonXmlModule();
        // disable wrapper elements
        xmlModule.setDefaultUseWrapper(false);
        // create a new XML mapper
        this.mapper = new XmlMapper(xmlModule);
        // avoid failure on unknown properties
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setSerializationInclusion(Include.NON_EMPTY);
        // pretty printing
        // mapper.enable(SerializationFeature.INDENT_OUTPUT);
        // exploit existing JAXB annotations
        // ad interim solution to be removed when migration to Jackson will
        // complete.
        AnnotationIntrospector introspector = new JaxbAnnotationIntrospector(
                TypeFactory.defaultInstance());
        mapper.setAnnotationIntrospector(introspector);
    }

    public DeviceDescriptor getDescriptor(
            Map<String, Object> descriptorDefinitionData, String deviceClass)
            throws IOException

    {
        // the device descriptor to return
        DeviceDescriptor descriptor = null;

        // get the device template if any
        Template template = this.vtEngine.getTemplate(deviceClass + ".vm");

        // check not null
        if (template != null)
        {
            // create the context
            VelocityContext context = new VelocityContext();

            // populate the context
            for (String key : descriptorDefinitionData.keySet())
            {
                context.put(key, descriptorDefinitionData.get(key));
            }

            // get the descriptor xml
            // the needed StringWriter
            StringWriter sw = new StringWriter();

            // merge
            template.merge(context, sw);

            // get the descriptor as XML string
            String descriptorAsXMLString = sw.toString();

            // parse the descriptor XML into a jaxb object
            DogHomeConfiguration jaxbHomeDescription = this.mapper.readValue(
                    descriptorAsXMLString, DogHomeConfiguration.class);

            Device jaxbDeviceDescription = jaxbHomeDescription
                    .getControllables().get(0).getDevice().get(0);

            // create the device descriptor
            descriptor = new DeviceDescriptor(jaxbDeviceDescription);
        }

        return descriptor;
    }

}
