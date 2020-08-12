package com.example.demo.ExceptionsHandling;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserRestAdvice {
	
	
	
	@ExceptionHandler(value 
		      = { IllegalArgumentException.class, IllegalAccessException.class })
		   
	protected  String handleConflict(){
		return "grska";
		
	}
		      

}

