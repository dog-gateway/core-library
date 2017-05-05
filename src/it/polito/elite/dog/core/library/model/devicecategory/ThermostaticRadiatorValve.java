/*
 * Dog - Core
 *
 * Copyright (c) 2011-2017 Dario Bonino and Luigi De Russis
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
* ThermostaticRadiatorValveCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import it.polito.elite.dog.core.library.model.climate.DailyClimateSchedule;

import javax.measure.Measure;

public interface ThermostaticRadiatorValve extends Thermostat, Actuator
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public void setDailyClimateSchedule(DailyClimateSchedule daySchedule);
	public DeviceStatus getState();
	public Measure<?,?>  getSetpointTemperature();
	public void cool();
	public void heat();
	public void stopHeatingOrCooling();
	public void setClimateSchedule(DailyClimateSchedule[] dailySchedules);
	public Object[] getDaySchedule(Integer weekDay);
	public void setTemperatureAt(Measure<?,?>  temperature);


	/*Generated Notifications*/

	/*Notification: CoolNotification*/
	public void notifyCool();
	/*Notification: ChangedDesiredTemperatureNotification*/
	public void notifyChangedDesiredTemperatureSetting(Measure<?,?>  newTemperatureValue);
	/*Notification: DailyClimateScheduleNotification*/
	public void notifyChangedDailyClimateSchedule(DailyClimateSchedule daySchedule);
	/*Notification: StopHeatingCoolingNotification*/
	public void notifyStoppedHeatingOrCooling();
	/*Notification: HeatNotification*/
	public void notifyHeat();
	/*Notification: WeeklyClimateScheduleNotification*/
	public void notifyChangedWeeklyClimateSchedule(DailyClimateSchedule[] dailySchedules);
	public void updateStatus();
}
