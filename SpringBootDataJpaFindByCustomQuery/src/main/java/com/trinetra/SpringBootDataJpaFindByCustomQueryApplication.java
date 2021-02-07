package com.trinetra;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.trinetra.entity.Customer;
import com.trinetra.repository.CustomerRepository;

@SpringBootApplication
public class SpringBootDataJpaFindByCustomQueryApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaFindByCustomQueryApplication.class, args);
	
		CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
	
		/*
		 * Customer customer = new Customer();
		 * 
		 * customer.setCustomerId(103); customer.setCustomerName("varunn");
		 * customer.setCustomerEmail("vrn@gmail.com"); customer.setCustomerAge(39);
		 * 
		 * customerRepository.save(customer);
		 */
		
		/*// findByName
		 * Customer customer =
		 * customerRepository.findByCustomerName("praveen");
		 * 
		 * System.out.println(customer);
		 */
		
		/* findByEmail
		 * Customer customer =
		 * customerRepository.findByCustomerEmail("nvn@gmail.com");
		 * 
		 * System.out.println(customer);
		 * 
		 */
		
		/* findByNameAndEmail
		 * Customer customer =
		 * customerRepository.findByCustomerNameAndCustomerEmail("varunn",
		 * "vrn@gmail.com");
		 * 
		 * System.out.println(customer);
		 */
		
		/* findByAgeGreaterThanEqual27
		 * List<Customer> customers =
		 * customerRepository.findByCustomerAgeGreaterThanEqual(27);
		 * 
		 * customers.forEach(c ->{ System.out.println(c); });
		 */
		
		/*// findByAgeIn
		 * List<Customer> customers =
		 * customerRepository.findByCustomerAgeIn(Arrays.asList(27,39));
		 * 
		 * customers.forEach(c ->{ System.out.println(c); });
		 */
		
		
		List<String> customers = customerRepository.findAllCustomerNames();
		
		customers.forEach(c->{
			System.out.println(c);
		});
		
		context.close();
		
		
	}

}
