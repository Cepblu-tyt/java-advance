package org.sda.exceptions;

/**
 * Exeption to handle if the person is not found
 *
 * @author Sergei Oksanen
 */
public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String name){
        super(String.format("The person (%s) is not found!", name));

    }

}
