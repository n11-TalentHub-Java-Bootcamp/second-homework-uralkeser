package com.secondhomeworkuralkeser.dao;

import com.secondhomeworkuralkeser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    List<User> findAll();

    List<User> findByUserName(String userName);

    List<User> findByPhoneNumber(String phoneNumber);

    void deleteById(Long id);
}
