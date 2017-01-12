package com.andrew;

import com.andrew.dao.PersonDAO;
import com.andrew.domain.Person;
import com.andrew.services.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringtutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtutorialApplication.class, args);
	}

	@Bean
    public PersonService sortingService() {
	    return new PersonService();
    }

    @Bean
    public PersonDAO personDAO() {
	    return new PersonDAO();
    }

    @Bean
    public ArrayList<Person> getdB() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Andrew", 22));
        list.add(new Person("Lee", 24));
        list.add(new Person("Jon", 24));
        list.add(new Person("Mittens", 2));
        return list;
    }
}
