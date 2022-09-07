package com.healthcare.management.system.domain;

import com.healthcare.management.system.domain.model.DomainUser;

import java.util.List;

public interface DomainUserDAO {

    public List<DomainUser> findAll();
    public void createOrUpdate(DomainUser domainUser);
    public DomainUser findById(int theId);
    public void deleteById(int theId);
}
