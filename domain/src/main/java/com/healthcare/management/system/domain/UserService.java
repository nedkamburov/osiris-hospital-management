package com.healthcare.management.system.domain;


import com.healthcare.management.system.domain.model.DomainUser;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    public List<DomainUser> findAll();
    public DomainUser createOrUpdate(DomainUser domainUser);
    public DomainUser findById(int theId);
    public ResponseEntity<Object> deleteById(int theId);
}
