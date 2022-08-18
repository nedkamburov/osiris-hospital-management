package com.healthcare.management.system.rest.dao;

import com.healthcare.management.system.rest.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> findAll();
}
