package org.sda.services;

import org.sda.models.Person;

/**
 * PersonService interface to  handle Person related operations
 *
 * @author Sergei Oksanen
 */
public interface PersonService {
    static final int AVERAGE_AGE = 20;
    /**
     * To get the birth year of the Person
     *
     * @param age
     * @return Birth year
     */

    int getPersonBirthYear(int age);

    /**
     * to get the full name of person
     *
     * @param person Person modell
     * @return Full name as String
     */
    String getPersonFullName(Person person);

    //static method is allowed
    static int getAverageAge() {
        return AVERAGE_AGE;
    }
}

