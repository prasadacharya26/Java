package com.wolken.userDetails.dto;

import lombok.Data;

@Data
public class RegistrationDTO {

	private String name;
	private String email;
	private String contactNumber;
	private String dob;
	private String gender;
	private String status;
	private String city;
	private String nationality;
	private String password;
}
