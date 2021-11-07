package com.wolken.policyBaazar.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.policyBaazar.dao.RegistrationDAO;
import com.wolken.policyBaazar.dto.PolicyBazaarDTO;
import com.wolken.policyBaazar.entity.PolicyBazaarEntity;

public class RegistrationServiceImpl implements RegistrationService {

	public String validateandsave(PolicyBazaarDTO dto) {
		RegistrationDAO dao=(RegistrationDAO) new  ClassPathXmlApplicationContext("applicationContext.xml").getBean("dao");
		PolicyBazaarEntity entity=new PolicyBazaarEntity();
		if(dto.getId()>0) {
			if(!dto.getUsername().equals(null)&& !dto.getUsername().equals("")) {
				if(dto.getContactNumber()>5999999999l && dto.getContactNumber()<9999999999l) {
					if(!dto.getGender().equals(null) && !dto.getGender().equals("")) {
						if(!dto.getDob().equals(null)&& !dto.getDob().equals("")) {
							if(dto.getAge()>0) {
								if(!dto.getPassword().equals(null)&& !dto.getPassword().equals("")) {
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
								}else {
									return "invalid password";
								}
							}else {
								return "invalid age";
							}
						}else {
							return "invalid date of birth";
						}
					}else {
						return "invalid gender";
					}
				}else {
					return "invalid contact number";
				}
			}else {
				return "invalid username";
			}
		}else {
			return "invalid id";
		}
		
	}

}
