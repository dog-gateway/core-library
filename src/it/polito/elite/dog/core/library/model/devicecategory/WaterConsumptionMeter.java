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

package it.polito.elite.dog.core.library.model.devicecategory;


 
 /**
* WaterConsumptionMeterCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface WaterConsumptionMeter extends Meter
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public Measure<?,?>  getAmountOfColdWaterInM3();
	public DeviceStatus getState();
	public Measure<?,?>  getAmountOfHotWaterInM3();


	/*Generated Notifications*/

	/*Notification: HotWaterM3MeasurementNotification*/
	public void notifyNewHotWaterAmountInM3(Measure<?,?>  m3OfHotWater);
	/*Notification: ColdWaterM3MeasurementNotification*/
	public void notifyNewColdWaterAmountInM3(Measure<?,?>  m3OfColdWater);
	public void updateStatus();
}
