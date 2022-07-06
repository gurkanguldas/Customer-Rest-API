package com.gurkanguldas.CustomerRestApi.rest;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gurkanguldas.CustomerRestApi.business.dto.CustomerContactDto;
import com.gurkanguldas.CustomerRestApi.business.dto.CustomerDto;
import com.gurkanguldas.CustomerRestApi.business.dto.CustomerInformationDto;
import com.gurkanguldas.CustomerRestApi.business.service.ReturnModel;
import com.gurkanguldas.CustomerRestApi.business.service.impl.CustomerService;
import com.gurkanguldas.CustomerRestApi.exception.GenericExceptionHandling;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class CustomerRestControllerTest 
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
	void GetAllCustomerUrlOperation_GetStatus_OK() throws Exception
	{
		ReturnModel<Set<CustomerDto>> expected = testReturnModelSet();
		Mockito.when(customerService.getCustomers("id", false, 10, 0, "greater_than_or_equal", "customer", "id", "0", "0")).thenReturn(expected);
	
		MockHttpServletResponse response = mvc
                .perform(get("/customer/rest/api/getcustomers")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse();
		
		ReturnModel<Set<CustomerDto>> actual = new ObjectMapper().readValue(response.getContentAsString(), new TypeReference<ReturnModel<Set<CustomerDto>>>() {});
	
		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
		Assertions.assertEquals(expected.getResult().size(), actual.getResult().size());
	}
	
	@Test
	void GetCustomerUrlOperation_GetStatus_OK() throws Exception
	{
		ReturnModel<CustomerDto> expected = testReturnModel();
		Mockito.when(customerService.getCustomerById(1L)).thenReturn(expected);
		
		MockHttpServletResponse response = mvc
                .perform(get("/customer/rest/api/getcustomer?id=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse();
				
		ReturnModel<CustomerDto> actual = new ObjectMapper().readValue(response.getContentAsString(), new TypeReference<ReturnModel<CustomerDto>>() {});
		
		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        Assertions.assertEquals(expected.getResult(),actual.getResult());
	}
	

	@Test
	void AddCustomerUrlOperation_GetStatus_OK() throws Exception
	{
		ReturnModel<CustomerDto> expected = testReturnModel();
		
		Mockito.when(customerService.addCustomer(Mockito.any(CustomerDto.class), Mockito.any(BindingResult.class))).thenReturn(expected);
		
		MockHttpServletResponse response = mvc
                .perform(post("/customer/rest/api/addcustomer")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(testCustomer("Gurkan")).getBytes(StandardCharsets.UTF_8))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse();
		
		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}
	
	@Test
	void DeleteCustomerUrlOperation_GetStatus_OK() throws Exception
	{
		ReturnModel<CustomerDto> expected = testReturnModel();
		
		Mockito.when(customerService.deleteCustomerById(1L)).thenReturn(expected);
		
		MockHttpServletResponse response = mvc
                .perform(delete("/customer/rest/api/deletecustomer?id=1")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(MockMvcResultHandlers.print())
                .andReturn()
                .getResponse();

		assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
	}
	
	private ReturnModel<Set<CustomerDto>> testReturnModelSet()
	{
		Set<CustomerDto> customers = new HashSet<>();
		
		customers.add(testCustomer("Gurkan"));
		customers.add(testCustomer("Bekir"));
		
		return new ReturnModel<>(true,"getCustomers","Success",customers);
	}
	
	private ReturnModel<CustomerDto> testReturnModel()
	{
		return new ReturnModel<>(true,"getCustomerById","Success",testCustomer("Gurkan"));
	}
	
	private CustomerDto testCustomer(String nickname)
	{
		return CustomerDto.builder()
                .nickname(nickname)
                .password("123456")
                .customerInfo(CustomerInformationDto
                     .builder()
                     .name("Bekir Gurkan")
                     .surname("Guldas")
                     .gender("man")
                     .identificationNumber(12345678904L)
                     .build())
                .customerContact(CustomerContactDto
                     .builder()
                     .city("Istanbul")
                     .country("Turkey")
                     .disrict("Pendik")
                     .adress("Yenisehir")
                     .phoneNumber(905252563245L)
                     .build())
                .build();
	}
}
