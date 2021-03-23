package com.example.MyCRM.models.roles.supportActions;

import lombok.Data;

@Data
public class HelpUsers {
    private final int helpId;
    private final int supportId;
    private final int clientId;
    private final String discription;

    @Override
    public String toString(){
        return "discription = " + discription + " supportId = " + supportId + " clientId = " + clientId;
    }
}
