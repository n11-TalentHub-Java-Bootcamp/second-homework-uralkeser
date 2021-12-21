package com.secondhomeworkuralkeser.dao;

import com.secondhomeworkuralkeser.entity.ProductComment;
import com.secondhomeworkuralkeser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao extends JpaRepository<ProductComment,Long> {

    @Query("select pc from ProductComment pc where pc.userId.id = :id")
    List<ProductComment> findAllByUserId(Long id);

    @Query("select pc from ProductComment pc where pc.productId.id = :id")
    List<ProductComment> findAllByProductId(Long id);

    void deleteById(Long id);
}
