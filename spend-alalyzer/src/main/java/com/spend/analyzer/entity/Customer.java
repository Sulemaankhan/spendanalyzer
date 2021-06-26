package com.spend.analyzer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CustomerId;

	@NotEmpty
	private String UserName;
	@NotEmpty(message = "username should not be empty")
	@Max(value = 8, message = "password should not be more then 8 char")
	private String password;
	@UniqueElements
	@Email
	private String EmailId;

}
