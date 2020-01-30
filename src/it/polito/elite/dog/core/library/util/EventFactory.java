/*
 * Dog - Core
 * 
 * Copyright (c) 2013 Dario Bonino, Luigi De Russis and Luca Semprini
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

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;

import it.polito.elite.dog.core.library.model.DeviceCostants;
import it.polito.elite.dog.core.library.model.notification.Notification;
import it.polito.elite.dog.core.library.model.notification.core.MonitorNotification;

/**
 * This class helps to create Event. It hosts some static methods that allow
 * generating an Event with simpler code writing.
 * 
 * @author <a href="mailto:dario.bonino@polito.it">Dario Bonino</a>
 * @author <a href="mailto:luigi.derussis@polito.it">Luigi De Russis</a>
 * @author Luca Semprini
 * @see <a href="http://elite.polito.it">http://elite.polito.it</a>
 * 
 */
public class EventFactory
{

    /**
     * Factory for creating a general event
     * 
     * @param notification
     *            to convert
     * @param bundleSymbolicName
     *            name of the bundle that create the Event
     * @return the event to send
     */
    public static Event createEvent(Notification notification,
            String bundleSymbolicName)
    {
        return EventFactory.createEvent(notification,
                OffsetDateTime.now(ZoneOffset.UTC), bundleSymbolicName);
    }

    /**
     * Factory for creating a general event
     * 
     * @param notification
     *            to convert
     * @param bundleSymbolicName
     *            name of the bundle that create the Event
     * @return the event to send
     */
    public static Event createEvent(Notification notification,
            OffsetDateTime timestamp, String bundleSymbolicName)
    {
        return EventFactory.createEvent(notification, timestamp,
                EventUrgency.NORMAL, bundleSymbolicName);
    }

    /**
     * Factory for creating a general event
     * 
     * @param notification
     *            to convert
     * @param bundleSymbolicName
     *            name of the bundle that create the Event
     * @return the event to send
     */
    public static Event createEvent(Notification notification,
            OffsetDateTime timestamp, EventUrgency urgency,
            String bundleSymbolicName)
    {
        HashMap<String, Object> eventProp = new HashMap<String, Object>();

        // Add the event topic
        eventProp.put(EventConstants.EVENT_TOPIC,
                notification.getNotificationTopic());
        // Insert the bundle name inside the event properties (OSGi Event Admin
        // Service Specification 1.3)
        eventProp.put(EventConstants.BUNDLE_SYMBOLICNAME, bundleSymbolicName);
        // Add the whole Notification to the Event (OSGi Event Admin Service
        // Specification 1.3)
        eventProp.put(EventConstants.EVENT, notification);
        eventProp.put(EventConstants.TIMESTAMP, timestamp);
        eventProp.put(DeviceCostants.URGENCY, urgency);

        // check if a notification id was specified. If specified add it as
        // custom property of the event.
        if (notification.getNotificationId() != null
                && !notification.getNotificationId().isEmpty())
        {
            eventProp.put(DeviceCostants.NOTIFICATION_ID,
                    notification.getNotificationId());
        }

        Event modifiedEvent = new Event(notification.getNotificationTopic(),
                eventProp);
        return modifiedEvent;
    }

    /**
     * Create a MonitorEvent for sending MonitorNotification from DogScheduler
     * to other bundles
     * 
     * @param notification
     *            to convert
     * @param bundleSymbolicName
     *            name of the bundle that create the Event
     * @return the event to send
     */
    public static Event createMonitorEvent(MonitorNotification notification,
            String bundleSymbolicName)
    {
        HashMap<String, Object> eventProp = new HashMap<String, Object>();

        // Add the event topic
        eventProp.put(EventConstants.EVENT_TOPIC,
                notification.getNotificationTopic());
        // Add the listener of the MonitorNotification if any (OSGi Monitor
        // Admin Service Specification 1.0)
        if (notification.getListener() != null)
        {
            eventProp.put("mon.listener.id", notification.getListener());
        }
        // Insert the bundle name inside the event properties (OSGi Event Admin
        // Service Specification 1.3)
        eventProp.put(EventConstants.BUNDLE_SYMBOLICNAME, bundleSymbolicName);

        // Add the whole MonitorNotification to the Event (OSGi Event Admin
        // Service Specification 1.3)
        eventProp.put(EventConstants.EVENT, notification);

        Event modifiedEvent = new Event(notification.getNotificationTopic(),
                eventProp);
        return modifiedEvent;
    }
}
