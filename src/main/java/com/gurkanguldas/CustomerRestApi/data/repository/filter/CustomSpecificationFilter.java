package com.gurkanguldas.CustomerRestApi.data.repository.filter;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.criteria.From;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.gurkanguldas.CustomerRestApi.data.dao.Customer;
import com.gurkanguldas.CustomerRestApi.data.dao.CustomerContact;
import com.gurkanguldas.CustomerRestApi.data.dao.CustomerInformation;

public class CustomSpecificationFilter extends SpecificationFilter<Customer> {
	@Override
	public Map<String, Specification<Customer>> mapFilter(String table, String column, Object value1, Object value2) {
		Map<String, Specification<Customer>> map = new HashMap<>();

		map.put("between", customerBetween(table, column, value1, value2));
		map.put("like", customerLike(table, column, value1));
		map.put("in", customerIn(table, column, value1));

		map.put("equals", customerEquals(table, column, value1));
		map.put("not_equals", customerNotEquals(table, column, value1));

		map.put("greater_than_or_equal", customerGreaterThanOrEqualTo(table, column, value1));
		map.put("less_than_or_equal", customerLessThanOrEqualTo(table, column, value1));

		return map;
	}

	@Override
	protected Map<String, From<?, ?>> mapTables(Root<?> root) {
		Map<String, From<?, ?>> map = new HashMap<>();

		Join<Customer, CustomerInformation> customerInfo = root.join("customerInfo");
		Join<Customer, CustomerContact> customerContact = root.join("customerContact");

		map.put("customer", root);
		map.put("customer_information", customerInfo);
		map.put("customer_contact", customerContact);

		return map;
	}

}