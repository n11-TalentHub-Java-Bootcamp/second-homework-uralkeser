package com.secondhomeworkuralkeser.converter;


import com.secondhomeworkuralkeser.dto.UserDto;
import com.secondhomeworkuralkeser.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    List<UserDto> convertAllUserListToUserDtoList (List<User> userList);
}
