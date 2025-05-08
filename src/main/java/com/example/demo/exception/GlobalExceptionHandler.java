package com.example.demo.exception;

import com.example.demo.utility.*;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseStatus handleUserNotFoundException(UserNotFoundException ex)
	{
		return new ResponseStatus(200,ex.getMessage());
	
	}
	@ExceptionHandler(NoResourceFoundException.class)
	public String demo(NoResourceFoundException e)
	{
	
		return "Page Not Found";
		
	}

}
