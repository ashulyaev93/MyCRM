package com.example.MyCRM.services.CustomerService;

import com.example.MyCRM.services.CustomerService.ActionCustomerSerice.ActionCustomerServiceService;
import com.example.MyCRM.services.CustomerService.ActionCustomerSerice.CommunicationServiceService;
import com.example.MyCRM.services.CustomerService.ActionCustomerSerice.SellService;
import com.example.MyCRM.services.CustomerService.ActionCustomerSerice.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private ActionCustomerServiceService sell;
    private ActionCustomerServiceService communication;
    private ActionCustomerServiceService support;

    @Autowired
    public CustomerServiceImpl(){
        this.sell = (ActionCustomerServiceService) new SellService();
        this.communication = (ActionCustomerServiceService) new CommunicationServiceService();
        this.support = (ActionCustomerServiceService) new SupportService();
    }

    @Override
    public Object performAnActionFromCustomerService(List list) {//TODO
        return null;
    }
}
