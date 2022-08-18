package com.tera.codingtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tera.codingtest.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer>{
	
	List<Comment> findById(int id);

}
