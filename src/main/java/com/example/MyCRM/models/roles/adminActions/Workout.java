package com.example.MyCRM.models.roles.adminActions;

public class Workout {
    private int id;
    private String coachName;
    private String className;

    public Workout(){}

    public Workout(int id, String coachName, String className){
        this.id = id;
        this.coachName = className;
    }

    public int getId() {
        return id;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString(){
        return "Workout: " + " " + coachName + " " + className;
    }
}
