package com.gurkanguldas.CustomerRestApi.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.validation.BindingResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gurkanguldas.CustomerRestApi.business.dto.CustomerDto;
import com.gurkanguldas.CustomerRestApi.business.service.impl.CustomerService;
import com.gurkanguldas.CustomerRestApi.exception.CustomerNotFoundException;
import com.gurkanguldas.CustomerRestApi.exception.CustomerValidateException;
import com.gurkanguldas.CustomerRestApi.exception.ExistingCustomerException;
import com.gurkanguldas.CustomerRestApi.exception.GenericExceptionHandling;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@ExtendWith(MockitoExtension.class)
public class CustomerRestControllerExceptionTest 
{
	@Mock
	private CustomerService customerService;
	
	@InjectMocks
	private CustomerRestController customerRestController;
	
	MockMvc mvc;
	
	@BeforeEach
	void beforeEachMethod()
	{
		JacksonTester.initFields(this, new ObjectMapper());
		mvc = MockMvcBuilders.standaloneSetup(customerRestController).setControllerAdvice(new GenericExceptionHandling()).build();
	}
	
	@Test
	void GetCustomerUrlOperation_ThrowCustomerNotFoundException_GetStatus_NOT_FOUND() throws Exception
	{
		Mockito.when(customerService.getCustomerById(1L)).thenThrow(CustomerNotFoundException.class);
		
		MockHttpServletResponse response = mvc
                .perform(get("/customer/rest/api/getcustomer?id=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse();
		
		assertThat(response.getStatus()).isEqualTo(HttpStatus.NOT_FOUND.value());
	}
	
	@Test
	void DeleteCustomerUrlOperation_ThrowCustomerNotFoundException_GetStatus_NOT_FOUND() throws Exception
	{
		Mockito.when(customerService.deleteCustomerById(1L)).thenThrow(CustomerNotFoundException.class);
		
		MockHttpServletResponse response = mvc
                .perform(delete("/customer/rest/api/deletecustomer?id=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse();
		
		assertThat(response.getStatus()).isEqualTo(HttpStatus.NOT_FOUND.value());
	}
	
	@Test
	void AddCustomerUrlOperation_ThrowCustomerValidateException_GetStatus_BAD_REQUEST() throws Exception
	{
		Mockito.when(customerService.addCustomer(Mockito.any(CustomerDto.class), Mockito.any(BindingResult.class))).thenThrow(CustomerValidateException.class);
		
		MockHttpServletResponse response = mvc
                .perform(post("/customer/rest/api/addcustomer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(new CustomerDto()).getBytes(StandardCharsets.UTF_8))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse();
		
		assertThat(response.getStatus()).isEqualTo(HttpStatus.BAD_REQUEST.value());
	}

	@Test
	void AddCustomerUrlOperation_ThrowExistingCustomerException_GetStatus_BAD_REQUEST() throws Exception
	{
		Mockito.when(customerService.addCustomer(Mockito.any(CustomerDto.class), Mockito.any(BindingResult.class))).thenThrow(ExistingCustomerException.class);
		
		MockHttpServletResponse response = mvc
                .perform(post("/customer/rest/api/addcustomer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(new CustomerDto()).getBytes(StandardCharsets.UTF_8))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse();
		
		assertThat(response.getStatus()).isEqualTo(HttpStatus.BAD_REQUEST.value());
	}
}
