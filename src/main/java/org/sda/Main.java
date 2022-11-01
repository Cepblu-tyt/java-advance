package org.sda;

import org.sda.abstracts.Food;
import org.sda.abstracts.Fruit;
import org.sda.abstracts.Veggie;
import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws PersonNotFoundException {
        //INTERFACE
        Person person = new Person();
        person.setFirstName("Sergei");
        person.setLastName("Oksanen");
        person.setAge(20);

        // Left side should be interface name and Right side should be interface's implementation class name
        PersonService personService = new PersonServiceImpl();

        // Implementation method calls
        System.out.println("Person's birth year: " + personService.getPersonBirthYear(person.getAge()));
        System.out.println("Person's full name: " + personService.getPersonFullName(person));

        System.out.println("Person's last name: " + person.getLastName());


        //EXCEPTION
        //Exception handling
        try {
            int[] intArray = {1, 4, 56, 7};

            for (int i = 0; i < intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("The number cannot be printed because its unavailable in the array!");
        } catch (Exception exception) {
            System.out.println("Exception being caught");
        } finally { // This blocked will be executed irrespective of catch blocks
            int a = 15;
            System.out.println("Finally executed, a: " + a);
        }

        //Custom / user-define exceptions
        try {
            System.out.println(personService.findPersonByFirstName("John").toString());
        } catch (PersonNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }


        try {
            displayNumber();
        } catch (InputMismatchException e) {
            System.out.println(e.getLocalizedMessage());
        }

        //Abstract
        Fruit fruit = new Fruit("Red");
        fruit.eat();
        Veggie veggie = new Veggie("Green");
        Food food = veggie;
        food.eat();


    }

    private static void displayNumber(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println("int -> " + i);
            } else if(scanner.hasNextDouble()) {
            double d = scanner.nextDouble();
            System.out.println("double -> " + d);
        } else {
          throw new InputMismatchException("Hey! That's  not a value! Try once more.");
        }
    }

}