package com.healthcare.management.system.rest.controller;

import com.healthcare.management.system.rest.entity.User;
import com.healthcare.management.system.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
// TODO: 18.08.22 add version in the api endpoint path

public class UserController {
    private UserService userService;

    @Autowired
    public  UserController(UserService theUserService) {
        userService = theUserService;
    }

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable int userId){
        User theUser = userService.findById(userId);

        if (theUser == null) {
            throw new RuntimeException("There is no user with id: " + userId);
        }
        return theUser;
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User theUser){
        // just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        theUser.setId(0);

        userService.createOrUpdate(theUser);
        return theUser;
    }

    @PutMapping("/users")
    public User updateUser(@RequestBody User theUser){
        userService.createOrUpdate(theUser);
        return theUser;
    }

    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable int userId){
        User theUser = userService.findById(userId);

        if (theUser == null) {
            throw new RuntimeException("There is no user with id: " + userId);
        }

        userService.deleteById(userId);
        return "Delete user with id: " + userId;
    }
}
