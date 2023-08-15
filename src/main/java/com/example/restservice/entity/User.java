package com.example.restservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // @Column(name = "isAdmin", nullable = false, columnDefinition = "TINYINT(1)")

    private boolean isAdmin;
    private String jobRole;

    // Constructors, getters, and setters

    // Default constructor
    public User() {
    }

    // Parameterized constructor
    public User(String name, String email, boolean isAdmin, String jobRole) {
        this.name = name;
        this.email = email;
        this.isAdmin = isAdmin;
        this.jobRole = jobRole;
    }

    // Getters and setters
    // ...

}
