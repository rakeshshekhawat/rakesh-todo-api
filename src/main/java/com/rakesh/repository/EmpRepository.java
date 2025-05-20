package com.rakesh.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.model.Employee;

@Repository
public interface EmpRepository  extends JpaRepository<Employee, UUID>{

}
