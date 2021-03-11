package com.example.MyCRM.models.ActionsCustomerServiceModels;

public class Sell {
    private int customerId;
    private int customerServiceId;
    private int productId;
    private float price;

    //for pull
    public Sell(){}

    public Sell(int customerId, int customerServiceId, int productId, float price){
        this.customerId = customerId;
        this.customerServiceId = customerServiceId;
        this.productId = productId;
        this.price = price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getCustomerServiceId(){
        return customerServiceId;
    }

    public int getProductId() {
        return productId;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Sell: " + customerId + " " + customerServiceId + " " + productId + " " + price;
    }
}
