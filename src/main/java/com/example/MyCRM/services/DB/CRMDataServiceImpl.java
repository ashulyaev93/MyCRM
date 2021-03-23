package com.example.MyCRM.services.DB;

import com.example.MyCRM.models.roles.Administrator;
import com.example.MyCRM.models.roles.Manager;
import com.example.MyCRM.models.roles.Support;
import com.example.MyCRM.repository.CRMDataRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class CRMDataServiceImpl implements CRMDataService{

    private final CRMDataRepository repository;

    @Override
    public void saveLogData(String data) {

    }

    @Override
    public List<Administrator> showLogByDataAdmin(String fromDate, String toDate) {
        return null;
    }

    @Override
    public List<Manager> showLogByDataManager(String fromDate, String toDate) {
        return null;
    }

    @Override
    public List<Support> showLogByDataSupport(String fromDate, String toDate) {
        return null;
    }
}
