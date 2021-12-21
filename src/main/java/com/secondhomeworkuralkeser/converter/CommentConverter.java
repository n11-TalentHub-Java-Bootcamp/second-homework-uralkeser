package com.secondhomeworkuralkeser.converter;


import com.secondhomeworkuralkeser.dto.CommentDto;
import com.secondhomeworkuralkeser.entity.ProductComment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CommentConverter {

    CommentConverter INSTANCE = Mappers.getMapper(CommentConverter.class);

    List<CommentDto> convertAllCommentListToCommentDtoList (List<ProductComment> commentList);

    ProductComment convertAllCommentDtoListToCommentList(CommentDto commentDto);


}
