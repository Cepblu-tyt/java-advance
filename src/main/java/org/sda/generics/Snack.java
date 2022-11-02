package org.sda.generics;

/**
 * Implementation of comparable interface
 *
 * @author Sergei Oksanen
 */
public class Snack implements Comparable<Snack>{

    private int testRating;

    public Snack(int testRating) {
        this.testRating = testRating;
    }

    @Override
    public boolean isBetter(Snack item) {
        return this.testRating > item.testRating;
    }
}
