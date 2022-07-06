package com.gurkanguldas.CustomerRestApi.exception;

public class CustomerValidateException extends RuntimeException 
{
	private static final long serialVersionUID = 989510129203062148L;

	public CustomerValidateException(String message) 
	{
		super(message);
	}
}
