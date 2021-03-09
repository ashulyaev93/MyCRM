package com.example.MyCRM.services.CustomerService.ActionCustomerSerice;

import com.example.MyCRM.models.Customer;
import com.example.MyCRM.models.CustomerService;

import java.util.List;

public interface ActionCustomerServiceService {
    List<CustomerService> createSell(String inputString);
    List<CustomerService> createCommunication(String inputString);
    List<CustomerService> getSupport(String inputString);
}
