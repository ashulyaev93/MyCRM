package com.example.MyCRM.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CRMService {
    List<String> performAnActionFromCustomer();
    List<String> performAnActionFromCustomerService();
}
