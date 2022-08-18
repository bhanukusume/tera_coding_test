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
	
	

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(int userId, String title, String body, List<Comment> comments) {
		super();
		this.userId = userId;
		this.title = title;
		this.body = body;
		this.comments = comments;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	} 
	
	
	
}
