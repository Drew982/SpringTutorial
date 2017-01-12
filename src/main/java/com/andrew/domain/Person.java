package com.andrew.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Andrew on 1/10/2017.
 */

public class Person
{
    public Person(@JsonProperty("name") String name,
                  @JsonProperty("age") int age)
    {
        this.name = name;
        this.age = age;
    }

    public String name;
    public int age;
//    public int id;

    @Override
    public String toString()
    {
        return name; //Overrides location & memory call (parent's version of toString) and displays name (new version)
    }

    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof Person && age == ((Person) obj).age;
    }
}
