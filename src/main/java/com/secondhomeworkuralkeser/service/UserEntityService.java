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

        return userDao.findAll();
    }

    public List<User> findByUserName(String userName){

        return userDao.findByUserName(userName);
    }

    public  List<User> findByPhoneNumber(String phoneNumber){

        return userDao.findByPhoneNumber(phoneNumber);
    }


    public User save(User user){
        return userDao.save(user);
    }

    public void deleteById(Long id){
        userDao.deleteById(id);
    }
}
