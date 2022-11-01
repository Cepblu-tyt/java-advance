package org.sda.abstracts;

/**
 * Fruit class matching the abstract class
 *
 * @author Sergei Oksanen
 */
public class Fruit extends Food {

    public Fruit(String color) {
        super(color);
    }

    @Override
    public void eat() {
        System.out.println("i'm eating a fruit...");
    }
}
