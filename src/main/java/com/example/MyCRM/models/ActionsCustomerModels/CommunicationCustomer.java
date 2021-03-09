package com.example.MyCRM.models.ActionsCustomerModels;

import com.example.MyCRM.models.SocialNetwork;

import java.util.List;

public class CommunicationCustomer {
    private int customerId;
    private int customerServiceId;
    private List<SocialNetwork> network;

    public CommunicationCustomer(){}

    public CommunicationCustomer(int customerId, int customerServiceId, List<SocialNetwork> network){
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
        return "Message from CustomerService: " + customerId + " " + customerServiceId + " " + network;
    }
}
