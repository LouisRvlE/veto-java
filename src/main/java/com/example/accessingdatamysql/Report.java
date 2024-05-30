package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity // This tells Hibernate to make a table out of this class
public class Report {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    
    @OneToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;

    public Report() {
    }

    public Report(String name, String description, Appointment appointment) {
        this.name = name;
        this.description = description;
        this.appointment = appointment;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }
}