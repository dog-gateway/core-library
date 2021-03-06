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


	public void speedDown()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).speedDown();
		}
	}

	public void speedUp()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).speedUp();
		}
	}

	public void deleteGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).deleteGroup(groupID);
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

	public void cool()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).cool();
		}
	}

	public void heat()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).heat();
		}
	}

	public void set(Object value)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).set(value);
		}
	}

	public void storeGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).storeGroup(groupID);
		}
	}

	public void stepDown()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).stepDown();
		}
	}

	public void stepUp()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).stepUp();
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

	public void setSpeed(Measure<?,?>  speed)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).setSpeed(speed);
		}
	}

	public void deleteScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).deleteScene(sceneNumber);
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).off();
		}
	}

	public void setTemperatureAt(Measure<?,?>  temperature)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).setTemperatureAt(temperature);
		}
	}

	public void storeScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((HeatingAndCoolingUnit) this.driver).storeScene(sceneNumber);
		}
	}



	/*Generated Notifications*/

	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel, String notificationId)
	{
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
	/*Notification: SpeedControlNotification*/
	public void notifyChangedSpeed(Measure<?,?>  newSpeed, String notificationId)
	{
		SpeedControlNotification notificationEvent=new SpeedControlNotification(newSpeed );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedSpeed(Measure<?,?>  newSpeed)
{
		// call the more general method with a null notification id.
		this.notifyChangedSpeed(newSpeed , null);
	}
	/*Notification: StoreSceneNotification*/
	public void notifyStoredScene(Integer sceneNumber, String notificationId)
	{
		StoreSceneNotification notificationEvent=new StoreSceneNotification(sceneNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
	/*Notification: SpeedStepDownNotification*/
	public void notifySpeedDown(String notificationId)
	{
		SpeedStepDownNotification notificationEvent=new SpeedStepDownNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifySpeedDown()
{
		// call the more general method with a null notification id.
		this.notifySpeedDown(null);
	}
	/*Notification: ChangedDesiredTemperatureNotification*/
	public void notifyChangedDesiredTemperatureSetting(Measure<?,?>  newTemperatureValue, String notificationId)
	{
		ChangedDesiredTemperatureNotification notificationEvent=new ChangedDesiredTemperatureNotification(newTemperatureValue );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedDesiredTemperatureSetting(Measure<?,?>  newTemperatureValue)
{
		// call the more general method with a null notification id.
		this.notifyChangedDesiredTemperatureSetting(newTemperatureValue , null);
	}
	/*Notification: LevelStepDownNotification*/
	public void notifyStepDown(String notificationId)
	{
		LevelStepDownNotification notificationEvent=new LevelStepDownNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
	/*Notification: LevelStepUpNotification*/
	public void notifyStepUp(String notificationId)
	{
		LevelStepUpNotification notificationEvent=new LevelStepUpNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
	/*Notification: CoolNotification*/
	public void notifyCool(String notificationId)
	{
		CoolNotification notificationEvent=new CoolNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyCool()
{
		// call the more general method with a null notification id.
		this.notifyCool(null);
	}
	/*Notification: OffNotification*/
	public void notifyOff(String notificationId)
	{
		OffNotification notificationEvent=new OffNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
	/*Notification: SpeedStepUpNotification*/
	public void notifySpeedUp(String notificationId)
	{
		SpeedStepUpNotification notificationEvent=new SpeedStepUpNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifySpeedUp()
{
		// call the more general method with a null notification id.
		this.notifySpeedUp(null);
	}
	/*Notification: StopHeatingCoolingNotification*/
	public void notifyStoppedHeatingOrCooling(String notificationId)
	{
		StopHeatingCoolingNotification notificationEvent=new StopHeatingCoolingNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStoppedHeatingOrCooling()
{
		// call the more general method with a null notification id.
		this.notifyStoppedHeatingOrCooling(null);
	}
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber, String notificationId)
	{
		JoinGroupNotification notificationEvent=new JoinGroupNotification(groupNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
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
	/*Notification: HeatNotification*/
	public void notifyHeat(String notificationId)
	{
		HeatNotification notificationEvent=new HeatNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HeatingAndCoolingUnit.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyHeat()
{
		// call the more general method with a null notification id.
		this.notifyHeat(null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
