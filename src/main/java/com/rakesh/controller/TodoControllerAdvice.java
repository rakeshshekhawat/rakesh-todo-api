package com.rakesh.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rakesh.common.ErrorDetails;
import com.rakesh.common.ToDoNotFoundExecption;

@RestControllerAdvice
public class TodoControllerAdvice {

	@ExceptionHandler(ToDoNotFoundExecption.class)
	public ResponseEntity<ErrorDetails> handleTodoNotFound(ToDoNotFoundExecption e){
		ErrorDetails ed=new ErrorDetails("404","Todo-404 Not Found",LocalDateTime.now(),null);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ed);
	}
	
}
