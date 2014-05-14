/*
 * Dog - Core
 *
 * Copyright (c) 2011-2014 Dario Bonino and Luigi De Russis
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
* DogHeatingAndCoolingUnitModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.HeatingAndCoolingUnit;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogHeatingAndCoolingUnit extends AbstractDevice implements HeatingAndCoolingUnit
{

	public DogHeatingAndCoolingUnit(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void stepDown()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).stepDown();
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((HeatingAndCoolingUnit) this.driver).getState();
		}
		 return null;
	}

	public void setSpeed(Measure<?,?>  speed)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).setSpeed(speed);
		}
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).on();
		}
	}

	public void stopHeatingOrCooling()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).stopHeatingOrCooling();
		}
	}

	public void deleteGroup(String groupID)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).deleteGroup(groupID);
		}
	}

	public void storeGroup(String groupID)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).storeGroup(groupID);
		}
	}

	public void speedDown()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).speedDown();
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).off();
		}
	}

	public void speedUp()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).speedUp();
		}
	}

	public void stepUp()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).stepUp();
		}
	}

	public void storeScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).storeScene(sceneNumber);
		}
	}

	public void deleteScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).deleteScene(sceneNumber);
		}
	}

	public void set(Object value)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).set(value);
		}
	}

	public void cool()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).cool();
		}
	}

	public void setTemperatureAt(Measure<?,?>  temperature)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).setTemperatureAt(temperature);
		}
	}

	public void heat()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).heat();
		}
	}



	/*Generated Notifications*/

	/*Notification: SpeedStepUpNotification*/
	public void notifySpeedUp(){
		SpeedStepUpNotification notificationEvent=new SpeedStepUpNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: DeleteSceneNotification*/
	public void notifyDeletedScene(Measure<?,?>  sceneNumber){
		DeleteSceneNotification notificationEvent=new DeleteSceneNotification(sceneNumber );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: LevelStepUpNotification*/
	public void notifyStepUp(){
		LevelStepUpNotification notificationEvent=new LevelStepUpNotification();
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
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber){
		JoinGroupNotification notificationEvent=new JoinGroupNotification(groupNumber );
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
	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel){
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: LevelStepDownNotification*/
	public void notifyStepDown(){
		LevelStepDownNotification notificationEvent=new LevelStepDownNotification();
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: OffNotification*/
	public void notifyOff(){
		OffNotification notificationEvent=new OffNotification();
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
	/*Notification: StoreSceneNotification*/
	public void notifyStoredScene(Integer sceneNumber){
		StoreSceneNotification notificationEvent=new StoreSceneNotification(sceneNumber );
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
	/*Notification: OnNotification*/
	public void notifyOn(){
		OnNotification notificationEvent=new OnNotification();
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
	/*Notification: SpeedControlNotification*/
	public void notifyChangedSpeed(Measure<?,?>  newSpeed){
		SpeedControlNotification notificationEvent=new SpeedControlNotification(newSpeed );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: GroupNotification*/
	public void notifyBelongToGroup(Integer groupNumber){
		GroupNotification notificationEvent=new GroupNotification(groupNumber );
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
}
