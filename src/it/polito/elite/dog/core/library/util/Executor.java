/*
 * Dog - Core
 * 
 * Copyright (c) 2013 Luigi De Russis
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
package it.polito.elite.dog.core.library.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import it.polito.elite.dog.core.library.model.DeviceCostants;

import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.device.Constants;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Helper for avoiding code duplication for executing commands (on active
 * devices) in Dog.
 * 
 * @author <a href="mailto:luigi.derussis@polito.it">Luigi De Russis</a>
 * @see <a href="http://elite.polito.it">http://elite.polito.it</a>
 * 
 */
public class Executor
{
	// static reference
	private static Executor theInstance;

	/**
	 * Default (empty) constructor
	 */
	private Executor()
	{
		// intentionally left empty
	}

	/**
	 * Get the instance for the singleton class
	 * 
	 * @return an Executor instance
	 */
	public static synchronized Executor getInstance()
	{
		if (theInstance == null)
			theInstance = new Executor();

		return theInstance;
	}

	/**
	 * Execute a given command to a specified device
	 * 
	 * @param context
	 *            the OSGi context
	 * @param toDevice
	 *            the device to command
	 * @param commandName
	 *            the name of the command (e.g., on)
	 * @param params
	 *            optional parameters for the command (e.g., 50.0)
	 * @throws InvalidSyntaxException
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public Object execute(BundleContext context, String toDevice,
			String commandName, Object[] params)
			throws InvalidSyntaxException, ClassNotFoundException,
			NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException
	{
		// the call result
		Object result = null;

		// create filter
		String deviceFilter = String.format("(&(%s=*)(%s=%s))",
				Constants.DEVICE_CATEGORY, DeviceCostants.DEVICEURI, toDevice);
		// get the device
		ServiceTracker<?, ?> tracker;

		tracker = new ServiceTracker<Object, Object>(context,
				context.createFilter(deviceFilter), null);
		tracker.open();
		ServiceReference<?> srDevice = tracker.getServiceReference();

		if (srDevice != null)
		{
			String active = (String) srDevice
					.getProperty(DeviceCostants.ACTIVE);
			String deviceClass = (String) srDevice
					.getProperty(Constants.DEVICE_CATEGORY);
			// check if the device is active
			if (active != null && !active.isEmpty() && active.equals("true"))
			{
				// get the device object
				Object deviceObj = tracker.getService();

				// get the class
				Class<?> cls = Class.forName(deviceClass);

				// get the method corresponding to the desired command...
				Method meth = null;

				meth = cls.getDeclaredMethod(commandName,
						this.objectToClassArray(params));

				// execute the command
				if (meth != null)
					result = meth.invoke(deviceObj, params);
			}
		}

		return result;
	}

	/**
	 * This static function converts an array of object instances in an array of
	 * the class of the instances <br/>
	 * e.g. from "Hello World", 100.0, -100 to String, Double, Integer
	 * 
	 * @param parameters
	 *            array of instances
	 * @return array with the classes of instances
	 */
	private Class<?>[] objectToClassArray(Object[] parameters)
	{
		Class<?> partypes[] = null;
		if (parameters != null)
		{
			partypes = new Class[parameters.length];

			for (int i = 0; i < parameters.length; i++)
			{
				partypes[i] = parameters[i].getClass();
			}
		}
		return partypes;
	}

}
