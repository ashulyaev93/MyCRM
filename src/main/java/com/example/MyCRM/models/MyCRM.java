package com.example.MyCRM.models;

import com.example.MyCRM.models.roles.Administrator;
import com.example.MyCRM.models.roles.Manager;
import com.example.MyCRM.models.roles.Support;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "my_crm")
public class MyCRM {

    @Column(name = "admin")
    private List<Administrator> roleAdmin;

    @Column(name = "manager")
    private List<Manager> roleManag;

    @Column(name = "support")
    private List<Support> roleSupport;

    public MyCRM(){

    }

    public MyCRM(List<Administrator> roleAdmin, List<Manager> roleManag, List<Support> roleSupport){
        this.roleAdmin = roleAdmin;
        this.roleManag = roleManag;
        this.roleSupport = roleSupport;
    }

    public List<Administrator> roleAdmin() {
        return roleAdmin;
    }

    public List<Manager> roleManag() {
        return roleManag;
    }

    public List<Support> roleSupport() {
        return roleSupport;
    }

    @Override
    public String toString(){
        return roleAdmin + " " + roleManag + " " + roleSupport;
    }
}
