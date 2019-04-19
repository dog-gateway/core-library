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
* DogColorDimmableLightModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.ColorDimmableLight;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import it.polito.elite.dog.core.library.model.color.RGBColor;
import it.polito.elite.dog.core.library.model.color.HSBColor;
import it.polito.elite.dog.core.library.model.notification.*;
import javax.measure.Measure;

public class DogColorDimmableLight extends AbstractDevice implements ColorDimmableLight
{

	public DogColorDimmableLight(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void deleteGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).deleteGroup(groupID);
		}
	}

	public void setColorRGB(RGBColor colorRGB)
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).setColorRGB(colorRGB);
		}
	}

	public void stepUp()
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).stepUp();
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((ColorDimmableLight) this.driver).getState();
		}
		 return null;
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).on();
		}
	}

	public void set(Object value)
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).set(value);
		}
	}

	public void setColorHSB(HSBColor colorHSB)
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).setColorHSB(colorHSB);
		}
	}

	public void storeGroup(Integer groupID)
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).storeGroup(groupID);
		}
	}

	public void deleteScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).deleteScene(sceneNumber);
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).off();
		}
	}

	public void stepDown()
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).stepDown();
		}
	}

	public void storeScene(Integer sceneNumber)
	{
		if(this.driver!=null)
		{
			((ColorDimmableLight) this.driver).storeScene(sceneNumber);
		}
	}



	/*Generated Notifications*/

	/*Notification: ColorHSBNotification*/
	public void notifyChangedColorHSB(HSBColor colorHSB, String notificationId)
	{
		ColorHSBNotification notificationEvent=new ColorHSBNotification(colorHSB );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedColorHSB(HSBColor colorHSB)
{
		// call the more general method with a null notification id.
		this.notifyChangedColorHSB(colorHSB , null);
	}
	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel, String notificationId)
	{
		LevelControlNotification notificationEvent=new LevelControlNotification(newLevel );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
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
	/*Notification: ColorRGBNotification*/
	public void notifyChangedColorRGB(RGBColor colorRGB, String notificationId)
	{
		ColorRGBNotification notificationEvent=new ColorRGBNotification(colorRGB );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
		// store the notification id, if specified.
		notificationEvent.setNotificationId(notificationId);
		// Send the notification through the EventAdmin
		notifyEventAdmin(notificationEvent);
	}

	public void notifyChangedColorRGB(RGBColor colorRGB)
{
		// call the more general method with a null notification id.
		this.notifyChangedColorRGB(colorRGB , null);
	}
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber, String notificationId)
	{
		JoinGroupNotification notificationEvent=new JoinGroupNotification(groupNumber );
		// store the device uri
		notificationEvent.setDeviceUri(this.deviceId);
		// store the device class name
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
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
		notificationEvent.setDeviceClassName(ColorDimmableLight.class.getSimpleName());
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
