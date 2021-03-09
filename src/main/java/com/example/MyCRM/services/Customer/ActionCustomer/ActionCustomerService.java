package com.example.MyCRM.services.Customer.ActionCustomer;

import com.example.MyCRM.models.Customer;

import java.util.List;

public interface ActionCustomerService {
    List<Customer> createBuy(String inputString);
    List<Customer> createCommunication(String inputString);
}
