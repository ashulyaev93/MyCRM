package com.example.MyCRM.services;

import com.example.MyCRM.services.DB.CRMDataService;
import com.example.MyCRM.services.DB.CRMDataServiceImpl;
import com.example.MyCRM.services.usersCRM.admin.AdministratorImpl;
import com.example.MyCRM.services.usersCRM.manager.ManagerImpl;
import com.example.MyCRM.services.usersCRM.support.SupportImpl;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class CRMServiceImpl implements CRMService{//TODO
    private final CRMService administrator;
    private final CRMService support;
    private final CRMService manager;
    private final CRMDataService data;

    @Override
    public String performAnActionFromAdministrator() {
        String admin = administrator.performAnActionFromAdministrator();
        return admin;
    }

    @Override
    public String performAnActionFromManager() {
        String manag = manager.performAnActionFromManager();
        return manag;
    }

    @Override
    public String performAnActionFromSupport() {
        String supp = support.performAnActionFromSupport();
        return supp;
    }

    @Override
    public void saveLogData() {
        System.out.println("Данные сохранены");
    }
}
