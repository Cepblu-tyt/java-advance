package org.sda.homeworks;

public class Cat extends Animal {
   Cat(boolean isMale, String race, int age, String voice) {
        this.isMale = isMale;
        this.race = race;
        this.age = age;
        this.voice = voice;
    }
    Cat cat1 = new Cat(true,"Cat",5,"Meow");


}
