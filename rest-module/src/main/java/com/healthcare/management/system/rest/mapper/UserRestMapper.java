package com.healthcare.management.system.rest.mapper;

import com.healthcare.management.system.domain.DomainUser;
import com.healthcare.management.system.rest.dto.AddUserDTO;
import com.healthcare.management.system.rest.dto.UpdateUserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserRestMapper {

    public AddUserDTO toAddUserDTO(DomainUser domainUser) {
        AddUserDTO userDTO = new AddUserDTO();
        userDTO.setUsername(domainUser.getUsername());
        userDTO.setPassword(domainUser.getPassword());
        userDTO.setEmail(domainUser.getEmail());
        userDTO.setFirstName(domainUser.getFirstName());
        userDTO.setLastName(domainUser.getLastName());
        userDTO.setRole(domainUser.getRole());

        return userDTO;
    }

    public DomainUser fromAddUserDTO(AddUserDTO userDTO) {
        DomainUser domainUser = new DomainUser();
        domainUser.setUsername(userDTO.getUsername());
        domainUser.setPassword(userDTO.getPassword());
        domainUser.setEmail(userDTO.getEmail());
        domainUser.setFirstName(userDTO.getFirstName());
        domainUser.setLastName(userDTO.getLastName());
        domainUser.setRole(userDTO.getRole());

        return domainUser;
    }

    public UpdateUserDTO toUpdateUserDTO(DomainUser domainUser) {
        UpdateUserDTO userDTO = new UpdateUserDTO();
        userDTO.setUsername(domainUser.getUsername());
        userDTO.setPassword(domainUser.getPassword());
        userDTO.setEmail(domainUser.getEmail());
        userDTO.setFirstName(domainUser.getFirstName());
        userDTO.setLastName(domainUser.getLastName());
        userDTO.setRole(domainUser.getRole());

        return userDTO;
    }

    public DomainUser fromUpdateUserDTO(UpdateUserDTO userDTO) {
        DomainUser domainUser = new DomainUser();
        domainUser.setUsername(userDTO.getUsername());
        domainUser.setPassword(userDTO.getPassword());
        domainUser.setEmail(userDTO.getEmail());
        domainUser.setFirstName(userDTO.getFirstName());
        domainUser.setLastName(userDTO.getLastName());
        domainUser.setRole(userDTO.getRole());

        return domainUser;
    }
}
