package com.gurkanguldas.CustomerRestApi.message;

public class CustomerSwaggerMessage {
	public static final String CUSTOMER_TAG_DESCRIPTION = "Within the header contains the endpoints used for the customer. Endpoints perform manipulation.";
	public static final String CUSTOMER_TAG_NAME        = "Customer Rest API";

	public static final String CUSTOMER_OPERATION_GET_ID_SUMMARY        = "Finds a customer.";
	public static final String CUSTOMER_OPERATION_GET_ID_DESCRIPTION    = "Finds a customer by their Id.";
	public static final String CUSTOMER_PARAMETER_GET_ID_ID_DESCRIPTION = "The Id of the customer to find.";

	public static final String CUSTOMER_OPERATION_GET_ALL_SUMMARY            = "Brings customers according to a certain rule.";
	public static final String CUSTOMER_OPERATION_GET_ALL_DESCRIPTION        = "Fill in the fields appropriately for sorting, pagination and filtering.";
	public static final String CUSTOMER_PARAMETER_GET_ALL_SORT_DESCRIPTION   = "It is determined by which feature the sorting will be made.[nickname, customerInfo.name, customerContact.city ...]";
	public static final String CUSTOMER_PARAMETER_GET_ALL_TYPE_DESCRIPTION   = "It is determined how the sorting will be done.[true: Z-A, false: A-Z";
	public static final String CUSTOMER_PARAMETER_GET_ALL_SIZE_DESCRIPTION   = "The size of the page is determined.";
	public static final String CUSTOMER_PARAMETER_GET_ALL_PAGE_DESCRIPTION   = "Switches to the specified page.";
	public static final String CUSTOMER_PARAMETER_GET_ALL_QUARY_DESCRIPTION  = "The filter is determined.[between, like, in, equals, not_equals,greater_than_or_equal, less_than_or_equal]";
	public static final String CUSTOMER_PARAMETER_GET_ALL_TABLE_DESCRIPTION  = "The table is determined.[customer, customer_information, customer_contact]";
	public static final String CUSTOMER_PARAMETER_GET_ALL_COLUMN_DESCRIPTION = "The column is determined.[nickname, name, gender, country, city, ...]";
	public static final String CUSTOMER_PARAMETER_GET_ALL_VALUE1_DESCRIPTION = "The required value for the filter is entered.";
	public static final String CUSTOMER_PARAMETER_GET_ALL_VALUE2_DESCRIPTION = "The required value for the filter is entered.[Only Between]";

	public static final String CUSTOMER_OPERATION_ADD_SUMMARY              = "Adding customers to database.";
	public static final String CUSTOMER_OPERATION_ADD_DESCRIPTION          = "Adds the customer object to the database.";
	public static final String CUSTOMER_PARAMETER_ADD_CUSTOMER_DESCRIPTION = "It is necessary to fill in all the fields in the customer object to be added.";

	public static final String CUSTOMER_OPERATION_DELETE_ID_SUMMARY        = "Deletes a customer.";
	public static final String CUSTOMER_OPERATION_DELETE_ID_DESCRIPTION    = "Deletes a customer by their Id.";
	public static final String CUSTOMER_PARAMETER_DELETE_ID_ID_DESCRIPTION = "The Id of the customer to delete.";

	public static final String CUSTOMER_LOGIN_TAG_DESCRIPTION = "Used to receive tokens along with customer login.";
	public static final String CUSTOMER_LOGIN_TAG_NAME        = "Customer Login";

	public static final String CUSTOMER_LOGIN_OPERATION_TOKEN_SUMMARY              = "Customer authorization.";
	public static final String CUSTOMER_LOGIN_OPERATION_TOKEN_DESCRIPTION          = "Getting jwt token and authorizing customer.";
	public static final String CUSTOMER_LOGIN_PARAMETER_TOKEN_CUSTOMER_DESCRIPTION = "Enter nickname and password (token field must be blank).";

}
