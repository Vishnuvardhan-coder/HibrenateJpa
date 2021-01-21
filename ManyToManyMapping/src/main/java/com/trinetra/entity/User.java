package com.trinetra.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="User_tbl")
public class User {

	@Id
	private Integer uid;
	private String uname;
	private String uemail;
	
	@ManyToMany
	@JoinTable(
			name="User_Role",
			joinColumns = @JoinColumn(name="uid_fk"),
			inverseJoinColumns = @JoinColumn(name="rid_fk")
			)
	private List<Roles> role;
}

