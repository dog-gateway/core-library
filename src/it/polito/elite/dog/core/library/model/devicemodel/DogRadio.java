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
* DogRadioModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.Radio;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import it.polito.elite.dog.core.library.model.notification.*;
import javax.measure.Measure;

public class DogRadio extends AbstractDevice implements Radio
{

	public DogRadio(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void setVolume(Integer volume)
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).setVolume(volume);
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((Radio) this.driver).getState();
		}
		 return null;
	}

	public void standBy()
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).standBy();
		}
	}

	public void decreaseVolume()
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).decreaseVolume();
		}
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).on();
		}
	}

	public void increaseVolume()
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).increaseVolume();
		}
	}

	public void up()
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).up();
		}
	}

	public void set(Object value)
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).set(value);
		}
	}

	public void down()
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).down();
		}
	}

	public void setChannel(Integer channel)
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).setChannel(channel);
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((Radio) this.driver).off();
		}
	}



	/*Generated Notifications*/

	/*Notification: ChannelControlNotification*/
	public void notifyChangedChannel(String channelId, String notificationId)
	{
		ChannelControlNotification notificationEvent=new ChannelControlNotification(channelId );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(Radio.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedChannel(String channelId)
{
		// call the more general method with a null notification id.
		this.notifyChangedChannel(channelId , null);
	}
	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel, String notificationId)
	{
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(Radio.class.getSimpleName());
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
	/*Notification: StandByNotification*/
	public void notifyStandby(String notificationId)
	{
		StandByNotification notificationEvent=new StandByNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(Radio.class.getSimpleName());
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
	/*Notification: TuningStepUpNotification*/
	public void notifyChannelStepDown(String notificationId)
	{
		TuningStepUpNotification notificationEvent=new TuningStepUpNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(Radio.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChannelStepDown()
{
		// call the more general method with a null notification id.
		this.notifyChannelStepDown(null);
	}
	/*Notification: OffNotification*/
	public void notifyOff(String notificationId)
	{
		OffNotification notificationEvent=new OffNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(Radio.class.getSimpleName());
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
	/*Notification: OnNotification*/
	public void notifyOn(String notificationId)
	{
		OnNotification notificationEvent=new OnNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(Radio.class.getSimpleName());
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
	/*Notification: TuningStepDownNotification*/
	public void notifyChannelStepUp(String notificationId)
	{
		TuningStepDownNotification notificationEvent=new TuningStepDownNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(Radio.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChannelStepUp()
{
		// call the more general method with a null notification id.
		this.notifyChannelStepUp(null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
