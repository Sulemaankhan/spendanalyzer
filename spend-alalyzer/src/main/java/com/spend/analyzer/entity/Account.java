package com.spend.analyzer.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AccountNumber;

	private double balance;
	private String transectionType;

}
