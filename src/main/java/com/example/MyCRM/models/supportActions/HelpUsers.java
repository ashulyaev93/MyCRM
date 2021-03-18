package com.example.MyCRM.models.supportActions;

public class HelpUsers {
    private int helpId;
    private int supportId;
    private int clientId;
    private String discription;

    public HelpUsers(){

    }

    public HelpUsers(int helpId, int supportId, int clientId, String discription){
        this.helpId = helpId;
        this.supportId = supportId;
        this.clientId = clientId;
        this.discription = discription;
    }

    public int getHelpId() {
        return helpId;
    }

    public int getSupportId() {
        return supportId;
    }

    public int getClientId() {
        return clientId;
    }

    public String getDiscription() {
        return discription;
    }

    @Override
    public String toString(){
        return "discription = " + discription + " supportId = " + supportId + " clientId = " + clientId;
    }
}
