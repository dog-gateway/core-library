/*
 * Dog - Core
 *
 * Copyright (c) 2011-2019 Dario Bonino and Luigi De Russis
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
* DogSinglePhaseApparentEnergyMeterModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.SinglePhaseApparentEnergyMeter;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogSinglePhaseApparentEnergyMeter extends AbstractDevice implements SinglePhaseApparentEnergyMeter
{

	public DogSinglePhaseApparentEnergyMeter(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseApparentEnergyMeter) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getApparentEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseApparentEnergyMeter) this.driver).getApparentEnergyValue();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: SinglePhaseApparentEnergyMeasurementNotification*/
	public void notifyNewApparentEnergyValue(Measure<?,?>  value, String notificationId)
	{
		SinglePhaseApparentEnergyMeasurementNotification notificationEvent=new SinglePhaseApparentEnergyMeasurementNotification(value );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(SinglePhaseApparentEnergyMeter.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewApparentEnergyValue(Measure<?,?>  value)
{
		// call the more general method with a null notification id.
		this.notifyNewApparentEnergyValue(value , null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}