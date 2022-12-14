package com.tera.codingtest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Todo")
public class Todo {
	
	private int userId;
	
	@Id
	@GeneratedValue
	private int id;
	private String title;
	private boolean completed;
	
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Todo(int userId, String title, boolean completed) {
		super();
		this.userId = userId;
		this.title = title;
		this.completed = completed;
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
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	

}
