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
* PumpCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface Pump extends Actuator
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public void deleteGroup(Integer groupID);
	public DeviceStatus getState();
	public void set(Object value);
	public void storeGroup(Integer groupID);
	public void stepDown();
	public Measure<?,?>  getFlowRate();
	public Measure<?,?>  getPressure();
	public void stepUp();
	public void on();
	public Measure<?,?>  getTemperature();
	public void deleteScene(Integer sceneNumber);
	public void off();
	public void storeScene(Integer sceneNumber);


	/*Generated Notifications*/

	/*Notification: FlowRateMeasurementNotification*/
	public void notifyChangedFlowRateValue(Measure<?,?>  flowRateValue);
	/*Notification: LevelControlNotification*/
	public void notifyChangedLevel(Measure<?,?>  newLevel);
	/*Notification: LeaveGroupNotification*/
	public void notifyLeftGroup(Integer groupNumber);
	/*Notification: StoreSceneNotification*/
	public void notifyStoredScene(Integer sceneNumber);
	/*Notification: OffNotification*/
	public void notifyOff();
	/*Notification: OnNotification*/
	public void notifyOn();
	/*Notification: PressureMeasurementNotification*/
	public void notifyNewPressureValue(Measure<?,?>  pressureValue);
	/*Notification: TemperatureMeasurementNotification*/
	public void notifyNewTemperatureValue(Measure<?,?>  temperatureValue);
	/*Notification: JoinGroupNotification*/
	public void notifyJoinedGroup(Integer groupNumber);
	/*Notification: DeleteSceneNotification*/
	public void notifyDeletedScene(Integer sceneNumber);
	public void updateStatus();
}
