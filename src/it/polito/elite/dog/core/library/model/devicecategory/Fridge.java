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

package it.polito.elite.dog.core.library.model.devicecategory;


 
 /**
* FridgeCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface Fridge extends WhiteGoods
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public DeviceStatus getState();
	public void stopSuperCooling();
	public Measure<?,?>  getEndTime();
	public void on();
	public void stopHeatingOrCooling();
	public void setStartTime(Measure<?,?>  remainingTime, Measure<?,?>  endTime, Measure<?,?>  startTime);
	public void off();
	public Measure<?,?>  getRemainingTime();
	public void startSuperCooling();
	public void cool();
	public Object[] getEventsAndAlerts();
	public void setTemperatureAt(Measure<?,?>  temperature);
	public void heat();
	public Measure<?,?>  getStartTime();
	public void standBy();


	/*Generated Notifications*/

	/*Notification: MultipleEventNotification*/
	public void notifyNewEventSet(Object[] events);
	/*Notification: EventNotification*/
	public void notifyNewEvent(Object event);
	/*Notification: MultipleAlertNotification*/
	public void notifyNewAlertSet(Object[] alerts);
	/*Notification: ChangedDesiredTemperatureNotification*/
	public void notifyChangedDesiredTemperatureSetting(Measure<?,?>  newTemperatureValue);
	/*Notification: AlertNotification*/
	public void notifyNewAlert(Object alert);
	/*Notification: CoolNotification*/
	public void notifyCool();
	/*Notification: EndTimeChangedNotification*/
	public void notifyChangedEndTime(Measure<?,?>  endTime);
	/*Notification: RemainingTimeChangedNotification*/
	public void notifyChangedRemainingTime(Measure<?,?>  remainingTime);
	/*Notification: OffNotification*/
	public void notifyOff();
	/*Notification: StartTimeChangedNotification*/
	public void notifyChangedStartTime(Measure<?,?>  startTime);
	/*Notification: HeatNotification*/
	public void notifyHeat();
	/*Notification: OnNotification*/
	public void notifyOn();
	/*Notification: StartedSuperCoolingNotification*/
	public void notifyStartedSuperCooling();
	/*Notification: StandByNotification*/
	public void notifyStandby();
	/*Notification: StoppedSuperCoolingNotification*/
	public void notifyStoppedSuperCooling();
	/*Notification: StopHeatingCoolingNotification*/
	public void notifyStoppedHeatingOrCooling();
	public void updateStatus();
}
