package com.rakesh.model;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

	@Id
	@GeneratedValue
	private UUID id;
	private String designation;
	
}
