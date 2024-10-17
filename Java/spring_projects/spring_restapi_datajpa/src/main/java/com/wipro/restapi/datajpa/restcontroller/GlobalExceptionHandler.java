package com.wipro.restapi.datajpa.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.restapi.datajpa.exceptions.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	@ResponseStatus(reason="Emp not found globally ", code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(EmployeeNotFoundException.class)
	public  void  handleException() {
		
		
		
	}
	
	
	@ExceptionHandler(NullPointerException.class)
	public  ResponseEntity<String>  handleException2() {
		
		return new ResponseEntity<String>("emp object is null",HttpStatus.NOT_ACCEPTABLE);
		
		
	}
	
	

}
