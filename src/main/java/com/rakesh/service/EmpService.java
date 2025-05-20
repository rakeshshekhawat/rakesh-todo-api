package com.rakesh.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.model.Employee;
import com.rakesh.repository.EmpRepository;

import jakarta.validation.Valid;

@Service
public class EmpService {
	
	@Autowired
	EmpRepository empRepo;

	public List<Employee> getEmp() {
		return empRepo.findAll();
	}

	public Optional<Employee> getEmpById(UUID id) {
		return empRepo.findById(id);
	}

	public void deleteEmpById(UUID id) {
		empRepo.deleteById(id);
	}

	public Employee saveEmp( Employee emp) {
		return empRepo.saveAndFlush(emp);
	}

	public Employee updateEmp( Employee emp) {
		return empRepo.saveAndFlush(emp);
	}

}
