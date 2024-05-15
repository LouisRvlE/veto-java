package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Animal;

// This will be AUTO IMPLEMENTED by Spring into a Bean called animalRepository
// CRUD refers Create, Read, Update, Delete

public interface AnimalRepository extends CrudRepository<Animal, Long> {

}
