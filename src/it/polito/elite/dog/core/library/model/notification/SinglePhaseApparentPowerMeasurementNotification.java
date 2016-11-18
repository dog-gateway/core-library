/*
 * Dog - Core
 *
 * Copyright (c) 2011-2016 Dario Bonino and Luigi De Russis
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
* SinglePhaseApparentPowerMeasurementNotification - automatically generated by DogOnt2Dog
*/

import javax.measure.Measure;

public class SinglePhaseApparentPowerMeasurementNotification implements PowerMeasurementNotification
{
	public static String notificationName = "newApparentPowerValue";

	public static String notificationTopic="it/polito/elite/dog/core/library/model/notification/SinglePhaseApparentPowerMeasurementNotification";

	private String deviceUri;

	public String getDeviceUri()
	{
		return this.deviceUri;
	}
	public void setDeviceUri(String deviceUri)
	{
		 this.deviceUri=deviceUri;
	}
	public String getNotificationTopic()
	{
		 return SinglePhaseApparentPowerMeasurementNotification.notificationTopic; 
	}
	private Measure<?,?>  powerValue;

	public SinglePhaseApparentPowerMeasurementNotification(Measure<?,?>  powerValue)
	{

		this.powerValue=powerValue;
	}
	public Measure<?,?>  getPowerValue(){
		return this.powerValue;
}

}
