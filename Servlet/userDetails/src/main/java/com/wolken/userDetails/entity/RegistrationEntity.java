package com.wolken.userDetails.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class RegistrationEntity {
	
	private String name;
	@Id
	private String email;
	private String contactNumber;
	private String dob;
	private String gender;
	private String status;
	private String city;
	private String nationality;
	private String password;
}
