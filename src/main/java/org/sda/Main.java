package org.sda;

import org.sda.model.Person;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //LAMBDA ESPRESSION
        //PREDICATE
        Person person = new Person("Sergei", "Oksanen", 20);
        Predicate<Person> personTest = test -> test.getAge() > 15;
        System.out.println(personTest.test(person));

        System.out.println(getLengthOfString("Java is not easy. Joke ;)"));

//New way of writing method : Function Interface
        Function<String, Integer> getStringLen = s -> {
            int increment = 10;
            return s.length() + increment;
        };
        System.out.println(getStringLen.apply("Java is not easy. Joke ;)"));


        //Method reference
        Predicate<Person> personTest2 = Person::isAdult;//method reference
        System.out.println(personTest2.test(person));

        //Supplier : Doesn't take any arguments but returns/suplliers only the value
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(); // No arguments mut returns random value
        System.out.println(randomNumberSupplier.get()); //.get() should be called always

        //Consumer: It takes an argument, do the operation and return nothing
        Consumer<Person> printPerson = p -> System.out.println("Person first name: " + p.getFirstName() + ", last name: " + p.getLastName());
        printPerson.accept(person);//.accept() should be called always

        //Operator
        UnaryOperator<Integer> toSquare = i -> i * i;
        System.out.println(toSquare.apply(4)); // apply() should be called always



    }

    // Old-school way of method definition
    private static Integer getLengthOfString(String inputString) {
        int increment = 10;
        return inputString.length() + increment;

    }
    private static void consume(String str) {
        System.out.println(str);
    }
    }
