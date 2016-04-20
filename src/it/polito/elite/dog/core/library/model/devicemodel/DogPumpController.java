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
* DogPumpControllerModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.PumpController;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import it.polito.elite.dog.core.library.model.notification.*;
import javax.measure.Measure;

public class DogPumpController extends AbstractDevice implements PumpController
{

	public DogPumpController(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((PumpController) this.driver).getState();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel){
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
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
	/*Notification: OnNotification*/
	public void notifyOn(){
		OnNotification notificationEvent=new OnNotification();
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
	/*Notification: DeleteSceneNotification*/
	public void notifyDeletedScene(Integer sceneNumber){
		DeleteSceneNotification notificationEvent=new DeleteSceneNotification(sceneNumber );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: FlowRateMeasurementNotification*/
	public void notifyChangedFlowRateValue(Measure<?,?>  flowRateValue){
		FlowRateMeasurementNotification notificationEvent=new FlowRateMeasurementNotification(flowRateValue );
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
	/*Notification: LeaveGroupNotification*/
	public void notifyLeftGroup(Integer groupNumber){
		LeaveGroupNotification notificationEvent=new LeaveGroupNotification(groupNumber );
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
	/*Notification: PressureMeasurementNotification*/
	public void notifyNewPressureValue(Measure<?,?>  pressureValue){
		PressureMeasurementNotification notificationEvent=new PressureMeasurementNotification(pressureValue );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: TemperatureMeasurementNotification*/
	public void notifyNewTemperatureValue(Measure<?,?>  temperatureValue){
		TemperatureMeasurementNotification notificationEvent=new TemperatureMeasurementNotification(temperatureValue );
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
	/*Notification: IdentifyNotification*/
	public void notifyIdentifyMe(){
		IdentifyNotification notificationEvent=new IdentifyNotification();
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
