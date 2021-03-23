package com.example.MyCRM.models.roles.adminActions;

import lombok.Data;

@Data
public class Workout {
    private final int id;
    private final String coachName;
    private final String className;

    @Override
    public String toString(){
        return "Workout: " + " " + coachName + " " + className;
    }
}
