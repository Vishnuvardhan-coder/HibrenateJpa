package com.trinetra.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trinetra.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	// select * from customer_dtls where customer_name = :name
	public Customer findByCustomerName(String name);

	// select * from customer_dtls where customer_email = :email
	public Customer findByCustomerEmail(String email);

	// select * from customer_dtls where customer_name = :name and customer_email =:email
	public Customer findByCustomerNameAndCustomerEmail(String name, String email);

	// select * from customer_dtls where customer_age>=27
	public List<Customer> findByCustomerAgeGreaterThanEqual(Integer age);

	//select * from customer_dtls where customer_age in (:age1,:age2)
	public List<Customer> findByCustomerAgeIn(List<Integer> age);
	
}
