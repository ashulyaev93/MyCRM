package com.example.MyCRM.models.roles.managerActions;

import lombok.Data;

@Data
public class Product {
    private final int productId;
    private final float price;
    private final String discription;

    @Override
    public String toString(){
        return "productId = " + productId + " price = " + price + " discription = " + discription;
    }
}
