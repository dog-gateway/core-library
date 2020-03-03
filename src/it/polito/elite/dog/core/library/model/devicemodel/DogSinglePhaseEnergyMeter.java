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
* DogSinglePhaseEnergyMeterModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.SinglePhaseEnergyMeter;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogSinglePhaseEnergyMeter extends AbstractDevice implements SinglePhaseEnergyMeter
{

	public DogSinglePhaseEnergyMeter(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public Measure<?,?>  getActiveEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseEnergyMeter) this.driver).getActiveEnergyValue();
		}
		 return null;
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseEnergyMeter) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getReactiveEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseEnergyMeter) this.driver).getReactiveEnergyValue();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: SinglePhaseReactiveEnergyMeasurementNotification*/
	public void notifyNewReactiveEnergyValue(Measure<?,?>  value, String notificationId)
	{
		SinglePhaseReactiveEnergyMeasurementNotification notificationEvent=new SinglePhaseReactiveEnergyMeasurementNotification(value );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(SinglePhaseEnergyMeter.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewReactiveEnergyValue(Measure<?,?>  value)
{
		// call the more general method with a null notification id.
		this.notifyNewReactiveEnergyValue(value , null);
	}
	/*Notification: SinglePhaseActiveEnergyMeasurementNotification*/
	public void notifyNewActiveEnergyValue(Measure<?,?>  value, String notificationId)
	{
		SinglePhaseActiveEnergyMeasurementNotification notificationEvent=new SinglePhaseActiveEnergyMeasurementNotification(value );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(SinglePhaseEnergyMeter.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewActiveEnergyValue(Measure<?,?>  value)
{
		// call the more general method with a null notification id.
		this.notifyNewActiveEnergyValue(value , null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
