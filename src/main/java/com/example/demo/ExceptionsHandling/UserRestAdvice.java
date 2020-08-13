package com.example.demo.ExceptionsHandling;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.Exceptions.IllegalIputException;
import com.example.demo.Exceptions.NoUserFound;

@RestControllerAdvice
public class UserRestAdvice {

	@ExceptionHandler(value= {NoUserFound.class, NoSuchElementException.class})
	protected ResponseEntity<String> notFoundHandler() {
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = { IllegalArgumentException.class, IllegalAccessException.class })
	protected String handleConflict() {
		return "greska";
	}



	@ExceptionHandler
	protected ResponseEntity<String> handleInterceptorException(IllegalIputException exception){
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.PRECONDITION_FAILED);
	}
}
