package com.gurkanguldas.CustomerRestApi.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.gurkanguldas.CustomerRestApi.data.dao.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long>,JpaSpecificationExecutor<Customer>
{
	Optional<Customer> findByNickname(String nickname);
	
	@Query("SELECT u FROM Customer u INNER JOIN CustomerInformation r ON u.id=r.id WHERE r.identificationNumber = ?1")
	Optional<Customer> findByIdentificationNumber(Long id);
	
	
}
