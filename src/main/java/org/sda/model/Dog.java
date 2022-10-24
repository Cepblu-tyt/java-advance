package org.sda.model;

/**
 * Exercise 1
 *
 * @author Sergei Oksanen
 *
 */
public class Dog {
    private String name;
    private int age;
    private boolean isMale;
    private String race;
    private float weight;

    public Dog(String name, int age, boolean isMale, String race, float weight) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.race = race;
        this.weight = weight;

    }

    public Dog(boolean isMale, String race) {
        this("Tommy", 2, isMale, race, 10.0f);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0){
                    this.age = age; }
    }

    public float getWeight() {
        if (weight > 0.5) {
    }
return weight;}
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setWeight(float weight) {
        this.weight = weight;



    }
}
