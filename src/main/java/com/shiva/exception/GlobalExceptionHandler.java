package com.shiva.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)  
	//override method of ResponseEntityExceptionHandler class  
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request)  
	{  
	//creating exception response structure  
	ExceptionResponse exceptionResponse= new ExceptionResponse( ex.getMessage(),request.getDescription(false),new Date());  
	//returning exception structure and Internal Server status   
	return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);  
	}  
	@ExceptionHandler(StudentNotFound.class)  
	//override method of ResponseEntityExceptionHandler class  
	public final ResponseEntity<Object> handleUserNotFoundExceptions(StudentNotFound ex, WebRequest request)  
	{  
	//creating exception response structure  
	ExceptionResponse exceptionResponse= new ExceptionResponse(ex.getMessage(), request.getDescription(false),new Date());  
	//returning exception structure and Not Found status   
	return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);  
	}     
	}