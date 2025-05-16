package com.rakesh.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ToDo {

	@Id
	@GeneratedValue
	public UUID id;
	@Column(name="TODOUSER")
	private String user;
	
	private String task;
	
	@Column(name="TARGATEDATE")
	private LocalDate targetDate;
	
	private boolean done;
	
}
