package com.andrew.dao;

import com.andrew.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * Created by Andrew on 1/10/2017.
 */

@Repository
public class PersonDAO
{
    @Autowired
    ArrayList<Person> dB;

    public ArrayList<Person> getPeople()
    { //"Database"
        return dB;
    }

    public ArrayList<Person> getPeopleByAge(int age)
    {
        ArrayList<Person> list = getPeople(); //Reads from "database"
        ArrayList<Person> returnList = new ArrayList<>(); //List returned
        for (Person person : list)
        { //(type of object to be looped over (in brackets usually)| looping var: var to loop)
            if (person.age == age)
            {
                returnList.add(person); //Add person to list if age equals
            }
        }
        return returnList;
    }

    public void createNewPerson(Person person)
    {
        dB.add(person);
    }

    public void updatePerson(String oldName, String newName)
    {
        for (Person person : dB)
        {
            if (person.name.equals(oldName)) //determines if value of object 1 (.name) is equal to value
            // object 2 [(oldName)]
            {
                person.name = newName;
            }
        }
    }

    public void deletePerson(String name)
    {
        ArrayList<Person> toRemove = new ArrayList<>();
        for (Person person : dB)
        {
            if (person.name.equals(name))
            {
                toRemove.add(person);
            }
        }
        dB.removeAll(toRemove);
    }
}