package com.wolken.policybazaar.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PolicyBazaarDTO {
	
	private int id;
	private String username;
	private String gender;
	private long contactNumber;
	private Date dob;
	private int age;
	private String password;
}
