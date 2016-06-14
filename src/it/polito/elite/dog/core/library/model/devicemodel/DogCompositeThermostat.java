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
* DogCompositeThermostatModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.CompositeThermostat;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogCompositeThermostat extends AbstractDevice implements CompositeThermostat
{

	public DogCompositeThermostat(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void deleteGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((CompositeThermostat) this.driver).deleteGroup(groupID);
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((CompositeThermostat) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getSetpointTemperature()
	{
		if(this.driver!=null)
		{
			return ((CompositeThermostat) this.driver).getSetpointTemperature();
		}
		 return null;
	}

	public void cool()
	{
		if(this.driver!=null)
		{
			((CompositeThermostat) this.driver).cool();
		}
	}

	public Boolean getOccupancy()
	{
		if(this.driver!=null)
		{
			return ((CompositeThermostat) this.driver).getOccupancy();
		}
		 return null;
	}

	public void heat()
	{
		if(this.driver!=null)
		{
			((CompositeThermostat) this.driver).heat();
		}
	}

	public void stopHeatingOrCooling()
	{
		if(this.driver!=null)
		{
			((CompositeThermostat) this.driver).stopHeatingOrCooling();
		}
	}

	public Measure<?,?>  getTemperature()
	{
		if(this.driver!=null)
		{
			return ((CompositeThermostat) this.driver).getTemperature();
		}
		 return null;
	}

	public void storeGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((CompositeThermostat) this.driver).storeGroup(groupID);
		}
	}

	public void deleteScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((CompositeThermostat) this.driver).deleteScene(sceneNumber);
		}
	}

	public void setTemperatureAt(Measure<?,?>  temperature)
	{
		if(this.driver!=null)
		{
			((CompositeThermostat) this.driver).setTemperatureAt(temperature);
		}
	}

	public void storeScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((CompositeThermostat) this.driver).storeScene(sceneNumber);
		}
	}



	/*Generated Notifications*/

	/*Notification: SpeedControlNotification*/
	public void notifyChangedSpeed(Measure<?,?>  newSpeed){
		SpeedControlNotification notificationEvent=new SpeedControlNotification(newSpeed );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: LeaveGroupNotification*/
	public void notifyLeftGroup(Integer groupNumber){
		LeaveGroupNotification notificationEvent=new LeaveGroupNotification(groupNumber );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: CoolNotification*/
	public void notifyCool(){
		CoolNotification notificationEvent=new CoolNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SpeedStepDownNotification*/
	public void notifySpeedDown(){
		SpeedStepDownNotification notificationEvent=new SpeedStepDownNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: ChangedDesiredTemperatureNotification*/
	public void notifyChangedDesiredTemperatureSetting(Measure<?,?>  newTemperatureValue){
		ChangedDesiredTemperatureNotification notificationEvent=new ChangedDesiredTemperatureNotification(newTemperatureValue );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: HumidityMeasurementNotification*/
	public void notifyChangedRelativeHumidity(Measure<?,?>  relativeHumidity){
		HumidityMeasurementNotification notificationEvent=new HumidityMeasurementNotification(relativeHumidity );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: SpeedStepUpNotification*/
	public void notifySpeedUp(){
		SpeedStepUpNotification notificationEvent=new SpeedStepUpNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StopHeatingCoolingNotification*/
	public void notifyStoppedHeatingOrCooling(){
		StopHeatingCoolingNotification notificationEvent=new StopHeatingCoolingNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber){
		JoinGroupNotification notificationEvent=new JoinGroupNotification(groupNumber );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: HeatNotification*/
	public void notifyHeat(){
		HeatNotification notificationEvent=new HeatNotification();
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
