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

package it.polito.elite.dog.core.library.model.notification;



/**
* WaterVolumeMeasurementNotification - automatically generated by DogOnt2Dog
*/

import javax.measure.Measure;

public class WaterVolumeMeasurementNotification implements SubstanceVolumeMeasurementNotification
{
	public static String notificationName = "newWaterVolumeAmount";

	public static String notificationTopic="it/polito/elite/dog/core/library/model/notification/WaterVolumeMeasurementNotification";

	public String notificationId;

	private String deviceUri;

	private String deviceClassName;

	/**
	* Get the URI of the device who generated the notification
	* @return The device URI as a String
	*/
	public String getDeviceUri()
	{
		return this.deviceUri;
	}

	/**
	* Set the URI of the device who generated the notification
	* @param deviceUri The device URI as a String
	*/
	public void setDeviceUri(String deviceUri)
	{
		 this.deviceUri=deviceUri;
	}

	/**
	* Get the simple name of the class of the device who generated the notification
	* @return The device class as a String
	*/
	public String getDeviceClassName()
	{
		return this.deviceClassName;
	}

	/**
	* Set the simple name of the class of the device who generated the notification
	* @param deviceClassName The device class name as a String
	*/
	public void setDeviceClassName(String deviceClassName)
	{
		 this.deviceClassName=deviceClassName;
	}

	/**
	* Get the topic of this notification
	* @return The notification topic as a String
	*/
	public String getNotificationTopic()
	{
		 return WaterVolumeMeasurementNotification.notificationTopic; 
	}

	/**
	* Get the unique Id of this notification
	* @return The notification id as a String
	*/
	public String getNotificationId()
	{
		return this.notificationId;
	}

	/**
	* Set the unique Id of this notification
	* @param notificationId The notification id as a String
	*/
	public void setNotificationId(String notificationId)
	{
		this.notificationId=notificationId;
	}

	private Measure<?,?>  waterVolume;


	public WaterVolumeMeasurementNotification(Measure<?,?>  waterVolume)
	{

		this.waterVolume=waterVolume;
	}
	public Measure<?,?>  getWaterVolume(){
		return this.waterVolume;
	}

	/** Generic getNotificationValue, allows to access the value of a parametric
	* notification without knowing the parameter name
	*@return The notification value.
	*/
	public Object getNotificationValue()
	{
		return this.waterVolume;
	}


}
