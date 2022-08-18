package com.tera.codingtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tera.codingtest.model.Comment;
import com.tera.codingtest.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	CommentRepository commentRepository;
	
	public List<Comment> findAll(){
		return commentRepository.findAll();
	}

}
