package com.github.nakjunizm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@Column(nullable = false)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String departmentId;
	
}
