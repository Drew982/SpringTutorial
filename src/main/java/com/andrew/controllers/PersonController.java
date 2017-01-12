package com.andrew.controllers;

import com.andrew.domain.Person;
import com.andrew.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Andrew on 1/10/2017.
 */

@RestController
@RequestMapping("/people")
public class PersonController
{
    @Autowired
    PersonService personService;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String getPeople()
    {
        return personService.getPeople();
    }

    @RequestMapping(path = "/{age}", method = RequestMethod.GET) //{age} replaced with the age variable in URL
    public String getPeopleByAge(@PathVariable(value = "age") int age)
    {
        return personService.getPeopleByAge(age);
    }

    @RequestMapping(path = "/newPerson", method = RequestMethod.POST)
    public void createNewPerson(@RequestBody Person person)
    {
        personService.createNewPerson(person);
    }

    @RequestMapping(path = "/updatePerson/{oldName}/{newName}", method = RequestMethod.PUT)
    public void updatePerson(@PathVariable(value = "oldName") String oldName,
                             @PathVariable(value = "newName") String newName)
    {
        personService.updatePerson(oldName, newName);
    }

    @RequestMapping(path = "/deletePerson/{name}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable(value = "name") String name)
    {
        personService.deletePerson(name);
    }
}
