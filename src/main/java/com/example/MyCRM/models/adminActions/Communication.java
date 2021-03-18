package com.example.MyCRM.models.adminActions;

public class Communication {
    private int id;
    private String nameNetwork;
    private String message;

    public SocialNetwork(){}

    public SocialNetwork(int id, String nameNetwork, String message){
        this.id = id;
        this.nameNetwork = nameNetwork;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getNameNetwork() {
        return nameNetwork;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString(){
        return "Network: " + " " + nameNetwork + " " + message;
    }
}
