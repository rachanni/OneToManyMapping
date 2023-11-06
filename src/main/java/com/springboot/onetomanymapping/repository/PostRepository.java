package com.springboot.onetomanymapping.repository;

import com.springboot.onetomanymapping.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post,Long> {

}
