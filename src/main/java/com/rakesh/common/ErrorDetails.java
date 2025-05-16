package com.rakesh.common;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.validation.FieldError;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ErrorDetails {

	private String errorCode;
	private String errorDetils;
	private LocalDateTime timeStamp;
	
	@JsonInclude(Include.NON_NULL)
	private List<FieldError> errorFields;
}
