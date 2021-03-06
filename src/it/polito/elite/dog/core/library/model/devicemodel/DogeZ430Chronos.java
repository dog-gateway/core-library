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
* DogeZ430ChronosModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.eZ430Chronos;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import it.polito.elite.dog.core.library.model.notification.*;
import javax.measure.Measure;

public class DogeZ430Chronos extends AbstractDevice implements eZ430Chronos
{

	public DogeZ430Chronos(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((eZ430Chronos) this.driver).getState();
		}
		 return null;
	}

	public void stop()
	{
		if(this.driver!=null)
		{
			((eZ430Chronos) this.driver).stop();
		}
	}

	public void display(String msg)
	{
		if(this.driver!=null)
		{
			((eZ430Chronos) this.driver).display(msg);
		}
	}

	public void play()
	{
		if(this.driver!=null)
		{
			((eZ430Chronos) this.driver).play();
		}
	}



	/*Generated Notifications*/

	/*Notification: TridimensionalAccelerationNotification*/
	public void notifyNew3DAccelerationValue(Measure<?,?>  accY, Measure<?,?>  accZ, Measure<?,?>  accX, String notificationId)
	{
		TridimensionalAccelerationNotification notificationEvent=new TridimensionalAccelerationNotification(accY , accZ , accX );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(eZ430Chronos.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNew3DAccelerationValue(Measure<?,?>  accY, Measure<?,?>  accZ, Measure<?,?>  accX)
{
		// call the more general method with a null notification id.
		this.notifyNew3DAccelerationValue(accY , accZ , accX , null);
	}
	/*Notification: ReleasedMNotification*/
	public void notifyReleased(String buttonID, String notificationId)
	{
		ReleasedMNotification notificationEvent=new ReleasedMNotification(buttonID );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(eZ430Chronos.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyReleased(String buttonID)
{
		// call the more general method with a null notification id.
		this.notifyReleased(buttonID , null);
	}
	/*Notification: PressedMNotification*/
	public void notifyPressed(String buttonID, String notificationId)
	{
		PressedMNotification notificationEvent=new PressedMNotification(buttonID );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(eZ430Chronos.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyPressed(String buttonID)
{
		// call the more general method with a null notification id.
		this.notifyPressed(buttonID , null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
