package com.example.MyCRM.models;

import com.example.MyCRM.models.ActionsCustomerServiceModels.CommunicationCustomerService;
import com.example.MyCRM.models.ActionsCustomerServiceModels.Sell;
import com.example.MyCRM.models.ActionsCustomerServiceModels.Support;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class CustomerService {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Transient
    private List<Sell> sell;

    @Transient
    private List<CommunicationCustomerService> communication;

    @Transient
    private List<Support> support;

    public CustomerService(){

    }

    public CustomerService(int id, String firstName, String lastName, List<Sell> sell, List<CommunicationCustomerService> communication, List<Support> support){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sell = sell;
        this.communication = communication;
        this.support = support;
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

    public List<Sell> getSell() {
        return sell;
    }

    public List<CommunicationCustomerService> getCommunication() {
        return communication;
    }

    public List<Support> getSupport() {
        return support;
    }

    @Override
    public String toString(){
        return "CustomerService: " + " " + firstName + " " + lastName;
    }
}

