package org.sda.services;

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

    //static method is allowed
    static int getAverageAge() {
        return AVERAGE_AGE;
    }
}

