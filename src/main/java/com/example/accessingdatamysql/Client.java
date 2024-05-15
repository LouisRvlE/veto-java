package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Client {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    
    @OneToMany(mappedBy = "client")
    private List<Animal> animals;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, List<Animal> animals) {
        this.name = name;
        this.animals = animals;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // ! Il met tout les setter, mettre getAnimals fait une stackoverflow (json infinite recursion)
    // public List<Animal> getAnimals() {
    //     return animals;
    // } 

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        if (this.animals.contains(animal)) {
            return;
        }
        this.animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        this.animals.remove(animal);
    }
}