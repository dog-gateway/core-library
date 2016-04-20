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

package it.polito.elite.dog.core.library.model.devicecategory;


 
 /**
* ThreePhaseElectricityMeterCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface ThreePhaseElectricityMeter extends ThreePhaseReactivePowerMeter, ThreePhaseVoltageMeter, ThreePhaseCurrentMeter, FrequencyMeter, PowerFactorMeter, ThreePhaseApparentPowerMeter, ThreePhaseActivePowerMeter, SinglePhaseEnergyMeter
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public Measure<?,?>  getReactivePower(String phaseID);
	public Measure<?,?>  getActiveEnergyValue();
	public DeviceStatus getState();
	public Measure<?,?>  getActivePower(String phaseID);
	public Measure<?,?>  getFrequency();
	public Measure<?,?>  getReactiveEnergyValue();
	public Measure<?,?>  getElectricCurrentValue(String phaseID);
	public Measure<?,?>  getLNVoltageValue(String phaseID);
	public Measure<?,?>  getPowerFactor();
	public Measure<?,?>  getLLVoltageValue(String phaseID2, String phaseID1);
	public Measure<?,?>  getApparentPower(String phaseID);


	/*Generated Notifications*/

	/*Notification: PowerFactorMeasurementNotification*/
	public void notifyNewPowerFactorValue(Measure<?,?>  powerFactor);
	/*Notification: SinglePhaseReactiveEnergyMeasurementNotification*/
	public void notifyNewReactiveEnergyValue(Measure<?,?>  value);
	/*Notification: ThreePhaseActivePowerMeasurementNotification*/
	public void notifyNewActivePowerValue(String phaseID, Measure<?,?>  value);
	/*Notification: ThreePhaseLNVoltageMeasurementNotification*/
	public void notifyNewPhaseNeutralVoltageValue(String phaseID, Measure<?,?>  value);
	/*Notification: FrequencyMeasurementNotification*/
	public void notifyNewFrequencyValue(Measure<?,?>  frequency);
	/*Notification: ThreePhaseApparentPowerMeasurementNotification*/
	public void notifyNewApparentPowerValue(String phaseID, Measure<?,?>  value);
	/*Notification: ThreePhaseReactivePowerMeasurementNotification*/
	public void notifyNewReactivePowerValue(String phaseID, Measure<?,?>  value);
	/*Notification: SinglePhaseActiveEnergyMeasurementNotification*/
	public void notifyNewActiveEnergyValue(Measure<?,?>  value);
	/*Notification: ThreePhaseCurrentMeasurementNotification*/
	public void notifyNewCurrentValue(String phaseID, Measure<?,?>  value);
	/*Notification: ThreePhaseLLVoltageMeasurementNotification*/
	public void notifyNewPhasePhaseVoltageValue(String phaseID, Measure<?,?>  value);
	public void updateStatus();
}
