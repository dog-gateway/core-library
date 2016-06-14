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
* DogSinglePhaseElectricityMeterModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.SinglePhaseElectricityMeter;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogSinglePhaseElectricityMeter extends AbstractDevice implements SinglePhaseElectricityMeter
{

	public DogSinglePhaseElectricityMeter(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public Measure<?,?>  getReactivePower()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getReactivePower();
		}
		 return null;
	}

	public Measure<?,?>  getActiveEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getActiveEnergyValue();
		}
		 return null;
	}

	public Measure<?,?>  getActivePower()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getActivePower();
		}
		 return null;
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getElectricCurrentValue()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getElectricCurrentValue();
		}
		 return null;
	}

	public Measure<?,?>  getFrequency()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getFrequency();
		}
		 return null;
	}

	public Measure<?,?>  getReactiveEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getReactiveEnergyValue();
		}
		 return null;
	}

	public Measure<?,?>  getPhaseNeutralVoltageValue()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getPhaseNeutralVoltageValue();
		}
		 return null;
	}

	public Measure<?,?>  getPowerFactor()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getPowerFactor();
		}
		 return null;
	}

	public Measure<?,?>  getApparentPower()
	{
		if(this.driver!=null)
		{
			return ((SinglePhaseElectricityMeter) this.driver).getApparentPower();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: SinglePhaseApparentPowerMeasurementNotification*/
	public void notifyNewApparentPowerValue(Measure<?,?>  powerValue){
		SinglePhaseApparentPowerMeasurementNotification notificationEvent=new SinglePhaseApparentPowerMeasurementNotification(powerValue );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SinglePhaseActivePowerMeasurementNotification*/
	public void notifyNewActivePowerValue(Measure<?,?>  powerValue){
		SinglePhaseActivePowerMeasurementNotification notificationEvent=new SinglePhaseActivePowerMeasurementNotification(powerValue );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SinglePhaseReactiveEnergyMeasurementNotification*/
	public void notifyNewReactiveEnergyValue(Measure<?,?>  value){
		SinglePhaseReactiveEnergyMeasurementNotification notificationEvent=new SinglePhaseReactiveEnergyMeasurementNotification(value );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: PowerFactorMeasurementNotification*/
	public void notifyNewPowerFactorValue(Measure<?,?>  powerFactor){
		PowerFactorMeasurementNotification notificationEvent=new PowerFactorMeasurementNotification(powerFactor );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SinglePhaseCurrentMeasurementNotification*/
	public void notifyNewCurrentValue(Measure<?,?>  value){
		SinglePhaseCurrentMeasurementNotification notificationEvent=new SinglePhaseCurrentMeasurementNotification(value );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: FrequencyMeasurementNotification*/
	public void notifyNewFrequencyValue(Measure<?,?>  frequency){
		FrequencyMeasurementNotification notificationEvent=new FrequencyMeasurementNotification(frequency );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SinglePhaseVoltageMeasurementNotification*/
	public void notifyNewPhaseNeutralVoltageValue(Measure<?,?>  lnVoltage){
		SinglePhaseVoltageMeasurementNotification notificationEvent=new SinglePhaseVoltageMeasurementNotification(lnVoltage );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SinglePhaseActiveEnergyMeasurementNotification*/
	public void notifyNewActiveEnergyValue(Measure<?,?>  value){
		SinglePhaseActiveEnergyMeasurementNotification notificationEvent=new SinglePhaseActiveEnergyMeasurementNotification(value );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SinglePhaseReactivePowerMeasurementNotification*/
	public void notifyNewReactivePowerValue(Measure<?,?>  powerValue){
		SinglePhaseReactivePowerMeasurementNotification notificationEvent=new SinglePhaseReactivePowerMeasurementNotification(powerValue );
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
