package com.healthcare.management.system.domain;


import java.util.List;

public interface UserService {

    public List<DomainUser> findAll();
    public void createOrUpdate(DomainUser domainUser);
    public DomainUser findById(int theId);
    public void deleteById(int theId);
}