package org.sda.abstracts;

/**
 * Veggie class axtending the abstract class
 *
 * @author Sergei Oksanen
 */
public class Veggie extends Food {
    public Veggie(String color) {
        super(color);
    }

    @Override
    public void eat() {
        System.out.println("i'm eating a veggie");
    }
}
