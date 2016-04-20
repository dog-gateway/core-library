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
* DogHumiditySensorModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.HumiditySensor;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogHumiditySensor extends AbstractDevice implements HumiditySensor
{

	public DogHumiditySensor(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((HumiditySensor) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getRelativeHumidity()
	{
		if(this.driver!=null)
		{
			return ((HumiditySensor) this.driver).getRelativeHumidity();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: HumidityMeasurementNotification*/
	public void notifyChangedRelativeHumidity(Measure<?,?>  relativeHumidity){
		HumidityMeasurementNotification notificationEvent=new HumidityMeasurementNotification(relativeHumidity );
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
