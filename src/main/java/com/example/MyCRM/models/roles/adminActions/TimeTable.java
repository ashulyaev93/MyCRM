package com.example.MyCRM.models.roles.adminActions;

import lombok.Data;

import java.util.Set;

@Data
public class TimeTable {
    private final int id;
    private final Set<Workout> workouts;
    private final String date;
}
