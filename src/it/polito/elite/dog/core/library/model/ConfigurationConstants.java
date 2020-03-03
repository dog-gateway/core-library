/*
 * Dog - Core
 *  
 * Copyright 2014-2020 Dario Bonino 
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
package it.polito.elite.dog.core.library.model;

/**
 * A set of constants used to retrieve / store information from parameter map
 * associated to notification and/or command instances.
 * 
 * @author <a href="mailto:dario.bonino@gmail.com">Dario Bonino</a>
 *
 */
public class ConfigurationConstants
{
    /**
     * The command name to which a specific configuration refers
     */
    public static final String COMMAND_NAME = "realCommandName";

    /**
     * The unique id associated to the a command instance
     */
    public static final String COMMAND_ID = "commandId";

    /**
     * The command type as a simple name of a core library command class
     */
    public static final String COMMAND_CLASS = "commandClass";

    /**
     * The notification name to which a specific configuration refers
     */
    public static final String NOTIFICATION_NAME = "notificationName";
    /**
     * The unique notification id associated to a notification instance
     */
    public static final String NOTIFICATION_ID = "notificationId";
    /**
     * The notification type as simple name of a core library notification class
     */
    public static final String NOTIFICATION_CLASS = "notificationClass";

}
