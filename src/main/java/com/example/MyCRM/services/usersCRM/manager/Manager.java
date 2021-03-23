package com.example.MyCRM.services.usersCRM.manager;

import org.springframework.stereotype.Service;

@Service
public interface Manager {
    String addDocumentation(String writeText, String saveDoc, String editDoc);
    String createSale(String findClient, String callUp, String createOrder);
}
