package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity // This tells Hibernate to make a table out of this class
public class Appointment {
    @Id
    @GeneratedValue
    private long id;
    private String date;

    @OneToOne(mappedBy = "appointment")
    private Report report;

    @ManyToOne
    @JoinColumn(name = "animal_id", nullable = false)
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "veterinarian_id", nullable = false)
    private Veterinarian veterinarian;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getReport() {
        if (this.report == null) {
            return -1;
        }
        return this.report.getId();
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public void clearReport() {
        this.report = null;
    }

    public long getAnimal() {
        if (this.animal == null) {
            return -1;
        }
        return this.animal.getId();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public long getVeterinarian() {
        if (this.veterinarian == null) {
            return -1;
        }
        return this.veterinarian.getId();
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }
}