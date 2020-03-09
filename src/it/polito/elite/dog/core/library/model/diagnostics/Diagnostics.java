/*
 * Dog - Core - Diagnostics
 *
 * Copyright (c) 2020 Dario Bonino
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
package it.polito.elite.dog.core.library.model.diagnostics;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * The superclass of all diagnostic information events exchanged inside Dog.
 * 
 * @author <a href="mailto:dario.bonino@gmail.com">Dario Bonino</a>
 *
 */
public abstract class Diagnostics
{
	public static final String DIAGNOSTICS_ROOT_TOPIC = "it/polito/elite/dog/core/library/model/diagnostics";

	// the actual topic at which the Diagnostics information should be published
	protected String actualTopic;

	// the instant at which the diagnostic information was created
	protected OffsetDateTime creationTime;

	/**
	 * Create a new diagnostics instance, to be published on the given subtopic
	 * of the root diagnostic topic.
	 * 
	 * @param actualTopic
	 */
	public Diagnostics(String actualTopic)
	{
		this.actualTopic = DIAGNOSTICS_ROOT_TOPIC
				+ (actualTopic.startsWith("/") ? actualTopic
						: "/" + actualTopic);
		// the creation time in UTC
		this.creationTime = OffsetDateTime.now(ZoneOffset.UTC);
	}

	/**
	 * Provides the topic at which this diagnostic information should be / has
	 * been published.
	 * 
	 * @return The topic defined according to the OSGi Event Admin
	 *         specification.
	 */
	public String getTopic()
	{
		return actualTopic;
	}

	/**
	 * Provides the time at which this {@link Diagnostics} information was
	 * created.
	 * 
	 * @return The creationTime as an {@link OffsetDateTime} instance.
	 */
	public OffsetDateTime getCreationTime()
	{
		return creationTime;
	}

	@Override
	public String toString()
	{
		return "Diagnostics [creationTime=" + creationTime + "]";
	}
}
