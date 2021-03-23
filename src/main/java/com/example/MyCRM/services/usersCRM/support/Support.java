package com.example.MyCRM.services.usersCRM.support;

import org.springframework.stereotype.Service;

@Service
public interface Support {
    String settingCRM(String addEntity, String setting, String deleteError);
    String consultation(String callUp, String sendMessage);
}
