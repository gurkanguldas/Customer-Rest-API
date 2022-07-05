package com.gurkanguldas.CustomerRestApi.exception;

public class ExistingCustomerException extends RuntimeException {

	private static final long serialVersionUID = 7844992076415918243L;

	public ExistingCustomerException(String message) {
		super(message);
	}
}
