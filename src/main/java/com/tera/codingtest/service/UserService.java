package com.tera.codingtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tera.codingtest.model.Comment;
import com.tera.codingtest.model.User;
import com.tera.codingtest.repository.CommentRepository;
import com.tera.codingtest.repository.UserRepository;

public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<User> findAll(){
	System.out.println(userRepository.findAll());
		return userRepository.findAll();
	}


}
