package com.secondhomeworkuralkeser.service;

import com.secondhomeworkuralkeser.dao.CommentDao;
import com.secondhomeworkuralkeser.entity.ProductComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentEntityService {

    @Autowired
    CommentDao commentDao;

    public List<ProductComment> findAllCommentsByUserId(Long id){

        return commentDao.findAllByUserId(id);

    }

    public List<ProductComment> findAllCommentsByProductId(Long id){

        return commentDao.findAllByProductId(id);

    }

    public ProductComment save(ProductComment productComment){

        return commentDao.save(productComment);
    }

    public void deleteById(Long id){
        commentDao.deleteById(id);
    }

}
