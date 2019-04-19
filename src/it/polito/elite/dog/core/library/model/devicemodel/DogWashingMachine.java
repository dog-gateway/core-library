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
* DogWashingMachineModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.WashingMachine;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogWashingMachine extends AbstractDevice implements WashingMachine
{

	public DogWashingMachine(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void start()
	{
		if(this.driver!=null)
		{
			((WashingMachine) this.driver).start();
		}
	}

	public Measure<?,?>  getStartTime()
	{
		if(this.driver!=null)
		{
			return ((WashingMachine) this.driver).getStartTime();
		}
		 return null;
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((WashingMachine) this.driver).getState();
		}
		 return null;
	}

	public void standBy()
	{
		if(this.driver!=null)
		{
			((WashingMachine) this.driver).standBy();
		}
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((WashingMachine) this.driver).on();
		}
	}

	public Measure<?,?>  getRemainingTime()
	{
		if(this.driver!=null)
		{
			return ((WashingMachine) this.driver).getRemainingTime();
		}
		 return null;
	}

	public void stop()
	{
		if(this.driver!=null)
		{
			((WashingMachine) this.driver).stop();
		}
	}

	public Measure<?,?>  getEndTime()
	{
		if(this.driver!=null)
		{
			return ((WashingMachine) this.driver).getEndTime();
		}
		 return null;
	}

	public void setStartTime(Measure<?,?>  endTime, Measure<?,?>  remainingTime, Measure<?,?>  startTime)
	{
		if(this.driver!=null)
		{
			((WashingMachine) this.driver).setStartTime(endTime, remainingTime, startTime);
		}
	}

	public Object[] getEventsAndAlerts()
	{
		if(this.driver!=null)
		{
			return ((WashingMachine) this.driver).getEventsAndAlerts();
		}
		 return null;
	}

	public void pause()
	{
		if(this.driver!=null)
		{
			((WashingMachine) this.driver).pause();
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((WashingMachine) this.driver).off();
		}
	}



	/*Generated Notifications*/

	/*Notification: EventNotification*/
	public void notifyNewEvent(Object event, String notificationId)
	{
		EventNotification notificationEvent=new EventNotification(event );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewEvent(Object event)
{
		// call the more general method with a null notification id.
		this.notifyNewEvent(event , null);
	}
	/*Notification: StandByNotification*/
	public void notifyStandby(String notificationId)
	{
		StandByNotification notificationEvent=new StandByNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStandby()
{
		// call the more general method with a null notification id.
		this.notifyStandby(null);
	}
	/*Notification: AlertNotification*/
	public void notifyNewAlert(Object alert, String notificationId)
	{
		AlertNotification notificationEvent=new AlertNotification(alert );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewAlert(Object alert)
{
		// call the more general method with a null notification id.
		this.notifyNewAlert(alert , null);
	}
	/*Notification: PauseApplianceNotification*/
	public void notifyPause(String notificationId)
	{
		PauseApplianceNotification notificationEvent=new PauseApplianceNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyPause()
{
		// call the more general method with a null notification id.
		this.notifyPause(null);
	}
	/*Notification: StopApplianceNotification*/
	public void notifyStop(String notificationId)
	{
		StopApplianceNotification notificationEvent=new StopApplianceNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStop()
{
		// call the more general method with a null notification id.
		this.notifyStop(null);
	}
	/*Notification: OnNotification*/
	public void notifyOn(String notificationId)
	{
		OnNotification notificationEvent=new OnNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
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
	/*Notification: MultipleEventNotification*/
	public void notifyNewEventSet(Object[] events, String notificationId)
	{
		MultipleEventNotification notificationEvent=new MultipleEventNotification(events );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewEventSet(Object[] events)
{
		// call the more general method with a null notification id.
		this.notifyNewEventSet(events , null);
	}
	/*Notification: StoppedWashingNotification*/
	public void notifyStoppedWashOrRinseCycle(String notificationId)
	{
		StoppedWashingNotification notificationEvent=new StoppedWashingNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStoppedWashOrRinseCycle()
{
		// call the more general method with a null notification id.
		this.notifyStoppedWashOrRinseCycle(null);
	}
	/*Notification: RemainingTimeChangedNotification*/
	public void notifyChangedRemainingTime(Measure<?,?>  remainingTime, String notificationId)
	{
		RemainingTimeChangedNotification notificationEvent=new RemainingTimeChangedNotification(remainingTime );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedRemainingTime(Measure<?,?>  remainingTime)
{
		// call the more general method with a null notification id.
		this.notifyChangedRemainingTime(remainingTime , null);
	}
	/*Notification: OffNotification*/
	public void notifyOff(String notificationId)
	{
		OffNotification notificationEvent=new OffNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
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
	/*Notification: MultipleAlertNotification*/
	public void notifyNewAlertSet(Object[] alerts, String notificationId)
	{
		MultipleAlertNotification notificationEvent=new MultipleAlertNotification(alerts );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyNewAlertSet(Object[] alerts)
{
		// call the more general method with a null notification id.
		this.notifyNewAlertSet(alerts , null);
	}
	/*Notification: StartedHeatingCycleNotification*/
	public void notifyStartedHeatingCycle(String notificationId)
	{
		StartedHeatingCycleNotification notificationEvent=new StartedHeatingCycleNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStartedHeatingCycle()
{
		// call the more general method with a null notification id.
		this.notifyStartedHeatingCycle(null);
	}
	/*Notification: StartApplianceNotification*/
	public void notifyStart(String notificationId)
	{
		StartApplianceNotification notificationEvent=new StartApplianceNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStart()
{
		// call the more general method with a null notification id.
		this.notifyStart(null);
	}
	/*Notification: StartedWashingNotification*/
	public void notifyStartedWashOrRinseCycle(String notificationId)
	{
		StartedWashingNotification notificationEvent=new StartedWashingNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStartedWashOrRinseCycle()
{
		// call the more general method with a null notification id.
		this.notifyStartedWashOrRinseCycle(null);
	}
	/*Notification: EndTimeChangedNotification*/
	public void notifyChangedEndTime(Measure<?,?>  endTime, String notificationId)
	{
		EndTimeChangedNotification notificationEvent=new EndTimeChangedNotification(endTime );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedEndTime(Measure<?,?>  endTime)
{
		// call the more general method with a null notification id.
		this.notifyChangedEndTime(endTime , null);
	}
	/*Notification: StoppedHeatingCycleNotification*/
	public void notifyStoppedHeatingCycle(String notificationId)
	{
		StoppedHeatingCycleNotification notificationEvent=new StoppedHeatingCycleNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyStoppedHeatingCycle()
{
		// call the more general method with a null notification id.
		this.notifyStoppedHeatingCycle(null);
	}
	/*Notification: StartTimeChangedNotification*/
	public void notifyChangedStartTime(Measure<?,?>  startTime, String notificationId)
	{
		StartTimeChangedNotification notificationEvent=new StartTimeChangedNotification(startTime );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(WashingMachine.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedStartTime(Measure<?,?>  startTime)
{
		// call the more general method with a null notification id.
		this.notifyChangedStartTime(startTime , null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
