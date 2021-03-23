package com.example.MyCRM.models.roles;

import com.example.MyCRM.models.roles.managerActions.Documentation;
import com.example.MyCRM.models.roles.managerActions.Sale;
import lombok.Data;

import javax.persistence.*;
import java.util.Map;
import java.util.Set;

@Data
@Entity
@Table(name = "manager")
public class Manager {
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
    private final Map<Integer, Documentation> documentation;

    @Transient
    private final Set<Sale> sales;

    @Override
    public String toString(){
        return firstName + " " + lastName + " " + email;
    }
}
