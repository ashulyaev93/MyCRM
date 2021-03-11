package com.example.MyCRM.models.ActionsCustomerServiceModels;

public class Support {
    private int customerId;
    private int customerServiceId;
    private String description;
    private String status;

    public Support(){}

    //for pull
    public Support(int customerId, int customerServiceId, String description, String status){
        this.customerId = customerId;
        this.customerServiceId = customerServiceId;
        this.description = description;
        this.status = status;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getCustomerServiceId(){
        return customerServiceId;
    }

    public String getDescription() {
        return description;
    }

    public String getstatus() {
        return status;
    }

    @Override
    public String toString(){
        return "Support: " + customerId + " " + customerServiceId + " " + description + " " + status;
    }
}
