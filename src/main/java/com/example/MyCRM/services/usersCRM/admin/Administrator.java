package com.example.MyCRM.services.usersCRM.admin;

import org.springframework.stereotype.Service;

@Service
public interface Administrator {
    String sendMessage(String client, String inputText, String messanger);
    String editTimeTable(String date, String createWorkout);
}
