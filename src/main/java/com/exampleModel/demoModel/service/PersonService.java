package com.exampleModel.demoModel.service;

import com.exampleModel.demoModel.model.Person;
import com.exampleModel.demoModel.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;


    public Person save(Person person){
        return personRepository.save(person);
    }

    public List<Person> list(){

        return personRepository.findAll();
    }
}
