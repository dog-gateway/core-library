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

package it.polito.elite.dog.core.library.model.state;


import it.polito.elite.dog.core.library.model.statevalue.StateValue;


import it.polito.elite.dog.core.library.model.statevalue.HeatingStateValue;
import it.polito.elite.dog.core.library.model.statevalue.WashRinseStateValue;
import it.polito.elite.dog.core.library.model.statevalue.RinseHoldStateValue;



/**
* WashingApplianceState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class WashingApplianceState extends GenericApplianceState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;

	public static final String RINSEHOLD = "rinseHold";
	public static final String WASHORRINSE = "washOrRinse";
	public static final String HEATING = "heating";


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public WashingApplianceState(RinseHoldStateValue rinseholdstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{rinseholdstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public WashingApplianceState(WashRinseStateValue washrinsestatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{washrinsestatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public WashingApplianceState(HeatingStateValue heatingstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{heatingstatevalue});
	}

	@Deprecated
	private void initCommon()
	{
		this.old2NewMap.put(WashingApplianceState.RINSEHOLD, new RinseHoldStateValue());
		this.old2NewMap.put(WashingApplianceState.WASHORRINSE, new WashRinseStateValue());
		this.old2NewMap.put(WashingApplianceState.HEATING, new HeatingStateValue());
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public WashingApplianceState(Object valueOfTheCurrentStateValue)
	{
		this.initCommon();
		this.valueOfTheCurrentStateValue = valueOfTheCurrentStateValue;
		if(valueOfTheCurrentStateValue instanceof String)
		{
			this.currentStateValue[0]=this.old2NewMap.get((String)valueOfTheCurrentStateValue);
		}
	}
	/**
	 * Class constructor.
	 */
	public WashingApplianceState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public WashingApplianceState()
	{
		super();
	}
}
