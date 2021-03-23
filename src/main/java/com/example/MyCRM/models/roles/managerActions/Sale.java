package com.example.MyCRM.models.roles.managerActions;

import lombok.Data;

@Data
public class Sale {
    private final int managerId;
    private final int clientId;
    private final int productId;
    private final int amount;
    private final float price;

    @Override
    public String toString(){
        return "Sell: " + managerId + " " + clientId + " " + productId + " " + amount +  " " + price;
    }
}
