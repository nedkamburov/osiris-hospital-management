package com.healthcare.management.system.rest.mapper;

import com.healthcare.management.system.domain.model.DomainUser;
import com.healthcare.management.system.rest.dto.AddUserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AddUserRestMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public AddUserDTO toDTO(DomainUser domainUser) {
        AddUserDTO userDTO = modelMapper.map(domainUser, AddUserDTO.class);

        return userDTO;
    }

    public DomainUser fromDTO(AddUserDTO userDTO) {
        DomainUser domainUser = modelMapper.map(userDTO, DomainUser.class);

        return domainUser;
    }
}
