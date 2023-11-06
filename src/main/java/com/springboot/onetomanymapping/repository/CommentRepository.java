package com.springboot.onetomanymapping.repository;

import com.springboot.onetomanymapping.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
