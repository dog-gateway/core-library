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
* DogSnapshotCameraModel - automatically generated by DogOnt2Dog
*/

import it.polito.elite.dog.core.library.model.devicecategory.SnapshotCamera;
import it.polito.elite.dog.core.library.model.AbstractDevice;
import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.DeviceDescriptor;
import org.osgi.framework.BundleContext;
import org.osgi.service.device.Device;
import java.awt.Image;
import it.polito.elite.dog.core.library.model.notification.*;
public class DogSnapshotCamera extends AbstractDevice implements SnapshotCamera
{

	public DogSnapshotCamera(BundleContext context, DeviceDescriptor deviceDescriptor)
	{
		super(context);


		this.setDeviceProperties(deviceDescriptor);


		this.registerDevice(Device.class.getName());
	}


	public void zoomOut()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).zoomOut();
		}
	}

	public void increaseContrast()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).increaseContrast();
		}
	}

	public DeviceStatus getState()
	{
		if(this.driver!=null)
		{
			return ((SnapshotCamera) this.driver).getState();
		}
		 return null;
	}

	public void panRight()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).panRight();
		}
	}

	public void increaseLuminosity()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).increaseLuminosity();
		}
	}

	public void on()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).on();
		}
	}

	public void panUp()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).panUp();
		}
	}

	public void decreaseLuminosity()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).decreaseLuminosity();
		}
	}

	public void off()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).off();
		}
	}

	public void panDown()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).panDown();
		}
	}

	public Image grabPicture()
	{
		if(this.driver!=null)
		{
			return ((SnapshotCamera) this.driver).grabPicture();
		}
		 return null;
	}

	public void increaseColor()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).increaseColor();
		}
	}

	public void panLeft()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).panLeft();
		}
	}

	public void decreaseQuality()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).decreaseQuality();
		}
	}

	public void increaseQuality()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).increaseQuality();
		}
	}

	public void decreaseColor()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).decreaseColor();
		}
	}

	public void decreaseContrast()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).decreaseContrast();
		}
	}

	public void zoomIn()
	{
		if(this.driver!=null)
		{
			((SnapshotCamera) this.driver).zoomIn();
		}
	}



	/*Generated Notifications*/

	/*Notification: OnNotification*/
	public void notifyOn(){
		OnNotification notificationEvent=new OnNotification();
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
}
