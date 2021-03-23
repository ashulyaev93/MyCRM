package com.example.MyCRM.models.roles;

import com.example.MyCRM.models.roles.adminActions.Communication;
import com.example.MyCRM.models.roles.adminActions.TimeTable;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

@Entity
@Table(name = "administrator")
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Transient
    private Map<Integer, Communication> communication;

    @Transient
    private Map<Date, TimeTable> timeTable;

    public Administrator(){

    }

    public Administrator(String firstName, String lastName, String email, Map<Integer, Communication> communication, Map<Date, TimeTable> timeTable){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.communication = communication;
        this.timeTable = timeTable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Map<Integer,Communication> getCommunication() {
        return communication;
    }

    public Map<Date, TimeTable> getTimeTable(){return timeTable;}


    @Override
    public String toString(){
        return firstName + " " + lastName + " " + email;
    }
}
