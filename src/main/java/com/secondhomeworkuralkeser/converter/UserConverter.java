package com.secondhomeworkuralkeser.converter;


import com.secondhomeworkuralkeser.dto.UserDto;
import com.secondhomeworkuralkeser.entity.User;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    List<UserDto> convertAllUserListToUserDtoList (List<User> userList);

    User convertAllUserDtoListToUserList(UserDto userDto);

    @AfterMapping
    default void setNulls(@MappingTarget User user, UserDto userDto){
        if (userDto.getId() == null){
            user.setId(null);
        }
    }

}