package com.wolken.mobileApplication.entity;

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
@Entity
@Table(name="mobileApplication")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MobileAppEntity {
	@Id
	private int id;
	private String appName;
	private byte rating;
	private short size;
	private String type;
}
