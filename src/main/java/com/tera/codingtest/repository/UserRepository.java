package com.tera.codingtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tera.codingtest.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	List<User> findAll();

}
