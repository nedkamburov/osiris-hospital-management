package com.healthcare.management.system.rest.controller;

import com.healthcare.management.system.rest.dao.UserDAO;
import com.healthcare.management.system.rest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
// TODO: 18.08.22 add version in the api endpoint path

public class UserController {
    private UserDAO userDAO;

    @Autowired
    public  UserController(UserDAO theUserDAO) {
        userDAO = theUserDAO;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userDAO.findAll();
    }
}
