package org.sda;

import org.sda.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.toString());

        //All-argument constructor call
        Person person1 = new Person(12345L, "Sergei", "Oksanen", "asfa@gmail.com", "+3726545497", "Seebi 36c, Tallinn");
        System.out.println(person1.toString());

        Person person2 = new Person();
        person2.setFirstName("Tony");
        person2.setLastName("Stark");

        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
    }
}