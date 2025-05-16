package com.rakesh.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.common.ToDoNotFoundExecption;
import com.rakesh.model.ToDo;
import com.rakesh.repository.ToDoRepo;

@Service
public class ToDoService {

	@Autowired
	ToDoRepo repo;

	public List<ToDo> getTodos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public ToDo getTodosById(UUID id) throws ToDoNotFoundExecption {
		// TODO Auto-generated method stub
		return  repo.findById(id).orElseThrow(ToDoNotFoundExecption::new);
	}

	public ToDo saveTodos(ToDo todo) {
		// TODO Auto-generated method stub
		System.out.println(todo);
		return repo.save(todo);
	
	}
	
	public ToDo updateTodo(ToDo todo) throws ToDoNotFoundExecption {
		// TODO Auto-generated method stub
	//	Todo oldTodo = repo.fin 
		getTodosById(todo.id);
		return repo.saveAndFlush(todo);
		
	}

	public boolean deleteTodoById(UUID id) throws ToDoNotFoundExecption {
		// TODO Auto-generated method stub
		getTodosById(id);
		repo.deleteById(id);
		return true;
	}
	
}
