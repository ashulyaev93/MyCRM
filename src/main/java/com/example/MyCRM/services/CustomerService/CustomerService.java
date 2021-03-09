package com.example.MyCRM.services.CustomerService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService<E> {
    E performAnActionFromCustomerService(List<CustomerService> customerServiceList);
}
