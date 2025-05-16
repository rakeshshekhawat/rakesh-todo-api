package com.rakesh.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
	@NotBlank(message="User Cannot be Blank")
	private String user;
	
	@Size(min=3,max=200,message="Task should be b/w 3-200 charaters")
	private String task;
	
	@Column(name="TARGATEDATE")
	@FutureOrPresent(message="Target Date Cannot be in Past")
	private LocalDate targetDate;
	
	private boolean done;
	
}
