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

package it.polito.elite.dog.core.library.model.state;


import it.polito.elite.dog.core.library.model.statevalue.StateValue;


import it.polito.elite.dog.core.library.model.statevalue.EnergyStateValue;
import it.polito.elite.dog.core.library.model.statevalue.ReactiveEnergyStateValue;



/**
* ThreePhaseReactiveEnergyState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class ThreePhaseReactiveEnergyState extends EnergyMeasurementState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;



	/**
	 * Class constructor for states inheriting from ContinuousState.
	 */
	public ThreePhaseReactiveEnergyState(EnergyStateValue energystatevalue, ReactiveEnergyStateValue reactiveenergystatevalue,ReactiveEnergyStateValue reactiveenergystatevalue1,ReactiveEnergyStateValue reactiveenergystatevalue2)
	{
		//call the super class constructor
		super(energystatevalue, reactiveenergystatevalue,reactiveenergystatevalue1,reactiveenergystatevalue2);
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public ThreePhaseReactiveEnergyState(Object valueOfTheCurrentStateValue)
	{
		this.valueOfTheCurrentStateValue = valueOfTheCurrentStateValue;

		if(!(valueOfTheCurrentStateValue instanceof String))
		{
			EnergyStateValue sValue1 = new EnergyStateValue();
			sValue1.setValue(valueOfTheCurrentStateValue);
			this.currentStateValue[1]=sValue1;

			ReactiveEnergyStateValue sValue = new ReactiveEnergyStateValue();
			sValue.setValue(valueOfTheCurrentStateValue);
			this.currentStateValue[0]=sValue;

		}
	}

	/**
	 * Class constructor.
	 */
	public ThreePhaseReactiveEnergyState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public ThreePhaseReactiveEnergyState()
	{
		super();
	}
}
