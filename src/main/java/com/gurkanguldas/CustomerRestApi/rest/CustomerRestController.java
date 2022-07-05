package com.gurkanguldas.CustomerRestApi.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gurkanguldas.CustomerRestApi.business.dto.CustomerDto;
import com.gurkanguldas.CustomerRestApi.business.service.ReturnModel;
import com.gurkanguldas.CustomerRestApi.business.service.impl.CustomerService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@CrossOrigin
@RestController
@RequestMapping("/customer/rest/api")
public class CustomerRestController implements ICustomerRestController {
	@Autowired
	CustomerService customerService;

	// http://localhost:8080/customer/rest/api/getcustomer?id=1
	@Override
	@GetMapping("/getcustomer")
	public ResponseEntity<?> getCustomerById(@RequestParam("id") Long personId) {
		ReturnModel<?> model = customerService.getCustomerById(personId);
		log.info(model.toString());
		return ResponseEntity.ok().body(model);
	}

	// http://localhost:8080/customer/rest/api/getcustomers
	@Override
	@GetMapping("/getcustomers")
	public ResponseEntity<?> getCustomers(
			@RequestParam(name = "type", required = false, defaultValue = "id") String sortType,
			@RequestParam(name = "descending", required = false, defaultValue = "false") boolean descending,
			@RequestParam(name = "size", required = false, defaultValue = "10") int pageSize,
			@RequestParam(name = "page", required = false, defaultValue = "0") int pageNo,
			@RequestParam(name = "quary", required = false, defaultValue = "greater_than_or_equal") String quary,
			@RequestParam(name = "table", required = false, defaultValue = "customer") String table,
			@RequestParam(name = "column", required = false, defaultValue = "id") String column,
			@RequestParam(name = "start_value", required = false, defaultValue = "0") Object value1,
			@RequestParam(name = "end_value", required = false, defaultValue = "0") Object value2) {
		ReturnModel<?> model = customerService.getCustomers(sortType, descending, pageSize, pageNo, quary, table,
				column, value1, value2);
		log.info(model.toString());
		System.out.println(value1);
		return ResponseEntity.ok().body(model);
	}

	// http://localhost:8080/customer/rest/api/addcustomer
	@Override
	@PostMapping(value = "/addcustomer")
	public ResponseEntity<?> addCustomer(@Valid @RequestBody CustomerDto customerDto, BindingResult bindingResult) {
		ReturnModel<?> model = customerService.addCustomer(customerDto, bindingResult);
		log.info(model.toString());
		return ResponseEntity.ok().body(model);
	}

	// http://localhost:8080/customer/rest/api/deletecustomer?id=1
	@Override
	@DeleteMapping(value = "/deletecustomer")
	public ResponseEntity<?> deleteCustomerById(@RequestParam("id") Long personId) {
		ReturnModel<?> model = customerService.deleteCustomerById(personId);
		log.info(model.toString());
		return ResponseEntity.ok().body(model);
	}
}
