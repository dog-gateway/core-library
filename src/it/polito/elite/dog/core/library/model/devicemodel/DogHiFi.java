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
* DogHiFiModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.HiFi;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import javax.measure.Measure;

import it.polito.elite.dog.core.library.model.notification.*;
public class DogHiFi extends AbstractDevice implements HiFi
{

	public DogHiFi(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((HiFi) this.driver).getState();
		}
		 return null;
	}

	public void rew()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).rew();
		}
	}

	public void source(String source)
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).source(source);
		}
	}

	public void prev()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).prev();
		}
	}

	public void next()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).next();
		}
	}

	public void increaseVolume()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).increaseVolume();
		}
	}

	public void set(Object value)
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).set(value);
		}
	}

	public void pause()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).pause();
		}
	}

	public void timedOn(Measure<?,?>  timeToOff)
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).timedOn(timeToOff);
		}
	}

	public void setVolume(Integer volume)
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).setVolume(volume);
		}
	}

	public void standBy()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).standBy();
		}
	}

	public void decreaseVolume()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).decreaseVolume();
		}
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).on();
		}
	}

	public void stop()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).stop();
		}
	}

	public void play()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).play();
		}
	}

	public void up()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).up();
		}
	}

	public void fwd()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).fwd();
		}
	}

	public void down()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).down();
		}
	}

	public void goToTrack(Integer trackNumber)
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).goToTrack(trackNumber);
		}
	}

	public void setChannel(Integer channel)
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).setChannel(channel);
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((HiFi) this.driver).off();
		}
	}



	/*Generated Notifications*/

	/*Notification: StandByNotification*/
	public void notifyStandby(String notificationId)
	{
		StandByNotification notificationEvent=new StandByNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel, String notificationId)
	{
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
	/*Notification: SourceSelectionNotification*/
	public void notifyChangedSource(String sourceId, String notificationId)
	{
		SourceSelectionNotification notificationEvent=new SourceSelectionNotification(sourceId );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedSource(String sourceId)
{
		// call the more general method with a null notification id.
		this.notifyChangedSource(sourceId , null);
	}
	/*Notification: TuningStepUpNotification*/
	public void notifyChannelStepDown(String notificationId)
	{
		TuningStepUpNotification notificationEvent=new TuningStepUpNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
	/*Notification: StopPlaybackNotification*/
	public void notifyStop(String notificationId)
	{
		StopPlaybackNotification notificationEvent=new StopPlaybackNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
	/*Notification: RewindNotification*/
	public void notifyRew(String notificationId)
	{
		RewindNotification notificationEvent=new RewindNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyRew()
{
		// call the more general method with a null notification id.
		this.notifyRew(null);
	}
	/*Notification: TuningStepDownNotification*/
	public void notifyChannelStepUp(String notificationId)
	{
		TuningStepDownNotification notificationEvent=new TuningStepDownNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
	/*Notification: PausePlaybackNotification*/
	public void notifyPause(String notificationId)
	{
		PausePlaybackNotification notificationEvent=new PausePlaybackNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
	/*Notification: ChannelControlNotification*/
	public void notifyChangedChannel(String channelId, String notificationId)
	{
		ChannelControlNotification notificationEvent=new ChannelControlNotification(channelId );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
	/*Notification: OffNotification*/
	public void notifyOff(String notificationId)
	{
		OffNotification notificationEvent=new OffNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
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
	/*Notification: ForwardNotification*/
	public void notifyFwd(String notificationId)
	{
		ForwardNotification notificationEvent=new ForwardNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyFwd()
{
		// call the more general method with a null notification id.
		this.notifyFwd(null);
	}
	/*Notification: TrackControlNotification*/
	public void notifyChangedTrack(String trackId, String notificationId)
	{
		TrackControlNotification notificationEvent=new TrackControlNotification(trackId );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedTrack(String trackId)
{
		// call the more general method with a null notification id.
		this.notifyChangedTrack(trackId , null);
	}
	/*Notification: PlayNotification*/
	public void notifyPlay(String notificationId)
	{
		PlayNotification notificationEvent=new PlayNotification();
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(HiFi.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyPlay()
{
		// call the more general method with a null notification id.
		this.notifyPlay(null);
	}
	@Override
	public void updateStatus()
	{
		super.updateStatus();
	}
}
