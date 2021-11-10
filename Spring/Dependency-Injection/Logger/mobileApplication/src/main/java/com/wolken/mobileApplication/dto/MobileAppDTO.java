package com.wolken.mobileApplication.dto;

import javax.persistence.Id;

import lombok.Data;
@Data
public class MobileAppDTO {
	
	private int id;
	private String appName;
	private byte rating;
	private short size;
	private String type;
}
