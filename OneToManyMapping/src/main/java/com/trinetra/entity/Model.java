package com.trinetra.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Model_tbl")
public class Model {

	@Id
	private Integer mid;
	private String mcode;
	private String mcolor;
}
