package com.gurkanguldas.CustomerRestApi.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.log4j.Log4j2;

@RestControllerAdvice
@Log4j2
public class GenericExceptionHandling 
{
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<?> notfoundException(CustomerNotFoundException exception) 
	{
		log.error(exception.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(prepareResponse(exception.getMessage()));
	}

	@ExceptionHandler(CustomerValidateException.class)
	public ResponseEntity<?> validateException(CustomerValidateException exception) 
	{
		log.error(exception.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(prepareResponse(exception.getMessage()));
	}

	@ExceptionHandler(ExistingCustomerException.class)
	public ResponseEntity<?> existingException(ExistingCustomerException exception)
	{
		log.error(exception.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(prepareResponse(exception.getMessage()));
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Object> handle(IllegalArgumentException exception) 
	{
		log.error(exception.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(prepareResponse(exception.getMessage()));
	}

	// Mapping Response Messages
	private Map<String, String> prepareResponse(String message) 
	{
		Map<String, String> response = new HashMap<String, String>();
		response.put("message", message);
		return response;
	}
}
