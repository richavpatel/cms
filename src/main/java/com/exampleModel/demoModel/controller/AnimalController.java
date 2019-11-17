package com.exampleModel.demoModel.controller;

import com.exampleModel.demoModel.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;
    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String callMethod(){
        animalService.insertAnimal();
        return "This is animal page";

    }
}
