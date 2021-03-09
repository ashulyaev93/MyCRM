package com.example.MyCRM.services;

import com.example.MyCRM.services.Customer.Customer;
import com.example.MyCRM.services.Customer.CustomerImpl;
import com.example.MyCRM.services.CustomerService.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRMServiceImpl implements CRMService{
    private Customer customer;
    private CRMService customerService;

    @Autowired
    public CRMServiceImpl(){
        this.customer = new CustomerImpl();
        this.customerService = (CRMService) new CustomerServiceImpl();
    }

    @Override
    public List<String> performAnActionFromCustomer() {
        return null;
    }

    @Override
    public List<String> performAnActionFromCustomerService() {
        return null;
    }
}
