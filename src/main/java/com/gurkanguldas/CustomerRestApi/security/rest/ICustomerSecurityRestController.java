package com.gurkanguldas.CustomerRestApi.security.rest;

import org.springframework.http.ResponseEntity;

import com.gurkanguldas.CustomerRestApi.message.CustomerSwaggerMessage;
import com.gurkanguldas.CustomerRestApi.security.data.CustomerLogin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Swagger settings.
 * 
 * @author Gurkan
 *
 */
@Tag(description = CustomerSwaggerMessage.CUSTOMER_LOGIN_TAG_DESCRIPTION, name = CustomerSwaggerMessage.CUSTOMER_LOGIN_TAG_NAME)

public interface ICustomerSecurityRestController {
	
	@Operation(summary = CustomerSwaggerMessage.CUSTOMER_LOGIN_OPERATION_TOKEN_SUMMARY, description = CustomerSwaggerMessage.CUSTOMER_LOGIN_OPERATION_TOKEN_DESCRIPTION)
	public ResponseEntity<?> createAuthenticationToken
	(@Parameter(description = CustomerSwaggerMessage.CUSTOMER_LOGIN_PARAMETER_TOKEN_CUSTOMER_DESCRIPTION) CustomerLogin customer)throws Exception;

}
