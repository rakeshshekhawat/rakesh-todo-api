package com.rakesh.model;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends Person{

	private String name;
	@Min(value=18,message = "age must be greater or equal to 18 years")
	@Max(value = 65,message = "age should not be greater than 65 years")
	private int age;
	
	private int mobile;
	@Pattern(regexp = "^[0-9]" ,message="adhar no. must be numbers only")
	private String adhar;
}
