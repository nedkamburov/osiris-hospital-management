package com.healthcare.management.system.rest.controller;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException (int userId) {
        super("There is no user with id: " + userId);
    }
}
