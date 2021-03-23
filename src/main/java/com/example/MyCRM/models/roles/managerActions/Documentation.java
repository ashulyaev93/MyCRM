package com.example.MyCRM.models.roles.managerActions;

public class Documentation {
    private int id;
    private String discription;

    public Documentation(){}

    public Documentation(int id, String discription){
        this.id = id;
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public String getDiscription() {
        return discription;
    }

    @Override
    public String toString(){
        return "Network: " + " " + discription;
    }
}
