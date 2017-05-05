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
* WashingMachineCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface WashingMachine extends WhiteGoods
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public void start();
	public Measure<?,?>  getStartTime();
	public DeviceStatus getState();
	public void standBy();
	public void on();
	public Measure<?,?>  getRemainingTime();
	public void stop();
	public Measure<?,?>  getEndTime();
	public void setStartTime(Measure<?,?>  endTime, Measure<?,?>  remainingTime, Measure<?,?>  startTime);
	public Object[] getEventsAndAlerts();
	public void pause();
	public void off();


	/*Generated Notifications*/

	/*Notification: EventNotification*/
	public void notifyNewEvent(Object event);
	/*Notification: StandByNotification*/
	public void notifyStandby();
	/*Notification: AlertNotification*/
	public void notifyNewAlert(Object alert);
	/*Notification: PauseApplianceNotification*/
	public void notifyPause();
	/*Notification: StopApplianceNotification*/
	public void notifyStop();
	/*Notification: OnNotification*/
	public void notifyOn();
	/*Notification: MultipleEventNotification*/
	public void notifyNewEventSet(Object[] events);
	/*Notification: StoppedWashingNotification*/
	public void notifyStoppedWashOrRinseCycle();
	/*Notification: RemainingTimeChangedNotification*/
	public void notifyChangedRemainingTime(Measure<?,?>  remainingTime);
	/*Notification: OffNotification*/
	public void notifyOff();
	/*Notification: MultipleAlertNotification*/
	public void notifyNewAlertSet(Object[] alerts);
	/*Notification: StartedHeatingCycleNotification*/
	public void notifyStartedHeatingCycle();
	/*Notification: StartApplianceNotification*/
	public void notifyStart();
	/*Notification: StartedWashingNotification*/
	public void notifyStartedWashOrRinseCycle();
	/*Notification: EndTimeChangedNotification*/
	public void notifyChangedEndTime(Measure<?,?>  endTime);
	/*Notification: StoppedHeatingCycleNotification*/
	public void notifyStoppedHeatingCycle();
	/*Notification: StartTimeChangedNotification*/
	public void notifyChangedStartTime(Measure<?,?>  startTime);
	public void updateStatus();
}
