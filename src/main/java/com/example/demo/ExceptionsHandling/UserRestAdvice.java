package com.example.demo.ExceptionsHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.Exceptions.IllegalIputException;

@RestControllerAdvice
public class UserRestAdvice {


	@ExceptionHandler(value = { IllegalArgumentException.class, IllegalAccessException.class })
	protected String handleConflict() {
		return "greska";
	}

//	@ExceptionHandler(value = {IllegalIputException.class})
//	protected String handlingMyException(IllegalIputException e) {
//		return e.getMessage();
//		
//	}

	@ExceptionHandler
	protected ResponseEntity<String> handleInterceptorException(IllegalIputException exception){
		return new ResponseEntity<String>(exception.getMessage(), HttpStatus.PRECONDITION_FAILED);
	}
}
