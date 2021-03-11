package com.example.MyCRM.models;

import com.example.MyCRM.models.ActionsCustomerModels.Buy;
import com.example.MyCRM.models.ActionsCustomerModels.CommunicationCustomer;

import javax.persistence.*;
import java.util.List;

//for pull
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column (name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Transient
    private List<Buy> buy;

    @Transient
    private List<CommunicationCustomer> communication;

    public Customer(){

    }

    public Customer(int id, String firstName, String lastName, List<Buy> buy, List<CommunicationCustomer> communication){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.buy = buy;
        this.communication = communication;
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

    public List<Buy> getBuy() {
        return buy;
    }

    public List<CommunicationCustomer> getCommunication() {
        return communication;
    }

    @Override
    public String toString(){
        return "Customer: " + firstName + " " + lastName;
    }
}
