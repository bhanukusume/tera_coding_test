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

}
