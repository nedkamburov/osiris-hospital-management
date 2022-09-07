package com.healthcare.management.system.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final DomainUserDAO userDAO;

    @Override
    public List<DomainUser> findAll() {
        return userDAO.findAll();
    }

    @Override
    public DomainUser createOrUpdate(DomainUser domainUser) {
        userDAO.createOrUpdate(domainUser);
        return domainUser;
    }

    @Override
    public DomainUser findById(int theId) {
        return userDAO.findById(theId);
    }

    @Override
    public void deleteById(int theId) {
        userDAO.deleteById(theId);
    }
}
