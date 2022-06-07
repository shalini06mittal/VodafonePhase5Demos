package com.boot.db.SpringWebDemo.rest;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.boot.db.SpringWebDemo.entity.ResponsePage;

@ControllerAdvice
public class ControllerExcpetionHandler {

	public ControllerExcpetionHandler() {
		System.out.println("controller advice constructor");
	}
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException e)
	{
		System.out.println("handle exception");
		return  ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(new ResponsePage("FAILURE", e.getMessage()));
	}
	@ExceptionHandler(EntityExistsException.class)
	public ResponseEntity<Object> handleEntityExists(EntityExistsException e)
	{
		System.out.println("handle exception");
		return  ResponseEntity
				.status(HttpStatus.NOT_FOUND)
				.body(new ResponsePage("FAILURE", e.getMessage()));
	}
}
