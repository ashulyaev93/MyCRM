package com.example.MyCRM.services.DB;

import com.example.MyCRM.models.roles.Administrator;
import com.example.MyCRM.models.roles.Manager;
import com.example.MyCRM.models.roles.Support;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CRMDataService {
    void saveLogData(String data);
    List<Administrator> showLogByDataAdmin(String fromDate, String toDate);
    List<Manager> showLogByDataManager(String fromDate, String toDate);
    List<Support> showLogByDataSupport(String fromDate, String toDate);
}
