package com.exampleModel.demoModel.controller;

import com.exampleModel.demoModel.model.Person;
import com.exampleModel.demoModel.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping()
    public ResponseEntity<List<Person>> insertPerson(Person person) {
        List<Person> list = personService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> savePerson(@RequestBody Person person){
        Person saved = personService.save(person);
        return new ResponseEntity<>(saved, HttpStatus.OK);
    }
}
