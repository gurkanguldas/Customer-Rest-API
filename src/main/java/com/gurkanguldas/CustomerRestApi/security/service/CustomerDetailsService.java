package com.gurkanguldas.CustomerRestApi.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gurkanguldas.CustomerRestApi.business.service.ICustomerExternalService;
import com.gurkanguldas.CustomerRestApi.business.service.ReturnModel;
import com.gurkanguldas.CustomerRestApi.data.dao.Customer;
import com.gurkanguldas.CustomerRestApi.data.repository.ICustomerRepository;
import com.gurkanguldas.CustomerRestApi.security.data.CustomerLogin;

@Service
public class CustomerDetailsService implements UserDetailsService 
{

	@Autowired
	private ICustomerRepository customerRepo;

	@Autowired
	private ICustomerExternalService customExternalService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		ReturnModel<CustomerLogin> model = getCustomerByNickname(username);
		CustomerLogin customerSecurity = model.getResult();
		return new CustomerDetails(customerSecurity);
	}

	private ReturnModel<CustomerLogin> getCustomerByNickname(String username) 
	{
		Optional<Customer> customer = customerRepo.findByNickname(username);

		customExternalService.getCustomerByNickName(customer);

		CustomerLogin customerLogin = CustomerLogin.builder()
				                                   .nickname(customer.get().getNickname())
                                                   .password(customer.get().getPassword())
                                                   .build();

		return new ReturnModel<CustomerLogin>(true, "CustomerByNickname", "Success", customerLogin);
	}

}
