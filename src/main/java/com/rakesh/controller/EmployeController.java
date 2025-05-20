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
import com.rakesh.model.Employee;
import com.rakesh.service.EmpService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/employe")
public class EmployeController {

	@Autowired
	EmpService service;
	
	@GetMapping
	public ResponseEntity<Employee> getEmp(){
		return new ResponseEntity<Employee>( (Employee) service.getEmp(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmpById(@PathVariable UUID id){
		return new ResponseEntity<Employee>( HttpStatus.OK);//service.getTodosById(id);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmpById(@PathVariable UUID id) {
		service.deleteEmpById(id);
		return  ResponseEntity.noContent().build();//service.getTodosById(id);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmp(@Valid @RequestBody Employee emp) {
		return new ResponseEntity<Employee>( service.saveEmp(emp),HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmp(@Valid @RequestBody Employee emp) throws ToDoNotFoundExecption {
		return new ResponseEntity<Employee>(service.updateEmp(emp),HttpStatus.OK);
	}
}
