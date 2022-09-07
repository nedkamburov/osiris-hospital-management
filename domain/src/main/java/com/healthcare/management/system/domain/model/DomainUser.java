package com.healthcare.management.system.domain.model;

import lombok.Data;

@Data
public class DomainUser {

    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String role;

    // empty constructor for hibernate
    public DomainUser() {}

    public DomainUser(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
