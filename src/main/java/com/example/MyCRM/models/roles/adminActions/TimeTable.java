package com.example.MyCRM.models.roles.adminActions;

import java.util.Set;

public class TimeTable {
    private int id;
    private Set<Workout> workouts;
    private String date;

    public TimeTable(){}

    public TimeTable(int id, Set<Workout> workouts, String date){
        this.id = id;
        this.workouts = workouts;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Set<Workout> getWorkouts() {
        return workouts;
    }

    public String getDate() {
        return date;
    }
}
