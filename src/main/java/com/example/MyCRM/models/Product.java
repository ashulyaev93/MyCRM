package com.example.MyCRM.models;


import javax.persistence.*;

@Entity
@Table(name = "products")

public class Product {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    public Product(){

    }

    //for pull
    public Product(int id, String name, String description, double price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Product: " + " " + name + " " + description + " " + price;
    }
}
