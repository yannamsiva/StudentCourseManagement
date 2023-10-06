package com.shiva.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentNotFound extends Exception {

	
	public StudentNotFound(String msg)
	{
		super(msg);
	}
	
	
}
