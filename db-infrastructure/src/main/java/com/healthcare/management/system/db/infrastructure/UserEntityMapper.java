package com.healthcare.management.system.db.infrastructure;

import com.healthcare.management.system.db.infrastructure.model.UserEntity;
import com.healthcare.management.system.domain.DomainUser;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {

    public DomainUser toDomainObject(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }

        DomainUser domainUser = new DomainUser(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
        domainUser.setId(userEntity.getId());
        domainUser.setFirstName(userEntity.getFirstName());
        domainUser.setLastName(userEntity.getLastName());
        domainUser.setRole(userEntity.getRole());

        return domainUser;
    }

    public UserEntity toEntityObject(DomainUser domainUser) {
        if (domainUser == null) {
            return null;
        }
        
        UserEntity userEntity = new UserEntity();
        userEntity.setId(domainUser.getId());
        userEntity.setUsername(domainUser.getUsername());
        userEntity.setPassword(domainUser.getPassword());
        userEntity.setEmail(domainUser.getEmail());
        userEntity.setFirstName(domainUser.getFirstName());
        userEntity.setLastName(domainUser.getLastName());
        userEntity.setRole(domainUser.getRole());

        return userEntity;
    }
}
