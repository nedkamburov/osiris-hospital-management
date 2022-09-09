package com.healthcare.management.system.rest.controller;

import com.healthcare.management.system.domain.exceptions.UserNotFoundException;
import com.healthcare.management.system.domain.model.DomainUser;
import com.healthcare.management.system.domain.UserService;
import com.healthcare.management.system.rest.dto.AddUserDTO;
import com.healthcare.management.system.rest.dto.UpdateUserDTO;
import com.healthcare.management.system.rest.mapper.AddUserRestMapper;
import com.healthcare.management.system.rest.mapper.UpdateUserRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final AddUserRestMapper addUserMapper;
    private final UpdateUserRestMapper updateUserMapper;

    @GetMapping("/users")
    public List<DomainUser> findAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{userId}")
    public DomainUser getUser(@PathVariable int userId) {
        return userService.findById(userId);
    }

    @PostMapping("/users")
    public AddUserDTO createUser(@RequestBody AddUserDTO userDTO) {
        return addUserMapper.toDTO(userService.createOrUpdate(addUserMapper.fromDTO(userDTO)));
    }

    @PutMapping("/users/{userId}")
    public UpdateUserDTO updateUser(@RequestBody UpdateUserDTO userDTO, @PathVariable int userId) {
        userDTO.setId(userId);

        try {
            return updateUserMapper.toDTO(userService.createOrUpdate(updateUserMapper.fromDTO(userDTO)));
        } catch (Exception e) {
            throw new UserNotFoundException(userId);
        }
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEntity deleteUser(@PathVariable int userId) {
        return userService.deleteById(userId);
    }
}
