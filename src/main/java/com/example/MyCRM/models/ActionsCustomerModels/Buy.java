package com.example.MyCRM.models.ActionsCustomerModels;

//for pull
public class Buy {
    private int customerId;
    private int productId;
    private float price;

    public Buy(){}

    public Buy(int customerId, int productId, float price){
        this.customerId = customerId;
        this.productId = productId;
        this.price = price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getProductId() {
        return productId;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Buy: " + customerId + " " + productId + " " + price;
    }
}
