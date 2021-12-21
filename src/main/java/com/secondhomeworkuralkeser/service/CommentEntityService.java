package com.secondhomeworkuralkeser.service;

import com.secondhomeworkuralkeser.dao.CommentDao;
import com.secondhomeworkuralkeser.entity.ProductComment;
import com.secondhomeworkuralkeser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentEntityService {

    @Autowired
    CommentDao commentDao;

    public List<ProductComment> findAllCommentsByUserId(User id){

//        return commentDao.findAllByUserId(id);

        return null;
    }


}
