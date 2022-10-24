package org.sda.model;

import java.util.Random;

/**
 * Person model
 * Example of Encapsulation
 *
 * @author Sergei Oksanen
 */

public class Person {
    // Fields
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;

    //All arguments constructor
    public Person(Long id, String firstName, String lastName, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    // Parameterized constructor
    public Person(Long id, String address) {
        this.id = id;
        this.address = address;

    }

    //Java will create a constructor automatically by default. it is called as default constructor

    // No- argumens constructor
    public Person(){
        this.id = new Random().nextLong();
        }

        // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
