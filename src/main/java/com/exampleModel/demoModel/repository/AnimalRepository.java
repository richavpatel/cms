package com.exampleModel.demoModel.repository;

import com.exampleModel.demoModel.model.Animal;
import com.exampleModel.demoModel.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    Animal findByColorAndName(String color, String name);
}
