package com.secondhomeworkuralkeser.controller;

import com.secondhomeworkuralkeser.converter.CommentConverter;
import com.secondhomeworkuralkeser.converter.UserConverter;
import com.secondhomeworkuralkeser.dto.CommentDto;
import com.secondhomeworkuralkeser.entity.ProductComment;
import com.secondhomeworkuralkeser.service.CommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    CommentEntityService commentEntityService;


    @GetMapping("/allCommentsByUser/{id}")
    public List<CommentDto> findAllProductCommentsByUserId(@PathVariable Long id){
        List<ProductComment> commentList = commentEntityService.findAllCommentsByUserId(id);

        List<CommentDto> commentDtoList = CommentConverter.INSTANCE.convertAllCommentListToCommentDtoList(commentList);

        return commentDtoList;
    }

    @GetMapping("/allCommentsByProduct/{id}")
    public List<CommentDto> findAllProductCommentsByProductId(@PathVariable Long id){
        List<ProductComment> commentList = commentEntityService.findAllCommentsByProductId(id);

        List<CommentDto> commentDtoList = CommentConverter.INSTANCE.convertAllCommentListToCommentDtoList(commentList);

        return commentDtoList;
    }

    @PutMapping("")
    public List<CommentDto> update(@RequestBody CommentDto commentDto){

        ProductComment productComment = CommentConverter.INSTANCE.convertAllCommentDtoListToCommentList(commentDto);

        commentEntityService.save(productComment);

        List<ProductComment> commentList = new ArrayList<ProductComment>();

        commentList.add(productComment);

        List<CommentDto> commentDtoList = CommentConverter.INSTANCE.convertAllCommentListToCommentDtoList(commentList);

        return commentDtoList;

    }


    @DeleteMapping("/{id}")
    public void deleteComment (@PathVariable Long id){

        commentEntityService.deleteById(id);

    }

}
