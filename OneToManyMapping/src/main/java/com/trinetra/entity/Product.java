package com.trinetra.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Product_tbl")
public class Product {

	@Id
	private Integer pid;
	private String pname;
	private Double pcost;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pid_fk")
	List<Model> model ;
	
}
