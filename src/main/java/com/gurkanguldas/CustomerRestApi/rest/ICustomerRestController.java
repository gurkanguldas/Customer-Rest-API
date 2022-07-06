package com.gurkanguldas.CustomerRestApi.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

import com.gurkanguldas.CustomerRestApi.business.dto.CustomerDto;
import com.gurkanguldas.CustomerRestApi.message.CustomerSwaggerMessage;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * Swagger settings.
 * 
 * @author Gurkan
 *
 */
@Tag(description = CustomerSwaggerMessage.CUSTOMER_TAG_DESCRIPTION, name = CustomerSwaggerMessage.CUSTOMER_TAG_NAME)
public interface ICustomerRestController {

	@Operation(summary = CustomerSwaggerMessage.CUSTOMER_OPERATION_GET_ID_SUMMARY, 
               description = CustomerSwaggerMessage.CUSTOMER_OPERATION_GET_ID_DESCRIPTION, 
               security = @SecurityRequirement(name = "bearerAuth"))
	ResponseEntity<?> getCustomerById(
            @Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ID_ID_DESCRIPTION) Long personId);

	
	@Operation(summary = CustomerSwaggerMessage.CUSTOMER_OPERATION_GET_ALL_SUMMARY, 
               description = CustomerSwaggerMessage.CUSTOMER_OPERATION_GET_ALL_DESCRIPTION, 
               security = @SecurityRequirement(name = "bearerAuth"))
	ResponseEntity<?> getCustomers(
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_SORT_DESCRIPTION)   String sortType,
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_TYPE_DESCRIPTION)   boolean descending,
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_SIZE_DESCRIPTION)   int pageSize,
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_PAGE_DESCRIPTION)   int pageNo,
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_QUARY_DESCRIPTION)  String quary,
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_TABLE_DESCRIPTION)  String table,
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_COLUMN_DESCRIPTION) String column,
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_VALUE1_DESCRIPTION) Object value1,
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_GET_ALL_VALUE2_DESCRIPTION) Object value2);

	
	@Operation(summary = CustomerSwaggerMessage.CUSTOMER_OPERATION_ADD_SUMMARY, 
               description = CustomerSwaggerMessage.CUSTOMER_OPERATION_ADD_DESCRIPTION)
	ResponseEntity<?> addCustomer(
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_ADD_CUSTOMER_DESCRIPTION) CustomerDto customerDto,
			BindingResult bindingResult);

	
	@Operation(summary = CustomerSwaggerMessage.CUSTOMER_OPERATION_DELETE_ID_SUMMARY, 
               description = CustomerSwaggerMessage.CUSTOMER_OPERATION_DELETE_ID_DESCRIPTION, 
               security = @SecurityRequirement(name = "bearerAuth"))
	public ResponseEntity<?> deleteCustomerById(
			@Parameter(description = CustomerSwaggerMessage.CUSTOMER_PARAMETER_DELETE_ID_ID_DESCRIPTION) Long personId);

}
