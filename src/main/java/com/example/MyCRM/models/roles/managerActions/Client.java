package com.example.MyCRM.models.roles.managerActions;

public class Client {
    private int clientId;
    private String firstName;
    private String lastName;

    public Client(){

    }

    public Client(int clientId, String firstName, String LastName){
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getClientId() {
        return clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getlLastName() {
        return lastName;
    }

    @Override
    public String toString(){
        return "lastName = " + lastName + " firsttName = " + firstName + " clientId = " + clientId;
    }
}
