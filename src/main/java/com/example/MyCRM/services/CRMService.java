package com.example.MyCRM.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CRMService {
    String performAnActionFromAdministrator();
    String performAnActionFromManager();
    String performAnActionFromSupport();
    void saveLogData();
}
