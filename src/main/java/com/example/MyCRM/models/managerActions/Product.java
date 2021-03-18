package com.example.MyCRM.models.managerActions;

public class Product {
    private int productId;
    private float price;
    private String discription;

    public Product(){

    }

    public Product(int productId, float price, String discription){
        this.productId = productId;
        this.price = price;
        this.discription = discription;
    }

    public int getProductId() {
        return productId;
    }

    public float getPrice() {
        return price;
    }

    public String getDiscriptio() {
        return discription;
    }

    @Override
    public String toString(){
        return "productId = " + productId + " price = " + price + " discription = " + discription;
    }
}
