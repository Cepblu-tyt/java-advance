package org.sda.abstracts;

/**
 * An abstract Food class
 *
 * @author Sergei Oksanen
 *
 */
public abstract class Food {
    private String color;

    public Food(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void eat();
}
