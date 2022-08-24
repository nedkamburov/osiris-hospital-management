package com.healthcare.management.system.rest.dao;

import com.healthcare.management.system.rest.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> findAll();
    public void createOrUpdate(User theUser);
    public User findById(int theId);
    public void deleteById(int theId);
}
