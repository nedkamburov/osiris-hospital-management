package com.healthcare.management.system.rest.dto;

import lombok.Data;

@Data
public class AddUserDTO {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String role;
}
