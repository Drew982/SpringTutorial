package com.andrew.services;

import com.andrew.dao.PersonDAO;
import com.andrew.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Andrew on 1/10/2017.
 */

@Service
public class PersonService
{
    @Autowired
    PersonDAO personDAO;

    public String getPeople()
    {
        return personDAO.getPeople().toString();
    }

    public String getPeopleByAge(int age) {
        return personDAO.getPeopleByAge(age).toString();
    }

    public void createNewPerson(Person person)
    {
        personDAO.createNewPerson(person);
    }
}
