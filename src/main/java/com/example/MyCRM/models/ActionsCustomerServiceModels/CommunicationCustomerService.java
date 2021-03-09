package com.example.MyCRM.models.ActionsCustomerServiceModels;

import com.example.MyCRM.models.SocialNetwork;

import java.util.List;

public class CommunicationCustomerService {
    private int customerId;
    private int customerServiceId;
    private List<SocialNetwork> network;

    public CommunicationCustomerService(){}

    public CommunicationCustomerService(int customerId, int customerServiceId, List<SocialNetwork> network){
        this.customerId = customerId;
        this.customerServiceId = customerServiceId;
        this.network = network;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getCustomerServiceId() {
        return customerServiceId;
    }

    public List<SocialNetwork> getNetwork() {
        return network;
    }

    @Override
    public String toString(){
        return "Message from Customer: " + customerId + " " + customerServiceId + " " + network;
    }
}

