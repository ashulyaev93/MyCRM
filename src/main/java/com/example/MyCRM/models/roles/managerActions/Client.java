package com.example.MyCRM.models.roles.managerActions;

import lombok.Data;

@Data
public class Client {
    private final int clientId;
    private final String firstName;
    private final String lastName;

    @Override
    public String toString(){
        return "lastName = " + lastName + " firsttName = " + firstName + " clientId = " + clientId;
    }
}
