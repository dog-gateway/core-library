/*
 * Dog - Core
 *  
 * Copyright 2014 Dario Bonino 
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

import java.util.Collections;
import java.util.Map;

/**
 * The set of parameters associated to a notification or a command.
 * 
 * @author <a href="mailto:dario.bonino@gmail.com">Dario Bonino</a>
 * 
 */
public class CNParameters
{
    // the referred command or notification name
    private String name;

    // the referred command or notification unique id
    private String id;

    // the referred command or notification class, as part of the core library
    private String clazz;

    // the additional parameters which may be optionally needed to better
    // specify a command/notification
    private Map<String, String> params;

    /**
     * Create a set of parameters associated to a certain command / notification
     * 
     * @param name
     *            The command or notification name.
     * @param params
     *            The command or notification parameters.
     */
    public CNParameters(String name, Map<String, String> params)
    {
        this.name = name;
        this.params = params;
    }

    /**
     * Create a set of parameter associated to a certain command / notification
     * 
     * @param name
     *            The command or notification name.
     * @param id
     *            The command or notification unique id.
     * @param clazz
     *            The command or notification class.
     * @param params
     *            The parameters, may include name, id and class as well.
     */
    public CNParameters(String name, String id, String clazz,
            Map<String, String> params)
    {
        this.name = name;
        this.id = id;
        this.clazz = clazz;
        this.params = params;
    }

    /**
     * Replaces the current parameter map with the given one.
     * 
     * @param elementParams
     *            the parameter Map to store.
     */
    public void setParameters(Map<String, String> elementParams)
    {
        this.params = elementParams;
    }

    /**
     * Provides back a read-only copy of the parameter map used by this object.
     * 
     * @return the read only parameter map.
     */
    public Map<String, String> getParameters()
    {
        return Collections.unmodifiableMap(this.params);
    }

    /**
     * Provides the unique id of the command/notification to which this instance
     * refers.
     * 
     * @return the id as a {@link String}.
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the unique id of the command/notification to which this instance
     * refers.
     * 
     * @param id
     *            the unique id as a {@link String}
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * Provides the simple name of the corelibrary class of the notification to
     * which this instance refers.
     * 
     * @return The simple name of the corelibrary class.
     */
    public String getClazz()
    {
        return clazz;
    }

    /**
     * Sets the simple name of the corelibrary class of the notification to
     * which this instance refers.
     * 
     * @param clazz
     *            The simple name of the corelibrary class.
     */
    public void setClazz(String clazz)
    {
        this.clazz = clazz;
    }

    /**
     * Provides the name of the command / notification described by an instance
     * of this class.
     * 
     * @return The command / notification name.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Sets the name of the command / notification described by an instance of
     * this class.
     * 
     * @param name
     *            The command / notification name.
     */
    public void setName(String name)
    {
        this.name = name;
    }

}
