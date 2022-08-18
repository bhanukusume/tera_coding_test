package com.tera.codingtest.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tera.codingtest.model.Post;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@GetMapping("/{userid}/posts")  
	public List<Post> retriveAllUsers(@PathVariable int userid)  
	{
		return null;  
		
	}

}
