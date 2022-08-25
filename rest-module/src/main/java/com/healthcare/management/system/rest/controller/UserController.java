package com.healthcare.management.system.rest.controller;

import com.healthcare.management.system.domain.DomainUser;
import com.healthcare.management.system.domain.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<DomainUser> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{userId}")
    public DomainUser getUser(@PathVariable int userId) {
        DomainUser domainUser = userService.findById(userId);

        if (domainUser == null) {
            throw new UserNotFoundException(userId);
        }
        return domainUser;
    }

    @PostMapping("/users")
    public DomainUser createUser(@RequestBody DomainUser domainUser) {
        // just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        domainUser.setId(0);

        userService.createOrUpdate(domainUser);
        return domainUser;
    }

    @PutMapping("/users/{userId}")
    public DomainUser updateUser(@RequestBody DomainUser domainUser, @PathVariable int userId) {
        domainUser.setId(userId);
        try {
            userService.createOrUpdate(domainUser);
        } catch (Exception e) {
            throw new UserNotFoundException(userId);
        }

        return domainUser;
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEntity deleteUser(@PathVariable int userId) {
        DomainUser domainUser = userService.findById(userId);

        if (domainUser == null) {
            throw new UserNotFoundException(userId);
        }

        userService.deleteById(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
