package com.example.MyCRM.models.adminActions;

import java.util.Set;

public class Communication {
    private int id;
    private Set<String> nameNetwork;

    public Communication(){}

    public Communication(int id, Set<String> nameNetwork){
        this.id = id;
        this.nameNetwork = nameNetwork;
    }

    public int getId() {
        return id;
    }

    public Set<String> getNameNetwork() {
        return nameNetwork;
    }

    @Override
    public String toString(){
        return "Network: " + " " + nameNetwork;
    }
}
