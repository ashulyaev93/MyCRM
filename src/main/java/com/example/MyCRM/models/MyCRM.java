package com.example.MyCRM.models;

import com.example.MyCRM.models.roles.Administrator;
import com.example.MyCRM.models.roles.Manager;
import com.example.MyCRM.models.roles.Support;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "my_crm")
public class MyCRM {

    @Column(name = "admin")
    private final List<Administrator> roleAdmin;

    @Column(name = "manager")
    private final List<Manager> roleManag;

    @Column(name = "support")
    private final List<Support> roleSupport;

    @Override
    public String toString(){
        return roleAdmin + " " + roleManag + " " + roleSupport;
    }
}
