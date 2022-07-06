package com.gurkanguldas.CustomerRestApi.business.service.impl;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;

import com.gurkanguldas.CustomerRestApi.business.dto.CustomerDto;
import com.gurkanguldas.CustomerRestApi.business.service.ICustomerExternalService;
import com.gurkanguldas.CustomerRestApi.business.service.ICustomerService;
import com.gurkanguldas.CustomerRestApi.business.service.ReturnModel;
import com.gurkanguldas.CustomerRestApi.data.dao.Customer;
import com.gurkanguldas.CustomerRestApi.data.repository.ICustomerRepository;
import com.gurkanguldas.CustomerRestApi.data.repository.filter.SpecificationFilter;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private PasswordEncoder passwordEncoder;

	private ICustomerRepository customerRepo;
	private SpecificationFilter<Customer> customerFilter;
	private ICustomerExternalService customExternalService;

	@Autowired
	public CustomerService(ICustomerRepository customerRepo,
                           SpecificationFilter<Customer> customerFilter,
                           ICustomerExternalService customExternalService) 
	{
		this.customerRepo = customerRepo;
		this.customerFilter = customerFilter;
		this.customExternalService = customExternalService;
	}

	@Transactional
	@Override
	public ReturnModel<CustomerDto> getCustomerById(Long id) 
	{
		Optional<Customer> customer = customerRepo.findById(id);

		ReturnModel<CustomerDto> model = customExternalService.getCustomerById(customer, id);

		model.setResult(modelMapper.map(customer.get(), CustomerDto.class));

		return model;
	}

	@Transactional
	@Override
	public ReturnModel<Set<CustomerDto>> getCustomers(String sortType, boolean descending, int pageSize, int pageNo,
                                                      String quary, String table, String column, Object value1, Object value2) 
	{
		Set<CustomerDto> customers = new LinkedHashSet<>();

		Specification<Customer> sp = customerFilter.mapFilter(table, column, value1, value2).get(quary);

		Sort sort = descending ? Sort.by(sortType).descending() : Sort.by(sortType);

		Pageable pading = PageRequest.of(pageNo, pageSize, sort);

		Page<Customer> customerPage = (Page<Customer>) customerRepo.findAll(sp, pading);

		for (Customer customer : customerPage) 
		{
			customers.add(modelMapper.map(customer, CustomerDto.class));
		}

		return customExternalService.getCustomers(customers);
	}

	@Transactional
	@Override
	public ReturnModel<CustomerDto> addCustomer(CustomerDto customerDto, BindingResult bindingResult) 
	{
		boolean isCurrentName = customerRepo.findByNickname(customerDto.getNickname()).isPresent();
		boolean isCurrentIdentity = customerRepo.findByIdentificationNumber(customerDto.getCustomerInfo().getIdentificationNumber()).isPresent();

		ReturnModel<CustomerDto> model = customExternalService.addCustomer(customerDto, isCurrentName, isCurrentIdentity, bindingResult);

		customerDto.setPassword(passwordEncoder.encode(customerDto.getPassword()));

		Customer customer = modelMapper.map(customerDto, Customer.class);

		customerRepo.save(customer);

		return model;
	}

	@Transactional
	@Override
	public ReturnModel<CustomerDto> deleteCustomerById(Long id) 
	{
		Optional<Customer> customer = customerRepo.findById(id);

		ReturnModel<CustomerDto> model = customExternalService.deleteCustomerById(customer, id);

		model.setResult(modelMapper.map(customer.get(), CustomerDto.class));

		customerRepo.deleteById(id);

		return model;
	}
}