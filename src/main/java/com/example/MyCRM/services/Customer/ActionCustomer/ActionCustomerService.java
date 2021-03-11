package com.example.MyCRM.services.Customer.ActionCustomer;

import com.example.MyCRM.models.Customer;

import java.util.List;

//for pull
public interface ActionCustomerService {
    List<Customer> createBuy(String inputString);
    List<Customer> createCommunication(String inputString);
}
