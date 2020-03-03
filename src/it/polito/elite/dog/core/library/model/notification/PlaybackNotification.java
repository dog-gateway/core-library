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
* PlaybackNotification - automatically generated by DogOnt2Dog
*/

public interface PlaybackNotification extends NonParametricNotification
{
	/**
	* Get the URI of the device who generated the notification
	* @return The device URI as a String
	*/
	public String getDeviceUri();

	/**
	* Set the URI of the device who generated the notification
	* @param deviceUri The device URI as a String
	*/
	public void setDeviceUri(String deviceUri);

	/**
	* Get the simple name of the class of the device who generated the notification
	* @return The device class as a String
	*/
	public String getDeviceClassName();

	/**
	* Set the simple name of the class of the device who generated the notification
	* @param deviceClassName The device class name as a String
	*/
	public void setDeviceClassName(String deviceClassName);

	/**
	* Get the topic of this notification
	* @return The notification topic as a String
	*/
	public String getNotificationTopic();

	/**
	* Get the unique Id of this notification
	* @return The notification id as a String
	*/
	public String getNotificationId();

	/**
	* Set the unique Id of this notification
	* @param notificationId The notification id as a String
	*/
	public void setNotificationId(String notificationId);


}
