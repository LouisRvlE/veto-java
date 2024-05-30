package com.example.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Veterinarian {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    // ! Ce n'est pas un OneToOne, c'est un ManyToOne ou OneToMany flemme de
    // réflechir

    // @OneToOne
    // @JoinColumn(name = "appointment_id_veterinarian")
    // private Appointment appointment;

    @OneToMany(mappedBy = "veterinarian")
    private List<Appointment> appointments;

    public Veterinarian() {
    }

    public Veterinarian(String name) {
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getAppointments() {
        return this.appointments.stream().map(Appointment::getId).toList();
        // return this.appointments;
    }

}