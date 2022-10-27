package org.sda;

import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

            Person person = new Person();
            Person.setFirstName("Sergei");
            Person.setLastName("Oksanen");
            Person.setAge(20);

            PersonService personService = new PersonServiceImpl();

        System.out.println("Person's brith year: " + personService.getPersonBirthYear(person.getAge()));
        System.out.println("Person's Fullname: " + personService.getPersonFullName(person));

    }
}