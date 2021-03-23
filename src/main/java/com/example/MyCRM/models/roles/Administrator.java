package com.example.MyCRM.models.roles;

import com.example.MyCRM.models.roles.adminActions.Communication;
import com.example.MyCRM.models.roles.adminActions.TimeTable;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Map;

@Data
@Entity
@Table(name = "administrator")
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private final int id;

    @Column(name = "first_name")
    private final String firstName;

    @Column(name = "last_name")
    private final String lastName;

    @Column(name = "email")
    private final String email;

    @Transient
    private final Map<Integer, Communication> communication;

    @Transient
    private final Map<Date, TimeTable> timeTable;

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + email;
    }
}
