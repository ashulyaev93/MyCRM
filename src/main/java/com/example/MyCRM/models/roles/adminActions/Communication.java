package com.example.MyCRM.models.roles.adminActions;

import lombok.Data;

import java.util.Set;

@Data
public class Communication {
    private final int id;
    private final Set<String> nameNetwork;

    @Override
    public String toString(){
        return "Network: " + " " + nameNetwork;
    }
}
