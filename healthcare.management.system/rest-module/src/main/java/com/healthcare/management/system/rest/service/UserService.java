package com.healthcare.management.system.rest.service;

import com.healthcare.management.system.rest.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public void createOrUpdate(User theUser);
    public User findById(int theId);
    public void deleteById(int theId);
}
