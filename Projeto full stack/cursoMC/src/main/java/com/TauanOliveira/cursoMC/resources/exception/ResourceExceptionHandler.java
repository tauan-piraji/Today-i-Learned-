package com.TauanOliveira.cursoMC.resources.exception;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.TauanOliveira.cursoMC.services.exception.DataIntegrityException;

import javassist.tools.rmi.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request){
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
	@ExceptionHandler(DataIntegrityException.class)
	public ResponseEntity<StandardError> dataIntegrity(DataIntegrityException e, HttpServletRequest request){
		StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<StandardError> dataIntegrity(ConstraintViolationException e, HttpServletRequest request){
		ValidationError err = new ValidationError(HttpStatus.UNPROCESSABLE_ENTITY.value(), e.getMessage(), System.currentTimeMillis());
		for(ConstraintViolation<?> x : e.getConstraintViolations()) {
			err.addError(x.getPropertyPath().toString(), x.getMessage());
		}		
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(err);
	}
}