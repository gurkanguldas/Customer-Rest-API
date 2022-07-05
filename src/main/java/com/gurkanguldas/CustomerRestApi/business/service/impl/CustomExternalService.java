package com.gurkanguldas.CustomerRestApi.business.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.gurkanguldas.CustomerRestApi.business.dto.CustomerDto;
import com.gurkanguldas.CustomerRestApi.business.service.ICustomerExternalService;
import com.gurkanguldas.CustomerRestApi.business.service.ReturnModel;
import com.gurkanguldas.CustomerRestApi.data.dao.Customer;
import com.gurkanguldas.CustomerRestApi.exception.CustomerNotFoundException;
import com.gurkanguldas.CustomerRestApi.exception.CustomerValidateException;
import com.gurkanguldas.CustomerRestApi.exception.ExistingCustomerException;
import com.gurkanguldas.CustomerRestApi.message.CustomerExceptionMessage;


public class CustomExternalService implements ICustomerExternalService
{	
	@Override
	public ReturnModel<CustomerDto> getCustomerById(Optional<Customer> customer, Long id)
	{
		ReturnModel<CustomerDto> model = new ReturnModel<CustomerDto>(true, "getCustomerById", "Customer ID "+id+" was successfully returned.", null);
		
		customer.orElseThrow(() ->
		{
			model.setSuccesful(false);
			model.setCode("CustomerNotFoundException");
			model.setMessage(CustomerExceptionMessage.CUSTOMER_ID_NOT_FOUND + id);
			throw new CustomerNotFoundException(model.toString());
			
		});
		return model;
	}
	
	@Override
	public ReturnModel<CustomerDto> getCustomerByNickName(Optional<Customer> customer)
	{
		ReturnModel<CustomerDto> model = new ReturnModel<CustomerDto>(true, "getCustomerById", null, null);
		
		customer.orElseThrow(() ->
		{
			model.setSuccesful(false);
			model.setCode("CustomerNotFoundException");
			model.setMessage(CustomerExceptionMessage.CUSTOMER_NICKNAME_NOT_FOUND);
			throw new CustomerNotFoundException(model.toString());
			
		});
		model.setMessage("Customer Nickname "+customer.get().getNickname()+" was successfully returned.");
		return model;
	}
	
	@Override
	public ReturnModel<Set<CustomerDto>> getCustomers(Set<CustomerDto> customers)
	{
		return new ReturnModel<Set<CustomerDto>>(true, "getCustomers", "The customer list has been successfully called up.", customers);
	}
	
	@Override
	public ReturnModel<CustomerDto> addCustomer(CustomerDto customerDto, boolean name, boolean id, BindingResult bindingResult)
	{
		ReturnModel<CustomerDto> model = new ReturnModel<CustomerDto>(true, "addCustomer", "Customer registration successful.", null);
		
		if(bindingResult.hasErrors())
		{
			String errors = "";
			
			for (ObjectError error : bindingResult.getAllErrors())
            {
                errors += "defaultMessage: " + error.getDefaultMessage()+" ";
                errors += "objectName: " + error.getObjectName()+" ";
                errors += "field: " + error.getCodes()[0]+" ";
            }
			
			model.setSuccesful(false);
			model.setCode("CustomerValidateException");
			model.setMessage(errors);
			model.setResult(customerDto);
			throw new CustomerValidateException(model.toString());
		}
		
		if(name || id)
		{
			model.setSuccesful(false);
			model.setCode("ExistingCustomerException");
			
			if(id)
				model.setMessage(CustomerExceptionMessage.CUSTOMER_EXIST_IDENTITY);
			else
				model.setMessage(CustomerExceptionMessage.CUSTOMER_EXIST_NICKNAME);
			
			model.setResult(customerDto);
			throw new ExistingCustomerException(model.toString());
		}
		
		model.setResult(customerDto);
		
		return model ;
	}
	
	@Override
	public ReturnModel<CustomerDto> deleteCustomerById(Optional<Customer> customer, Long id)
	{
		ReturnModel<CustomerDto> model = new ReturnModel<CustomerDto>(true, "deleteCustomerById", "The customer with ID number "+id+" was deleted.", null);
		
		customer.orElseThrow(() -> 
		{
			model.setSuccesful(false);
			model.setCode("CustomerNotFoundException");
			model.setMessage(CustomerExceptionMessage.CUSTOMER_ID_NOT_FOUND + id);
			throw new CustomerNotFoundException(model.toString());
			
		});
		
		return model;
	}
}
