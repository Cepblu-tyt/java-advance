package org.sda.generics;

/**
 * Generic comparable interdace
 *
 * @author Sergei Oksanen
 */

public interface Comparable<T>{
    /**
     * Compare two object's field and return then better object
     * @param item Generic
     * @return true or false
     */
    boolean isBetter(T item);

}
