package com.gurkanguldas.CustomerRestApi.business.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.validation.BindingResult;

import com.gurkanguldas.CustomerRestApi.business.dto.CustomerDto;
import com.gurkanguldas.CustomerRestApi.data.dao.Customer;
/**
 * Performs check operations for adding, deleting 
 * and getting customers.
 * 
 * @author Gurkan
 *
 */
public interface ICustomerExternalService 
{
	/**
	 * It checks whether the customer exists according to the ID number.
	 * 
	 * @param customer from database.
	 * @param id number of the customer to be get.
	 * @return ReturnModel is returned and the result value returns to the customer.
	 */
	ReturnModel<CustomerDto> getCustomerById(Optional<Customer> customer, Long id);

	/**
	 * It checks whether the customer exists according to the nickname.
	 * 
	 * @param customer from database.
	 * @return ReturnModel is returned and the result value returns to the customer.
	 */
	ReturnModel<CustomerDto> getCustomerByNickName(Optional<Customer> customer);
	
	/**
	 * Performs checks before getting all customers.
	 * 
	 * @param customers the customer list in set type
	 * @return ReturnModel is returned and the result value returns the customer list in set type.
	 */
	ReturnModel<Set<CustomerDto>> getCustomers(Set<CustomerDto> customers);
	
	/**
	 * Makes necessary checks before adding customers.
	 * 
	 * @param customerDto contains information about the customer.
	 * @param name returns true if the customer name exists.
	 * @param id Returns true if the customer identification number exists.
	 * @param bindingResult checks the accuracy of customer information.
	 * @return ReturnModel is returned and the result value returns to the customer.
	 */
	ReturnModel<CustomerDto> addCustomer(CustomerDto customerDto, boolean name, boolean id, BindingResult bindingResult);

	/**
	 * It checks whether the customer exists according to the ID number.
	 * 
	 * @param customer from database.
	 * @param id number of the customer to be get.
	 * @return ReturnModel is returned and the result value returns to the customer.
	 */
	ReturnModel<CustomerDto> deleteCustomerById(Optional<Customer> customer, Long id);

}
