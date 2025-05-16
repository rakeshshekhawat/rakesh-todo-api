package com.rakesh.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.model.ToDo;
@Repository
public interface ToDoRepo extends JpaRepository<ToDo, UUID>{

	
}
