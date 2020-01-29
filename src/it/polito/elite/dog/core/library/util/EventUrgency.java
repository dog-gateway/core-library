/**
 * 
 */
package it.polito.elite.dog.core.library.util;

/**
 * An enumeration of the degree of urgency of a certain notification, might be
 * exploited to support different delivery mechanisms for notifications.
 * 
 * @author bonino
 *
 */
public enum EventUrgency
{
    LOWEST(0), LOW(2), NORMAL(4), HIGH(6), HIGHEST(8);

    private int value;

    private EventUrgency(int value)
    {
        this.value = value;
    }

    /**
     * Provide the numeric value of this enumeration
     * 
     * @return the value
     */
    public int getValue()
    {
        return value;
    }
}
