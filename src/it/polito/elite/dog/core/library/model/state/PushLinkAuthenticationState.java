/*
 * Dog - Core
 *
 * Copyright (c) 2011-2019 Dario Bonino and Luigi De Russis
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


import it.polito.elite.dog.core.library.model.statevalue.AuthenticatedStateValue;
import it.polito.elite.dog.core.library.model.statevalue.StateValue;


import it.polito.elite.dog.core.library.model.statevalue.ActivePushLinkAuthenticationStateValue;
import it.polito.elite.dog.core.library.model.statevalue.NeedingAuthenticationStateValue;



/**
* PushLinkAuthenticationState - automatically generated by it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
* @author it.polito.elite.domotics.ontologies.dogont.utilities.DogOnt2Dog
*
*/
public class PushLinkAuthenticationState extends DiscreteState
{
	/**
	 * The unique class version for serialization
	 */

	private static final long serialVersionUID = 1L;

	public static final String AUTHENTICATED = "authenticated";
	public static final String NEEDSAUTHENTICATION = "needsAuthentication";
	public static final String AUTHENTICATING = "authenticating";


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public PushLinkAuthenticationState(AuthenticatedStateValue authenticatedstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{authenticatedstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public PushLinkAuthenticationState(NeedingAuthenticationStateValue needingauthenticationstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{needingauthenticationstatevalue});
	}


	/**
	 * Class constructor for states inheriting from DiscreteState.
	 */
	public PushLinkAuthenticationState(ActivePushLinkAuthenticationStateValue activepushlinkauthenticationstatevalue)
	{
		//call the super class constructor
		super(new StateValue[]{activepushlinkauthenticationstatevalue});
	}

	@Deprecated
	private void initCommon()
	{
		this.old2NewMap.put(PushLinkAuthenticationState.AUTHENTICATED, new AuthenticatedStateValue());
		this.old2NewMap.put(PushLinkAuthenticationState.NEEDSAUTHENTICATION, new NeedingAuthenticationStateValue());
		this.old2NewMap.put(PushLinkAuthenticationState.AUTHENTICATING, new ActivePushLinkAuthenticationStateValue());
	}
	/**
	 * Creates a state object in the Dog2.0 old way (before May 2012).
	 * 
	 * @param valueOfTheCurrentStateValue
	 */
	@Deprecated
	public PushLinkAuthenticationState(Object valueOfTheCurrentStateValue)
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
	public PushLinkAuthenticationState(StateValue... currentStateValue)
	{
		super(currentStateValue);
	}

	/**
	 * Default constructor.
	 */
	public PushLinkAuthenticationState()
	{
		super();
	}
}
