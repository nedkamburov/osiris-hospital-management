package com.healthcare.management.system.rest.service;

import com.healthcare.management.system.rest.dao.UserDAO;
import com.healthcare.management.system.rest.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO theUserDAO) {userDAO = theUserDAO;}

    @Override
    @Transactional
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    @Transactional
    public void createOrUpdate(User theUser) {
        userDAO.createOrUpdate(theUser);
    }

    @Override
    @Transactional
    public User findById(int theId) {
        return userDAO.findById(theId);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        userDAO.deleteById(theId);
    }
}
