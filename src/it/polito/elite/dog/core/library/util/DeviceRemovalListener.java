/*
 * Dog - Core
 * 
 * Copyright (c) 2010-2013 Dario Bonino, Luigi De Russis and Emiliano Castellina
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

package it.polito.elite.dog.core.library.util;

/**
 * A listener interface used by classes that need to listen to device removal. A
 * typical example of such classes are device drivers that need to track device
 * removal to update their inner list of currently managed devices.
 * 
 * @author <a href="dario.bonino@gmail.com">Dario Bonino</a>
 *
 */
public interface DeviceRemovalListener
{
    /**
     * Notifies the listener that the device with the given URI has been removed
     * from the framework.
     * 
     * @param deviceUid
     *            The device unique identifier
     */
    public void removedDevice(String deviceUid);
}
