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
* SinglePhaseElectricityMeterCategory - automatically generated by DogOnt2Dog
*/


import it.polito.elite.dog.core.library.model.DeviceStatus;
import javax.measure.Measure;

public interface SinglePhaseElectricityMeter extends SinglePhaseCurrentMeter, FrequencyMeter, PowerFactorMeter, SinglePhaseReactivePowerMeter, SinglePhaseActivePowerMeter, SinglePhaseEnergyMeter, SinglePhaseApparentPowerMeter, SinglePhaseVoltageMeter
{
	public static int MATCH_TYPE=100;
	public static int MATCH_SUB_TYPE=50;
	public static int MATCH_MANUFACTURER=0;

	public Measure<?,?>  getReactivePower();
	public Measure<?,?>  getActiveEnergyValue();
	public Measure<?,?>  getActivePower();
	public DeviceStatus getState();
	public Measure<?,?>  getElectricCurrentValue();
	public Measure<?,?>  getFrequency();
	public Measure<?,?>  getReactiveEnergyValue();
	public Measure<?,?>  getPhaseNeutralVoltageValue();
	public Measure<?,?>  getPowerFactor();
	public Measure<?,?>  getApparentPower();


	/*Generated Notifications*/

	/*Notification: SinglePhaseActivePowerMeasurementNotification*/
	public void notifyNewActivePowerValue(Measure<?,?>  powerValue);
	/*Notification: SinglePhaseApparentPowerMeasurementNotification*/
	public void notifyNewApparentPowerValue(Measure<?,?>  powerValue);
	/*Notification: SinglePhaseReactiveEnergyMeasurementNotification*/
	public void notifyNewReactiveEnergyValue(Measure<?,?>  value);
	/*Notification: PowerFactorMeasurementNotification*/
	public void notifyNewPowerFactorValue(Measure<?,?>  powerFactor);
	/*Notification: SinglePhaseCurrentMeasurementNotification*/
	public void notifyNewCurrentValue(Measure<?,?>  value);
	/*Notification: FrequencyMeasurementNotification*/
	public void notifyNewFrequencyValue(Measure<?,?>  frequency);
	/*Notification: SinglePhaseVoltageMeasurementNotification*/
	public void notifyNewPhaseNeutralVoltageValue(Measure<?,?>  lnVoltage);
	/*Notification: SinglePhaseActiveEnergyMeasurementNotification*/
	public void notifyNewActiveEnergyValue(Measure<?,?>  value);
	/*Notification: SinglePhaseReactivePowerMeasurementNotification*/
	public void notifyNewReactivePowerValue(Measure<?,?>  powerValue);
	public void updateStatus();
}
