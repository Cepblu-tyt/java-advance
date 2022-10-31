package org.sda.services.implementations;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;

import java.time.LocalDate;
import java.util.List;

/**
 * Implementation of person service
 *
 * @author Sergei Oksanen
 */
public class PersonServiceImpl implements PersonService {
    @Override
    public int getPersonBirthYear(int age) {
        return LocalDate.now().getYear() - age;
    }
    @Override
    public String getPersonFullName (Person person){
        return person.getFirstName() + person.getLastName();
    }
    @Override
    public Person findPersonByFirstName(String firstName) throws PersonNotFoundException {
        Person resultPerson = null;

        for(Person person : getRandomPersonList()){
            if (person.getFirstName().equals(firstName)){
                resultPerson = person;
                break;
            }
        }
        if(resultPerson == null){
            throw new PersonNotFoundException(firstName);
        }
        return resultPerson;
    }



    private List<Person> getRandomPersonList(){
        Person person1 = new Person();
        person1.setFirstName("Sergei");
        person1.setLastName("Oksanen");
        person1.setAge(21);

        Person person2 = new Person();
        person2.setFirstName("Hugo");
        person2.setLastName("Ly");
        person2.setAge(45);

        Person person3 = new Person();
        person3.setFirstName("Mia");
        person3.setLastName("Stark");
        person3.setAge(19);

        Person person4 = new Person();
        person4.setFirstName("Santa");
        person4.setLastName("Claus");
        person4.setAge(350);


        return List.of(person1, person2, person3, person4);
    }
}
