package com.example.MyCRM.models.roles.adminActions;

import lombok.Data;

@Data
public class SocialNetwork {
    private final int id;
    private final String nameNetwork;
    private final String message;

    @Override
    public String toString(){
        return "Network: " + " " + nameNetwork + " " + message;
    }
}
