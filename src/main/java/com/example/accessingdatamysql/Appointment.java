package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

// peutêtre change de nom
// pour un truc en anglais

@Entity // This tells Hibernate to make a table out of this class
public class Appointment {
    @Id
    @GeneratedValue
    private long id;
    private Number date;

    @OneToOne(mappedBy = "appointment")
    private Report report;

    @ManyToOne
    @JoinColumn(name="animal_id", nullable=false)
    private Animal animal;

    @ManyToOne 
    @JoinColumn(name="veterinarian_id", nullable=false)
    private Veterinarian veterinarian;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Number getDate() {
        return this.date;
    }

    public void setDate(Number date) {
        this.date = date;
    }

    public Report getReport() {
        return this.report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Veterinarian getVeterinarian() {
        return this.veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }
}