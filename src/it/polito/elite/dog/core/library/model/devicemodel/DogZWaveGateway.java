/*
 * Dog - Core
 *
 * Copyright (c) 2011-2016 Dario Bonino and Luigi De Russis
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
* DogZWaveGatewayModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.ZWaveGateway;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import it.polito.elite.dog.core.library.model.notification.*;
public class DogZWaveGateway extends AbstractDevice implements ZWaveGateway
{

	public DogZWaveGateway(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void disassociate()
	{
		if(this.driver!=null)
		{
			((ZWaveGateway) this.driver).disassociate();
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((ZWaveGateway) this.driver).getState();
		}
		 return null;
	}

	public void associate()
	{
		if(this.driver!=null)
		{
			((ZWaveGateway) this.driver).associate();
		}
	}



	/*Generated Notifications*/

	/*Notification: AssociatingDeviceNotification*/
	public void notifyAssociating(){
		AssociatingDeviceNotification notificationEvent=new AssociatingDeviceNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: IdleNotification*/
	public void notifyIdle(){
		IdleNotification notificationEvent=new IdleNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: DisassociatingDeviceNotification*/
	public void notifyDisassociating(){
		DisassociatingDeviceNotification notificationEvent=new DisassociatingDeviceNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
