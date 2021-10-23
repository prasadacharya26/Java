package com.wolken.flipkart.service;

import com.wolken.flipkart.dao.RegistrationDAO;
import com.wolken.flipkart.dao.RegistrationDAOImpl;
import com.wolken.flipkart.dto.FlipkartDTO;
import com.wolken.flipkart.entity.FlipkartEntity;


public class RegistrationServiceImpl implements RegistrationService {

	RegistrationDAO dao=new RegistrationDAOImpl();
	public String validateandsave(FlipkartDTO dto) {
		FlipkartEntity entity=new FlipkartEntity();
		entity.setId(dto.getId());
		entity.setUsername(dto.getUsername());
		entity.setEmail(dto.getEmail());
		entity.setContactNumber(dto.getContactNumber());
		entity.setPassword(dto.getPassword());
		
		int rows = dao.save(entity);
		return "validated";
	}

}
