/*
 * Dog - Core
 *
 * Copyright (c) 2011-2020 Dario Bonino and Luigi De Russis
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
//
// Automatically generated by the DogOnt2Dog utility
//

package it.polito.elite.dog.core.library.model.devicemodel;


 
/**
* DogBluetoothAdapterModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.BluetoothAdapter;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import it.polito.elite.dog.core.library.model.notification.*;
public class DogBluetoothAdapter extends AbstractDevice implements BluetoothAdapter
{

	public DogBluetoothAdapter(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((BluetoothAdapter) this.driver).getState();
		}
		 return null;
	}

	public void stopDiscovery()
	{
		if(this.driver!=null)
		{
			((BluetoothAdapter) this.driver).stopDiscovery();
		}
	}

	public void startDiscovery()
	{
		if(this.driver!=null)
		{
			((BluetoothAdapter) this.driver).startDiscovery();
		}
	}



	/*Generated Notifications*/

	/*Notification: DiscoveryActiveNotification*/
	public void notifyActivatedDiscovery(String notificationId)
	{
		DiscoveryActiveNotification notificationEvent=new DiscoveryActiveNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(BluetoothAdapter.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyActivatedDiscovery()
{
		// call the more general method with a null notification id.
		this.notifyActivatedDiscovery(null);
	}
	/*Notification: DiscoveryIdleNotification*/
	public void notifyDeactivatedDiscovery(String notificationId)
	{
		DiscoveryIdleNotification notificationEvent=new DiscoveryIdleNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(BluetoothAdapter.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyDeactivatedDiscovery()
{
		// call the more general method with a null notification id.
		this.notifyDeactivatedDiscovery(null);
	}
	/*Notification: DeviceDiscoveredNotification*/
	public void notifyDiscoveredDevice(String discoveredDeviceName, int discoveredDeviceRSSI, String discoveredDeviceMac, String notificationId)
	{
		DeviceDiscoveredNotification notificationEvent=new DeviceDiscoveredNotification(discoveredDeviceName , discoveredDeviceRSSI , discoveredDeviceMac );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(BluetoothAdapter.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyDiscoveredDevice(String discoveredDeviceName, int discoveredDeviceRSSI, String discoveredDeviceMac)
{
		// call the more general method with a null notification id.
		this.notifyDiscoveredDevice(discoveredDeviceName , discoveredDeviceRSSI , discoveredDeviceMac , null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
