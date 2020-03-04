/*
 * Dog - Core - Diagnostics
 *
 * Copyright (c) 2020 Dario Bonino
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
package it.polito.elite.dog.core.library.model.diagnostics;

/**
 * Base class for device diagnostic information exchanged over the OSGi event
 * admin.
 * 
 * @author <a href="mailto:dario.bonino@gmail.com">Dario Bonino</a>
 *
 */
public class DeviceDiagnostics<D> extends Diagnostics
{
	// the device diagnostics sub topic
	private static final String DEVICE_SUBTOPIC = "/device";

	// the device protocol
	private String protocol;

	// the device id
	private String deviceId;

	// the device class (simple name)
	private String deviceClass;

	// the device driver (simple name)
	private String deviceDriver;

	// the gateway to which the device is connected, may be null if the device
	// is a gateway
	private String deviceGateway;

	// the device connectivity
	private boolean online;

	// the protocol specific diagnostic information
	private D details;

	/**
	 * Build a new instance of {@link DeviceDiagnostics}
	 */
	public DeviceDiagnostics()
	{
		super(DEVICE_SUBTOPIC);
	}

	/**
	 * Provide the protocol used to communicate with the device. Can be used to
	 * discriminate the type of details carried by this object.
	 * 
	 * @return The protocol as a {@link String}, e.g., modbus or knx.
	 */
	public String getProtocol()
	{
		return protocol;
	}

	/**
	 * Sets the protocol used to communicate with the device. Can be used to
	 * discriminate the type of details carried by this object.
	 * 
	 * @param protocol
	 *            The protocol as a {@link String}, e.g., modbus or knx.
	 */
	public void setProtocol(String protocol)
	{
		this.protocol = protocol;
	}

	/**
	 * Provides the unique id of the device generating this diagnostic message.
	 * 
	 * @return The device id as a {@link String}.
	 */
	public String getDeviceId()
	{
		return deviceId;
	}

	/**
	 * Sets the unique id of the device generating this diagnostic message.
	 * 
	 * @param deviceId
	 *            The device id as a {@link String}.
	 */
	public void setDeviceId(String deviceId)
	{
		this.deviceId = deviceId;
	}

	/**
	 * Provides the simple name of the class of the device generating this
	 * {@link DeviceDiagnostics} information.
	 * 
	 * @return The device simple class name, obtained by calling the
	 *         {@link Class#getSimpleName()} method on the device instance.
	 */
	public String getDeviceClass()
	{
		return deviceClass;
	}

	/**
	 * Sets the simple name of the class of the device generating this
	 * {@link DeviceDiagnostics} information.
	 * 
	 * @param deviceClass
	 *            The device simple class name, obtained by calling the
	 *            {@link Class#getSimpleName()} method on the device instance.
	 */
	public void setDeviceClass(String deviceClass)
	{
		this.deviceClass = deviceClass;
	}

	/**
	 * Provides the simple name of the device driver generating this
	 * {@link DeviceDiagnostics} information.
	 * 
	 * @return The device driver class name, obtained by calling the
	 *         {@link Class#getSimpleName()} method on the driver instance.
	 */
	public String getDeviceDriver()
	{
		return deviceDriver;
	}

	/**
	 * Set the simple name of the device driver generating this
	 * {@link DeviceDiagnostics} information.
	 * 
	 * @param deviceDriver
	 *            The device driver class name, obtained by calling the
	 *            {@link Class#getSimpleName()} method on the driver instance.
	 */
	public void setDeviceDriver(String deviceDriver)
	{
		this.deviceDriver = deviceDriver;
	}

	/**
	 * Provide the identifier (human-readable, typically) of the gateway to
	 * which the device is connected.
	 * 
	 * @return The identifier of the gateway to which the device is connected.
	 */
	public String getDeviceGateway()
	{
		return deviceGateway;
	}

	/**
	 * @param deviceGateway
	 *            the deviceGateway to set
	 */
	public void setDeviceGateway(String deviceGateway)
	{
		this.deviceGateway = deviceGateway;
	}

	/**
	 * Provides the connection status of the device.
	 * 
	 * @return True if the device is reachable and transmitting data, false
	 *         otherwise.
	 */
	public boolean isOnline()
	{
		return online;
	}

	/**
	 * Sets the connection status of the device.
	 * 
	 * @param online
	 *            True if the device is reachable and transmitting data, false
	 *            otherwise.
	 */
	public void setOnline(boolean online)
	{
		this.online = online;
	}

	/**
	 * Provides the technology-specific device diagnostics details associated to
	 * the device generating this {@link DeviceDiagnostics} instance. It is
	 * typically filled by the device-specific driver handling communication to
	 * the physical device.
	 * 
	 * @return The diagnostics details.
	 */
	public D getDetails()
	{
		return details;
	}

	/**
	 * Sets the technology-specific device diagnostics details associated to the
	 * device generating this {@link DeviceDiagnostics} instance. It is
	 * typically filled by the device-specific driver handling communication to
	 * the physical device
	 * 
	 * @param details
	 *            The diagnostics details to associate to this instance.
	 */
	public void setDetails(D details)
	{
		this.details = details;
	}

}
