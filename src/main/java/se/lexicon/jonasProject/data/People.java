package se.lexicon.jonasProject.data;

import se.lexicon.jonasProject.model.Person;

import java.util.Arrays;


/*
        a. Have a private static Person array declared and instantiated as empty and not null (new Person[0]).
        b. Add a method public int size() that return the length of the array.
        c. Add a method public Person[] findAll() that return the person array.

        d. Add a method public Person findById(int personId) that return the person that has a matching personId as the
        passed in parameter.
        e. Add a method that creates a new Person, adds newly created object in the array and then return the created
        object.
        You have to “expand” the Person array. (tip: send in parameters needed to create the Person object and use the
        PersonSequencer to give you a unique personId)
        f. Add a method public void clear() that clears all Person objects from the Person array.
*/

/*
Class under construction.
 */


public class people {

private Person[] persons = new Person[0];

    public Person[] addPerson(Person person) {
        Person[] newPersonArray = Arrays.copyOf(persons, persons.length + 1);
        newPersonArray[newPersonArray.length - 1] = person;
        persons = newPersonArray;
        personSequencer.nextPersonId();
        return persons;
    }


    public int size(Person[] persons, int personsSize){ // should return the length of the array.
        persons = this.persons;
        for (int i = 0; i < persons.length; i++){
            personsSize = i+1;
        }
        return personsSize;
    }



    public void folksFindAll(Person[]... persons){ // should return the whole person array.

        for (Person[] person : persons) {
            System.out.println("Id and full name: " + Person.getPersonId(person) + "\t" + Person.getFirstName(person) + " " + Person.getLastName(person));
        }
    }


    public person[] personFindById(int personId){ // should return the person that has the matching personId as the passed parameter.
//personId, firstName, lastName

        person[] = Person.getPersonId(personId), Person.getFirstName(), Person.getLastName();

        return person[];
    }


    public void clearPerson(){ //Clears all person objects from the Person array.
      Person persons[] = {};

    }

//-------- not finished methods below

    public void removePerson(){ //Removes person from the persons Array

    }

}//class
