package com.example.MyCRM.models.roles;

import com.example.MyCRM.models.roles.supportActions.EnginWorks;
import com.example.MyCRM.models.roles.supportActions.HelpUsers;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "support")
public class Support {
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
    private Map<Integer, EnginWorks> works;

    @Transient
    private Map<Integer, HelpUsers> helps;

    public Support(){

    }

    public Support(String firstName, String lastName, String email, Map<Integer, EnginWorks> works, Map<Integer, HelpUsers> helps){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.works = works;
        this.helps = helps;
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

    public Map<Integer, EnginWorks> getWorks() {
        return works;
    }

    public Map<Integer, HelpUsers> getHelps(){return helps;}


    @Override
    public String toString(){
        return firstName + " " + lastName + " " + email;
    }
}
