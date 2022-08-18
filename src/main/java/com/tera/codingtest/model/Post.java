package com.tera.codingtest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Post {

	private int userId;
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private String body;
	
	@OneToMany(targetEntity = Comment.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="pc_fk",referencedColumnName = "id")
	private List<Comment> comments; 
}
