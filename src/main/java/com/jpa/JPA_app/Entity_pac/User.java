package com.jpa.JPA_app.Entity_pac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String role;

    
    public User() {
    }
    public User(String name,String role){
        this.name = name;
        this.role = role;
    }
    

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
    @Override
    public String toString() {
        return "id:" + id + ", name:" + name + ", role:" + role;
    }
    
    
}
