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
* DogGasMeterModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.GasMeter;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogGasMeter extends AbstractDevice implements GasMeter
{

	public DogGasMeter(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((GasMeter) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getM3GasConsumed()
	{
		if(this.driver!=null)
		{
			return ((GasMeter) this.driver).getM3GasConsumed();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: GasM3MeasurementNotification*/
	public void notifyNewConsumedM3GasValue(Measure<?,?>  consumedGasCubeMeters, String notificationId)
	{
		GasM3MeasurementNotification notificationEvent=new GasM3MeasurementNotification(consumedGasCubeMeters );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(GasMeter.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewConsumedM3GasValue(Measure<?,?>  consumedGasCubeMeters)
{
		// call the more general method with a null notification id.
		this.notifyNewConsumedM3GasValue(consumedGasCubeMeters , null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
