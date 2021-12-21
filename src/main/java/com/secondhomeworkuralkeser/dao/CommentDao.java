package com.secondhomeworkuralkeser.dao;

import com.secondhomeworkuralkeser.entity.ProductComment;
import com.secondhomeworkuralkeser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao extends JpaRepository<ProductComment,Long> {

    List<ProductComment> findAllByUserId(User id);
}
