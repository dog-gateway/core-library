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
* DogEnergyAndPowerMeteringLevelControllableOutputModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.EnergyAndPowerMeteringLevelControllableOutput;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogEnergyAndPowerMeteringLevelControllableOutput extends AbstractDevice implements EnergyAndPowerMeteringLevelControllableOutput
{

	public DogEnergyAndPowerMeteringLevelControllableOutput(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void deleteGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).deleteGroup(groupID);
		}
	}

	public void stepUp()
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).stepUp();
		}
	}

	public Measure<?,?>  getActiveEnergyValue()
	{
		if(this.driver!=null)
		{
			return ((EnergyAndPowerMeteringLevelControllableOutput) this.driver).getActiveEnergyValue();
		}
		 return null;
	}

	public Measure<?,?>  getActivePower()
	{
		if(this.driver!=null)
		{
			return ((EnergyAndPowerMeteringLevelControllableOutput) this.driver).getActivePower();
		}
		 return null;
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((EnergyAndPowerMeteringLevelControllableOutput) this.driver).getState();
		}
		 return null;
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).on();
		}
	}

	public void set(Object value)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).set(value);
		}
	}

	public void storeGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).storeGroup(groupID);
		}
	}

	public void deleteScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).deleteScene(sceneNumber);
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).off();
		}
	}

	public void stepDown()
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).stepDown();
		}
	}

	public void storeScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((EnergyAndPowerMeteringLevelControllableOutput) this.driver).storeScene(sceneNumber);
		}
	}



	/*Generated Notifications*/

	/*Notification: SinglePhaseActivePowerMeasurementNotification*/
	public void notifyNewActivePowerValue(Measure<?,?>  powerValue, String notificationId)
	{
		SinglePhaseActivePowerMeasurementNotification notificationEvent=new SinglePhaseActivePowerMeasurementNotification(powerValue );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewActivePowerValue(Measure<?,?>  powerValue)
{
		// call the more general method with a null notification id.
		this.notifyNewActivePowerValue(powerValue , null);
	}
	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel, String notificationId)
	{
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
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
	/*Notification: LeaveGroupNotification*/
	public void notifyLeftGroup(Integer groupNumber, String notificationId)
	{
		LeaveGroupNotification notificationEvent=new LeaveGroupNotification(groupNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
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
	/*Notification: SinglePhaseActiveEnergyMeasurementNotification*/
	public void notifyNewActiveEnergyValue(Measure<?,?>  value, String notificationId)
	{
		SinglePhaseActiveEnergyMeasurementNotification notificationEvent=new SinglePhaseActiveEnergyMeasurementNotification(value );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
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
	/*Notification: OnNotification*/
	public void notifyOn(String notificationId)
	{
		OnNotification notificationEvent=new OnNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
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
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber, String notificationId)
	{
		JoinGroupNotification notificationEvent=new JoinGroupNotification(groupNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
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
	/*Notification: DeleteSceneNotification*/
	public void notifyDeletedScene(Integer sceneNumber, String notificationId)
	{
		DeleteSceneNotification notificationEvent=new DeleteSceneNotification(sceneNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(EnergyAndPowerMeteringLevelControllableOutput.class.getSimpleName());
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
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
