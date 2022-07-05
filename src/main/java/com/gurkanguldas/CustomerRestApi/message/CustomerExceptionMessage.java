package com.gurkanguldas.CustomerRestApi.message;

public class CustomerExceptionMessage {
	public static final String CUSTOMER_NICKNAME_NOT_FOUND = "Customer nickname could not be returned because it does not exist.";
	public static final String CUSTOMER_ID_NOT_FOUND       = "Customer ID  could not be deleted because it does not exist. ID: ";
	public static final String CUSTOMER_EXIST_NICKNAME     = "Registration failed because the customer nickname was used.";
	public static final String CUSTOMER_EXIST_IDENTITY     = "Registration failed because the customer identity was used.";
}
