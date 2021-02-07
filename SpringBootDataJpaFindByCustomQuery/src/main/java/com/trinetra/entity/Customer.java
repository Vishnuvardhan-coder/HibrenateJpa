package com.trinetra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="customer_dtls")
public class Customer {

	@Id
	@Column(name= "customer_id")
	private Integer customerId;
	@Column(name = "customer_name")
	private String customerName;
	@Column(name = "customer_email")
	private String customerEmail;
	@Column(name = "customer_age")
	private Integer customerAge;
	
}
