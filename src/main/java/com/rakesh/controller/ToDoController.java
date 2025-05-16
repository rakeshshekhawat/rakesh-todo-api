package com.rakesh.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.common.ToDoNotFoundExecption;
import com.rakesh.model.ToDo;
import com.rakesh.service.ToDoService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/todos")
public class ToDoController {

	@Autowired
	ToDoService service;
	
	@GetMapping
	public ResponseEntity<ToDo> getTodos(){
		return new ResponseEntity<ToDo>( (ToDo) service.getTodos(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ToDo> getTodoById(@PathVariable UUID id) throws ToDoNotFoundExecption{
		return new ResponseEntity<ToDo>( (ToDo) service.getTodosById(id),HttpStatus.OK);//service.getTodosById(id);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTodoById(@PathVariable UUID id) throws ToDoNotFoundExecption{
		service.deleteTodoById(id);
		return  ResponseEntity.noContent().build();//service.getTodosById(id);
	}
	
	@PostMapping("/save")
	public ResponseEntity<ToDo> saveTodo(@Valid @RequestBody ToDo todo) {
		//System.out.println(todo);
		return new ResponseEntity<ToDo>( service.saveTodos(todo),HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<ToDo> updateTodo(@Valid @RequestBody ToDo todo) throws ToDoNotFoundExecption {
		return new ResponseEntity<ToDo>(service.updateTodo(todo),HttpStatus.OK);
	}
	
	}
