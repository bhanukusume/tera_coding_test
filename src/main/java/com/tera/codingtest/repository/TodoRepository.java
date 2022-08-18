package com.tera.codingtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tera.codingtest.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer>{

}
