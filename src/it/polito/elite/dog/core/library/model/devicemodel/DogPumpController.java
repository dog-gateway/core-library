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
	public void notifyChangedLevel(Measure<?,?>  newLevel, String notificationId)
	{
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedLevel(Measure<?,?>  newLevel)
{
		// call the more general method with a null notification id.
		this.notifyChangedLevel(newLevel , null);
	}
	/*Notification: StoreSceneNotification*/
	public void notifyStoredScene(Integer sceneNumber, String notificationId)
	{
		StoreSceneNotification notificationEvent=new StoreSceneNotification(sceneNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStoredScene(Integer sceneNumber)
{
		// call the more general method with a null notification id.
		this.notifyStoredScene(sceneNumber , null);
	}
	/*Notification: LevelStepDownNotification*/
	public void notifyStepDown(String notificationId)
	{
		LevelStepDownNotification notificationEvent=new LevelStepDownNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStepDown()
{
		// call the more general method with a null notification id.
		this.notifyStepDown(null);
	}
	/*Notification: OnNotification*/
	public void notifyOn(String notificationId)
	{
		OnNotification notificationEvent=new OnNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyOn()
{
		// call the more general method with a null notification id.
		this.notifyOn(null);
	}
	/*Notification: DeleteSceneNotification*/
	public void notifyDeletedScene(Integer sceneNumber, String notificationId)
	{
		DeleteSceneNotification notificationEvent=new DeleteSceneNotification(sceneNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyDeletedScene(Integer sceneNumber)
{
		// call the more general method with a null notification id.
		this.notifyDeletedScene(sceneNumber , null);
	}
	/*Notification: FlowRateMeasurementNotification*/
	public void notifyChangedFlowRateValue(Measure<?,?>  flowRateValue, String notificationId)
	{
		FlowRateMeasurementNotification notificationEvent=new FlowRateMeasurementNotification(flowRateValue );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedFlowRateValue(Measure<?,?>  flowRateValue)
{
		// call the more general method with a null notification id.
		this.notifyChangedFlowRateValue(flowRateValue , null);
	}
	/*Notification: LevelStepUpNotification*/
	public void notifyStepUp(String notificationId)
	{
		LevelStepUpNotification notificationEvent=new LevelStepUpNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStepUp()
{
		// call the more general method with a null notification id.
		this.notifyStepUp(null);
	}
	/*Notification: LeaveGroupNotification*/
	public void notifyLeftGroup(Integer groupNumber, String notificationId)
	{
		LeaveGroupNotification notificationEvent=new LeaveGroupNotification(groupNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyLeftGroup(Integer groupNumber)
{
		// call the more general method with a null notification id.
		this.notifyLeftGroup(groupNumber , null);
	}
	/*Notification: OffNotification*/
	public void notifyOff(String notificationId)
	{
		OffNotification notificationEvent=new OffNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyOff()
{
		// call the more general method with a null notification id.
		this.notifyOff(null);
	}
	/*Notification: PressureMeasurementNotification*/
	public void notifyNewPressureValue(Measure<?,?>  pressureValue, String notificationId)
	{
		PressureMeasurementNotification notificationEvent=new PressureMeasurementNotification(pressureValue );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewPressureValue(Measure<?,?>  pressureValue)
{
		// call the more general method with a null notification id.
		this.notifyNewPressureValue(pressureValue , null);
	}
	/*Notification: TemperatureMeasurementNotification*/
	public void notifyNewTemperatureValue(Measure<?,?>  temperatureValue, String notificationId)
	{
		TemperatureMeasurementNotification notificationEvent=new TemperatureMeasurementNotification(temperatureValue );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewTemperatureValue(Measure<?,?>  temperatureValue)
{
		// call the more general method with a null notification id.
		this.notifyNewTemperatureValue(temperatureValue , null);
	}
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber, String notificationId)
	{
		JoinGroupNotification notificationEvent=new JoinGroupNotification(groupNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyJoinedGroup(Integer groupNumber)
{
		// call the more general method with a null notification id.
		this.notifyJoinedGroup(groupNumber , null);
	}
	/*Notification: IdentifyNotification*/
	public void notifyIdentifyMe(String notificationId)
	{
		IdentifyNotification notificationEvent=new IdentifyNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(PumpController.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyIdentifyMe()
{
		// call the more general method with a null notification id.
		this.notifyIdentifyMe(null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
