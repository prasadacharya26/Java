package com.wolken.policybazaar.service;

import com.wolken.policybazaar.dao.RegistrationDAO;
import com.wolken.policybazaar.dao.RegistrationDAOImpl;
import com.wolken.policybazaar.dto.PolicyBazaarDTO;
import com.wolken.policybazaar.entity.PolicyBazaarEntity;

public class RegistrationServiceImpl implements RegistrationService {

	public String validateandsave(PolicyBazaarDTO dto) {
		RegistrationDAO dao=new RegistrationDAOImpl();
		PolicyBazaarEntity entity=new PolicyBazaarEntity();
		entity.setId(dto.getId());
		entity.setUsername(dto.getUsername());
		entity.setContactNumber(dto.getContactNumber());
		entity.setGender(dto.getGender());
		entity.setDob(dto.getDob());
		entity.setAge(dto.getAge());
		entity.setPassword(dto.getPassword());
		
		int rows=dao.save(entity);
		System.out.println(rows+ "data saved");
		return "Validated";
	}

}
