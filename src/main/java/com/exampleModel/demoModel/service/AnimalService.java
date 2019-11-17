package com.exampleModel.demoModel.service;

import com.exampleModel.demoModel.model.Animal;
import com.exampleModel.demoModel.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService  {

    @Autowired
    AnimalRepository animalRepository;

    public void insertAnimal(){

        Animal animal = new Animal(1, "cat", "Black");
        animalRepository.save(animal);

      //  animalRepository.findByColorAndName("Black", "cat");





    }

}
