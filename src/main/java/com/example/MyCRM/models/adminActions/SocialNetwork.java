package com.example.MyCRM.models.adminActions;

import javax.persistence.*;

//for pull
@Entity
@Table(name = "social_network")
public class SocialNetwork {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String nameNetwork;

    @Column(name = "message")
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
