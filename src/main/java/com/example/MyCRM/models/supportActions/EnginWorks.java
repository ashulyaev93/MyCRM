package com.example.MyCRM.models.supportActions;

public class EnginWorks {
    private int worksId;
    private int supportId;
    private int clientId;
    private String discription;

    public EnginWorks(){

    }

    public EnginWorks(int worksId, int supportId, int clientId, String discription){
        this.worksId = worksId;
        this.supportId = supportId;
        this.clientId = clientId;
        this.discription = discription;
    }

    public int getWorksId() {
        return worksId;
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
