package com.example.MyCRM.services.Customer;

import org.springframework.stereotype.Service;

import java.util.List;

//for pull
@Service
public interface Customer<T> {
    T performAnActionFromCustomer(List<Customer> customerList);
}
