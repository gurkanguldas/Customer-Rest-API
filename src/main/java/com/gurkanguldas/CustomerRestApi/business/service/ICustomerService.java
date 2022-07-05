package com.gurkanguldas.CustomerRestApi.business.service;

import java.util.Set;

import org.springframework.validation.BindingResult;

import com.gurkanguldas.CustomerRestApi.business.dto.CustomerDto;

/**
 * Operations such as adding, deleting and getting customers are performed. At
 * the same time, data filtering, sorting and pagination operations are also
 * performed.
 * 
 * @author Gurkan
 *
 */
public interface ICustomerService {
	/**
	 * Used to create customers.
	 * 
	 * @param customerDto   contains information about the customer.
	 * @param bindingResult checks the accuracy of customer information.
	 * @return
	 */
	ReturnModel<CustomerDto> addCustomer(CustomerDto customerDto, BindingResult bindingResult);

	/**
	 * Used to delete customers by ID number.
	 * 
	 * @param id number of the customer to be delete.
	 * @return ReturnModel is returned and the result value returns to the customer.
	 */
	ReturnModel<CustomerDto> deleteCustomerById(Long id);

	/**
	 * Used to get customers by ID number.
	 * 
	 * @param id number of the customer to be get.
	 * @return ReturnModel is returned and the result value returns to the customer.
	 */
	ReturnModel<CustomerDto> getCustomerById(Long id);

	/**
	 * Used to sort, paginate and filter customers.
	 *
	 * @param sortType   determines which variable you will sort by.
	 * @param descending can only be true and false. If true, it's Z-A, if false,it's A-Z.
	 * @param pageSize   determines how much value a page will contain.
	 * @param pageNo     switches to the specified page.
	 * @param quary      performs the query according to the specified query type.
	 * @see com.gurkanguldas.CustomerRestApi.data.repository.filter#mapFilter(String,String, Object, Object)
	 * @param table  represents the table to query
	 * @param column represents the column to query.
	 * @param value1 represents the condition value.
	 * @param value2 represents the condition value.(Only Between)
	 * @return ReturnModel is returned and the result value returns the customer
	 *         list in set type.
	 */
	ReturnModel<Set<CustomerDto>> getCustomers(String sortType, boolean descending, int pageSize, int pageNo,
			String quary, String table, String column, Object value1, Object value2);
}
