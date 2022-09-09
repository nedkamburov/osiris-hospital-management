package com.healthcare.management.system.domain;

import com.healthcare.management.system.domain.exceptions.UserNotFoundException;
import com.healthcare.management.system.domain.model.DomainUser;
import lombok.RequiredArgsConstructor;
import org.hibernate.StaleStateException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
        DomainUser domainUser = userDAO.findById(theId);

        if (domainUser == null) {
            throw new UserNotFoundException(theId);
        }
        return domainUser;
    }

    @Override
    public ResponseEntity<Object> deleteById(int theId) {
        DomainUser domainUser = userDAO.findById(theId);

        if (domainUser == null) {
            throw new UserNotFoundException(theId);
        }

        userDAO.deleteById(theId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
