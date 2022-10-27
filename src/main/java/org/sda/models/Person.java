package org.sda.models;

public class Person {

    public static String FirstName;
    public static String LastName;
    public static int Age;

    public String getFirstName() {
        return FirstName;
    }

    public static void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public static void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public static void setAge(int age) {
        Age = age;
    }
}
