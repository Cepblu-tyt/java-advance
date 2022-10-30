package org.sda.homeworks;

public class Dog extends Animal  {
    Dog(boolean isMale, String race, int age, String voice) {
        this.isMale = isMale;
        this.race = race;
        this.age = age;
        this.voice = voice;
    }
    Dog dog1 = new Dog(false,"Dog",2,"Woof");
}
