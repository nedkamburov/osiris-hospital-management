package com.healthcare.management.system.rest.mapper;

import com.healthcare.management.system.domain.model.DomainUser;
import com.healthcare.management.system.rest.dto.UpdateUserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UpdateUserRestMapper{
    private final ModelMapper modelMapper = new ModelMapper();

    public UpdateUserDTO toDTO(DomainUser domainUser){
        UpdateUserDTO userDTO = modelMapper.map(domainUser, UpdateUserDTO.class);

        return userDTO;
    }

    public DomainUser fromDTO(UpdateUserDTO userDTO){
        DomainUser domainUser = modelMapper.map(userDTO, DomainUser.class);

        return domainUser;
    }
}
