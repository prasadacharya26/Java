package com.wolken.policyBaazar.entity;

import java.util.Date;

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
@Table(name="policybaazar")
public class PolicyBazaarEntity {
	@Id
	private int id;
	private String username;
	private String gender;
	private long contactNumber;
	private Date dob;
	private int age;
	private String password;
}
