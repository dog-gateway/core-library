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


import it.polito.elite.dog.core.library.model.statevalue.NotMovingStateValue;
import it.polito.elite.dog.core.library.model.statevalue.LoweringStateValue;
import it.polito.elite.dog.core.library.model.statevalue.RaisingStateValue;
import it.polito.elite.dog.core.library.model.statevalue.MovingStateValue;



/**
* MovingUpDownState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class MovingUpDownState extends MovementState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;

	public static final String RAISING = "raising";
	public static final String LOWERING = "lowering";
	public static final String ISMOVING = "isMoving";
	public static final String NOTMOVING = "notMoving";


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public MovingUpDownState(RaisingStateValue raisingstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{raisingstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public MovingUpDownState(LoweringStateValue loweringstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{loweringstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public MovingUpDownState(MovingStateValue movingstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{movingstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public MovingUpDownState(NotMovingStateValue notmovingstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{notmovingstatevalue});
	}

	@Deprecated
	private void initCommon()
	{
		this.old2NewMap.put(MovingUpDownState.RAISING, new RaisingStateValue());
		this.old2NewMap.put(MovingUpDownState.LOWERING, new LoweringStateValue());
		this.old2NewMap.put(MovingUpDownState.ISMOVING, new MovingStateValue());
		this.old2NewMap.put(MovingUpDownState.NOTMOVING, new NotMovingStateValue());
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public MovingUpDownState(Object valueOfTheCurrentStateValue)
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
	public MovingUpDownState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public MovingUpDownState()
	{
		super();
	}
}
