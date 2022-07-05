package com.gurkanguldas.CustomerRestApi.bean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.gurkanguldas.CustomerRestApi.business.service.ICustomerExternalService;
import com.gurkanguldas.CustomerRestApi.business.service.impl.CustomExternalService;
import com.gurkanguldas.CustomerRestApi.data.repository.filter.CustomSpecificationFilter;
import com.gurkanguldas.CustomerRestApi.data.repository.filter.SpecificationFilter;

@Configuration
public class ServiceConfigurationBean
{
    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder() 
	{
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public ICustomerExternalService customExternalService()
    {
    	return new CustomExternalService();
    }
    
    @Bean
    public SpecificationFilter<?> customSpecificationFilter()
    {
    	return new CustomSpecificationFilter();
    }
}