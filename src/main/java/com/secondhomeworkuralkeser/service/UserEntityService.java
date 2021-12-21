package com.secondhomeworkuralkeser.service;

import com.secondhomeworkuralkeser.dao.UserDao;
import com.secondhomeworkuralkeser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEntityService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll(){

        return (List<User>) userDao.findAll();
    }
}
