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
import it.polito.elite.dog.core.library.model.diagnostics.Diagnostics;
import it.polito.elite.dog.core.library.model.notification.Notification;
import it.polito.elite.dog.core.library.model.notification.core.MonitorNotification;

/**
 * This class helps to create Event. It hosts some static methods that allow
 * generating an Event with simpler code writing.
 * 
 * FIXME: change all timestamps to milliseconds from the Epoch as required by
 * the OSGi specification.
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
    public static Event createNotificationEvent(Notification notification,
            String bundleSymbolicName)
    {
        return EventFactory.createNotificationEvent(notification,
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
    public static Event createNotificationEvent(Notification notification,
            OffsetDateTime timestamp, String bundleSymbolicName)
    {
        return EventFactory.createNotificationEvent(notification, timestamp,
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
    public static Event createNotificationEvent(Notification notification,
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
     * Factory for creating a Diagnostics event.
     * 
     * @param event
     *            The {@link Diagnostics} event to deliver over the OSGi event
     *            admin.
     * @param bundleSymbolicName
     *            The name of the bundle that creates the Event.
     * @return The {@link Event} instance to deliver over the OSGi event admin.
     */
    public static Event createDiagnosticsEvent(Diagnostics event,
            String bundleSymbolicName)
    {
        return createDiagnosticsEvent(event,
                event.getCreationTime() != null ? event.getCreationTime()
                        : OffsetDateTime.now(ZoneOffset.UTC),
                EventUrgency.NORMAL, bundleSymbolicName);
    }

    /**
     * Factory for creating a Diagnostics event.
     * 
     * @param event
     *            The {@link Diagnostics} event to deliver over the OSGi event
     *            admin.
     * @param timestamp
     *            The timestamp associated to the Event as an
     *            {@link OffsetDateTime} instance.
     * @param bundleSymbolicName
     *            The name of the bundle that creates the Event.
     * @return The {@link Event} instance to deliver over the OSGi event admin.
     */
    public static Event createDiagnosticsEvent(Diagnostics event,
            OffsetDateTime timestamp, String bundleSymbolicName)
    {
        return createDiagnosticsEvent(event, timestamp, EventUrgency.NORMAL,
                bundleSymbolicName);
    }

    /**
     * Factory for creating a Diagnostics event.
     * 
     * @param event
     *            The {@link Diagnostics} event to deliver over the OSGi event
     *            admin.
     * @param bundleSymbolicName
     *            The name of the bundle that creates the Event.
     * @param timestamp
     *            The timestamp associated to the Event as an
     *            {@link OffsetDateTime} instance.
     * @param urgency
     *            The urgency level associated to the event.
     * @return The {@link Event} instance to deliver over the OSGi event admin.
     */
    public static Event createDiagnosticsEvent(Diagnostics event,
            OffsetDateTime timestamp, EventUrgency urgency,
            String bundleSymbolicName)
    {
        HashMap<String, Object> eventProp = new HashMap<String, Object>();

        // Add the event topic
        eventProp.put(EventConstants.EVENT_TOPIC, event.getTopic());
        // Insert the bundle name inside the event properties (OSGi Event Admin
        // Service Specification 1.3)
        eventProp.put(EventConstants.BUNDLE_SYMBOLICNAME, bundleSymbolicName);
        // Add the whole Notification to the Event (OSGi Event Admin Service
        // Specification 1.3)
        eventProp.put(EventConstants.EVENT, event);
        eventProp.put(EventConstants.TIMESTAMP, timestamp);
        eventProp.put(DeviceCostants.URGENCY, urgency);

        Event modifiedEvent = new Event(event.getTopic(), eventProp);
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
