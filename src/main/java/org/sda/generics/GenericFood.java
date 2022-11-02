package org.sda.generics;

/**
 * Generic food class
 *
 * @author Sergei Oksanen
 */
public class GenericFood<T> {
    private T item;

    public GenericFood(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

}
