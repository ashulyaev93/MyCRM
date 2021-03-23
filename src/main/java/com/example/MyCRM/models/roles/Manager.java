package com.example.MyCRM.models.roles;

import com.example.MyCRM.models.roles.managerActions.Documentation;
import com.example.MyCRM.models.roles.managerActions.Sale;

import javax.persistence.*;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "manager")
public class Manager {
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
    private Map<Integer, Documentation> documentation;

    @Transient
    private Set<Sale> sales;

    public Manager(){

    }

    public Manager(String firstName, String lastName, String email, Map<Integer, Documentation> documentation, Set<Sale> sales){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.documentation = documentation;
        this.sales = sales;
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

    public Map<Integer,Documentation> getDocumentation() {
        return documentation;
    }

    public Set<Sale> getSale(){return sales;}


    @Override
    public String toString(){
        return firstName + " " + lastName + " " + email;
    }
}
