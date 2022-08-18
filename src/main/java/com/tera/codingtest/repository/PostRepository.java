package com.tera.codingtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tera.codingtest.model.Comment;
import com.tera.codingtest.model.Post;

public interface PostRepository extends JpaRepository<Post,Integer>{
	
	Post findById(int id);


}
