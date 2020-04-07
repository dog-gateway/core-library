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
* DogSinglePhaseReactivePowerMeterModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.SinglePhaseReactivePowerMeter;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogSinglePhaseReactivePowerMeter extends AbstractDevice implements SinglePhaseReactivePowerMeter
{

	public DogSinglePhaseReactivePowerMeter(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public Measure<?,?>  getReactivePower()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseReactivePowerMeter) this.driver).getReactivePower();
		}
		 return null;
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseReactivePowerMeter) this.driver).getState();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: SinglePhaseReactivePowerMeasurementNotification*/
	public void notifyNewReactivePowerValue(Measure<?,?>  powerValue, String notificationId)
	{
		SinglePhaseReactivePowerMeasurementNotification notificationEvent=new SinglePhaseReactivePowerMeasurementNotification(powerValue );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(SinglePhaseReactivePowerMeter.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewReactivePowerValue(Measure<?,?>  powerValue)
{
		// call the more general method with a null notification id.
		this.notifyNewReactivePowerValue(powerValue , null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
