package com.healthcare.management.system.domain.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException (int userId) {
        super("There is no user with id: " + userId);
    }
}
