package com.gurkanguldas.CustomerRestApi.exception;

public class CustomerNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -5299771053812700109L;

	public CustomerNotFoundException(String message)
	{
		super(message);
	}
}
