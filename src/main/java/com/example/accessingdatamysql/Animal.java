package com.example.accessingdatamysql;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
public class Animal {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private Number age;
    private String sexe;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    // il faudra ici marquer "private Client client;" quand client sera créé

    @OneToMany(mappedBy = "animal", cascade = CascadeType.REMOVE)
    private List<Appointment> appointments;

    private String note;

    private String type;

    public Animal() {
    }

    public Animal(String name, Number age, String sexe, Client client, String note, String type) {
        this.name = name;
        this.age = age;
        this.sexe = sexe;
        this.client = client;
        this.note = note;
        this.type = type;
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

    public Number getAge() {
        return age;
    }

    public void setAge(Number age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public long getClient() {
        if (this.client == null) {
            return -1;
        }
        return client.getId();
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Long> getAppointments() {
        return appointments.stream().map(Appointment::getId).toList();
    }
}
