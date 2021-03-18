package com.example.MyCRM.models.managerActions;

public class Sale {
    private int managerId;
    private int clientId;
    private int productId;
    private int amount;
    private float price;

    public Sale(){}

    public Sale(int managerId, int clientId, int productId, int amount, float price){
        this.managerId = managerId;
        this.clientId = clientId;
        this.productId = productId;
        this.amount = amount;
        this.price = price;
    }

    public int getManagerId() {
        return managerId;
    }

    public int getClientId(){
        return clientId;
    }

    public int getProductId() {
        return productId;
    }

    public int getAmount() {
        return amount;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Sell: " + managerId + " " + clientId + " " + productId + " " + amount +  " " + price;
    }
}
