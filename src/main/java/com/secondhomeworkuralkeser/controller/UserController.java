package com.secondhomeworkuralkeser.controller;

import com.secondhomeworkuralkeser.converter.UserConverter;
import com.secondhomeworkuralkeser.dto.UserDto;
import com.secondhomeworkuralkeser.entity.User;
import com.secondhomeworkuralkeser.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserEntityService userEntityService;

    //2.1:Tüm kullanıcıları getiren servis.
    @GetMapping("/allUsers")
    public List<User> findAll(){

        List<User> userList = userEntityService.findAll();

//        List<UserDto> userDtoList = UserConverter.INSTANCE.convertAllUserListToUserDtoList(userList);

        return userList;
    }



}
