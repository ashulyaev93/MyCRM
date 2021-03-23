package com.example.MyCRM.models.roles.managerActions;

import lombok.Data;

@Data
public class Documentation {
    private final int id;
    private final String discription;

    @Override
    public String toString(){
        return "Network: " + " " + discription;
    }
}
