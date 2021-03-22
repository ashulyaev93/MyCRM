package com.example.MyCRM.services;

import com.example.MyCRM.services.DB.CRMDataService;
import com.example.MyCRM.services.DB.CRMDataServiceImpl;
import com.example.MyCRM.services.usersCRM.admin.AdministratorImpl;
import com.example.MyCRM.services.usersCRM.manager.ManagerImpl;
import com.example.MyCRM.services.usersCRM.support.SupportImpl;
import org.springframework.stereotype.Service;

@Service
public class CRMServiceImpl implements CRMService{//TODO
    private CRMService administrator;
    private CRMService support;
    private CRMService manager;
    private CRMDataService data;

    public CRMServiceImpl(){
        this.administrator = (CRMService) new AdministratorImpl();
        this.support = (CRMService) new SupportImpl();
        this.manager = (CRMService) new ManagerImpl();
        this.data = new CRMDataServiceImpl();
    }

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
    public String showData() {
        String dataLog = data.showData();
        return dataLog;
    }
}
