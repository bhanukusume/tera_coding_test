package com.tera.codingtest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String email;
	@Embedded
	private Address address;
	private String phone;
	private String website;
	@Embedded
	private Company company;
	
	@OneToMany(targetEntity = Post.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="up_fk",referencedColumnName = "id")
	private List<Post> posts;
	
	@OneToMany(targetEntity = Todo.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="ut_fk",referencedColumnName = "id")
	private List<Todo> todos;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public User(String username, String email, Address address, String phone, String website, Company company,
			List<Post> posts, List<Todo> todos) {
		super();
		this.username = username;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
		this.posts = posts;
		this.todos = todos;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public void setTodos(List<Todo> todos) {
		this.todos = todos;
	}

}
