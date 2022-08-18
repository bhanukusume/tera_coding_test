package com.tera.codingtest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
 private int postId;
 @Id
 @GeneratedValue
 private int id;
 private String name;
 private String body;
public Comment() {
	super();
	// TODO Auto-generated constructor stub
}
public Comment(int postId, int id, String name, String body) {
	super();
	this.postId = postId;
	this.id = id;
	this.name = name;
	this.body = body;
}
public int getPostId() {
	return postId;
}
public void setPostId(int postId) {
	this.postId = postId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
 
 
}
