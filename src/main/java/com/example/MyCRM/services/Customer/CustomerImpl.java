package com.example.MyCRM.services.Customer;

import com.example.MyCRM.services.Customer.ActionCustomer.BuyService;
import com.example.MyCRM.services.Customer.ActionCustomer.CommunicationService;
import com.example.MyCRM.services.CustomerService.ActionCustomerSerice.ActionCustomerServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements Customer{
    private ActionCustomerServiceService buy;
    private ActionCustomerServiceService communication;

    @Autowired
    public CustomerImpl(){
        this.buy = (ActionCustomerServiceService) new BuyService();
        this.communication = (ActionCustomerServiceService) new CommunicationService();
    }

    @Override
    public Object performAnActionFromCustomer(List list) {//TODO
        return null;
    }
}
