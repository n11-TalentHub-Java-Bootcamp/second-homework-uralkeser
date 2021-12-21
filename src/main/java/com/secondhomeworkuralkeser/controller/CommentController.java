package com.secondhomeworkuralkeser.controller;

import com.secondhomeworkuralkeser.converter.UserConverter;
import com.secondhomeworkuralkeser.dto.CommentDto;
import com.secondhomeworkuralkeser.entity.ProductComment;
import com.secondhomeworkuralkeser.service.CommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    CommentEntityService commentEntityService;

    @GetMapping("/allComments")
    public List<ProductComment> findAll(){

//        List<ProductComment> commentList = commentEntityService.findAll();

//        List<CommentDto> commentDtoList = UserConverter.INSTANCE.convertAllUserListToUserDtoList(commentList);

        return null;
    }

}
