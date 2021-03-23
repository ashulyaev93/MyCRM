package com.example.MyCRM.models.roles;

import com.example.MyCRM.models.roles.supportActions.EnginWorks;
import com.example.MyCRM.models.roles.supportActions.HelpUsers;
import lombok.Data;

import javax.persistence.*;
import java.util.Map;

@Data
@Entity
@Table(name = "support")
public class Support {
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
    private final Map<Integer, EnginWorks> works;

    @Transient
    private final Map<Integer, HelpUsers> helps;

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + email;
    }
}
