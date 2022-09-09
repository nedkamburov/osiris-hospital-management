package com.healthcare.management.system.db.infrastructure.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="users")
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="role")
    private String role;

    // empty constructor for hibernate
    public UserEntity() {}
}
