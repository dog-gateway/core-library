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
* DogCookerModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.Cooker;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogCooker extends AbstractDevice implements Cooker
{

	public DogCooker(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public Measure<?,?>  getRemainingTime()
	{
		if(this.driver!=null)
		{
			return ((Cooker) this.driver).getRemainingTime();
		}
		 return null;
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((Cooker) this.driver).getState();
		}
		 return null;
	}

	public Measure<?,?>  getEndTime()
	{
		if(this.driver!=null)
		{
			return ((Cooker) this.driver).getEndTime();
		}
		 return null;
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((Cooker) this.driver).on();
		}
	}

	public Object[] getEventsAndAlerts()
	{
		if(this.driver!=null)
		{
			return ((Cooker) this.driver).getEventsAndAlerts();
		}
		 return null;
	}

	public void setStartTime(Measure<?,?>  remainingTime, Measure<?,?>  endTime, Measure<?,?>  startTime)
	{
		if(this.driver!=null)
		{
			((Cooker) this.driver).setStartTime(remainingTime, endTime, startTime);
		}
	}

	public void standBy()
	{
		if(this.driver!=null)
		{
			((Cooker) this.driver).standBy();
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((Cooker) this.driver).off();
		}
	}

	public Measure<?,?>  getStartTime()
	{
		if(this.driver!=null)
		{
			return ((Cooker) this.driver).getStartTime();
		}
		 return null;
	}



	/*Generated Notifications*/

	/*Notification: MultipleEventNotification*/
	public void notifyNewEventSet(Object[] events){
		MultipleEventNotification notificationEvent=new MultipleEventNotification(events );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: MultipleAlertNotification*/
	public void notifyNewAlertSet(Object[] alerts){
		MultipleAlertNotification notificationEvent=new MultipleAlertNotification(alerts );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: EventNotification*/
	public void notifyNewEvent(Object event){
		EventNotification notificationEvent=new EventNotification(event );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: AlertNotification*/
	public void notifyNewAlert(Object alert){
		AlertNotification notificationEvent=new AlertNotification(alert );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: StartTimeChangedNotification*/
	public void notifyChangedStartTime(Measure<?,?>  startTime){
		StartTimeChangedNotification notificationEvent=new StartTimeChangedNotification(startTime );
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
	/*Notification: EndTimeChangedNotification*/
	public void notifyChangedEndTime(Measure<?,?>  endTime){
		EndTimeChangedNotification notificationEvent=new EndTimeChangedNotification(endTime );
		notificationEvent.setDeviceUri(this.deviceId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}
	/*Notification: RemainingTimeChangedNotification*/
	public void notifyChangedRemainingTime(Measure<?,?>  remainingTime){
		RemainingTimeChangedNotification notificationEvent=new RemainingTimeChangedNotification(remainingTime );
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
	/*Notification: StandByNotification*/
	public void notifyStandby(){
		StandByNotification notificationEvent=new StandByNotification();
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
