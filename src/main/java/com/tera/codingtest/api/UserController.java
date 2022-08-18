package com.tera.codingtest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tera.codingtest.model.Comment;
import com.tera.codingtest.model.Post;
import com.tera.codingtest.model.User;
import com.tera.codingtest.repository.CommentRepository;
import com.tera.codingtest.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	CommentRepository commentRepository;
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/{userid}/posts")  
	public List<Post> retriveAllPosts(@PathVariable int userid)  
	{
		return null;  
		
	}
	
	@GetMapping("/comments")  
	public List<Comment> retriveAllComments( )  
	{
		return commentRepository.findAll();  
		
	}
	
	@GetMapping("/users")  
	public List<User> retriveAllUsers( )  
	{
		return userRepository.findAll();  
		
	}

	
//	@PostMapping("/{userid}/posts")  
//	public List<Post> savePosts(@RequestBody Person person)  
//	{
//		return null;  
//		
//	}

}
