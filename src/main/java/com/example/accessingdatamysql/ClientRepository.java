package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Client;

// This will be AUTO IMPLEMENTED by Spring into a Bean called animalRepository
// CRUD refers Create, Read, Update, Delete

public interface ClientRepository extends CrudRepository<Client, Long> {

}
