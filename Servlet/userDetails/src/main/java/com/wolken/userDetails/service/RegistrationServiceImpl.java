package com.wolken.userDetails.service;

import java.util.Objects;


import com.wolken.userDetails.dao.RegistrationDAO;
import com.wolken.userDetails.dao.RegistrationDAOImpl;
import com.wolken.userDetails.dto.LoginDTO;
import com.wolken.userDetails.dto.RegistrationDTO;
import com.wolken.userDetails.entity.LoginEntity;
import com.wolken.userDetails.entity.RegistrationEntity;

public class RegistrationServiceImpl implements RegistrationService {
	RegistrationDAO dao = new RegistrationDAOImpl();
	
	public String validateandsave(RegistrationDTO dto) {
		RegistrationEntity entity=new RegistrationEntity();
		if(!dto.getName().equals(null) && !dto.getName().equals("")) {
			if(!dto.getEmail().equals(null) && !dto.getEmail().equals("")) {
				if(!dto.getContactNumber().equals(null) && !dto.getContactNumber().equals("")) {
					if(!dto.getDob().equals(null) && !dto.getDob().equals("")) {
						if(!dto.getGender().equals(null) && !dto.getGender().equals("")) {
							if(!dto.getStatus().equals(null) && !dto.getStatus().equals("")) {
								if(!dto.getCity().equals(null) && !dto.getCity().equals("")) {
									if(!dto.getNationality().equals(null) && !dto.getNationality().equals("")) {
										if(!dto.getPassword().equals(null) && !dto.getPassword().equals("")) {
											entity.setName(dto.getName());
											entity.setEmail(dto.getEmail());
											entity.setContactNumber(dto.getContactNumber());
											entity.setDob(dto.getDob());
											entity.setGender(dto.getGender());
											entity.setStatus(dto.getStatus());
											entity.setCity(dto.getCity());
											entity.setNationality(dto.getNationality());
											entity.setPassword(dto.getPassword());
											
											String rows = dao.save(entity);
											if(!rows.equals(null)) {
												return "Data Saved";
											}else {
												return "Data not saved";
											}
										}else {
											return "Invalid password";
										}
									}else {
										return "Invalid city";
									}
								}else {
									return "Invalid city";
								}
							}else {
								return "Invalid status";
							}
						}else {
							return "Invalid gander";
						}
					}else {
						return "Invalid date of birth";
					}
				}else {
					return "Invalid contact number";
				}
			}else {
				return "Invalid email";
			}
		}else {
			return "Invalid full name";
		}
		
	}

	public String validateandLogin(LoginDTO loginDTO) {
		if(!Objects.isNull(loginDTO)) {
			if(!loginDTO.getEmail().equals(null) && !loginDTO.getEmail().equals("")) {
				LoginEntity entity=dao.getByEmail(loginDTO.getEmail());
				if(loginDTO.getPassword().equals(entity.getPassword())) {
					return "Login Sucessfull";
				}else {
					return "Enter valid Password";
				}
			}else {
				return "Enter valid Email";
			}
		}else {
			return "Object is null";
		}
	}

	
	public String validateandUpdatePassword(LoginDTO loginDTO) {
		if(!loginDTO.getEmail().equals(null) && !loginDTO.getEmail().equals("")) {
			LoginEntity entity=dao.getByEmail(loginDTO.getEmail());
			if(entity!=null) {
		
					entity.setEmail(loginDTO.getEmail());
					entity.setPassword(loginDTO.getPassword());
					
					int isUpdate=dao.forgotPassword(entity);
					if(isUpdate>0) {
						return "Password Updated";
						
					}else {
						return "Password not Updated";
					}
				
			}else {
				return "Enter valid Email";
			}
		}else {
			return "Enter valid Email";
		}
		
	}


	public String validateandDelete(String email) {

		if(!email.equals(null) && !email.equals("")) {
			LoginEntity entity=dao.getByEmail(email);
			if(entity!=null) {
					int isUpdate=dao.deleteData(email);
					if(isUpdate>0) {
						return "Data deleted";
						
					}else {
						return "Enter valid Email";
					}
				
			}else {
				return "Enter valid Email";
			}
		}else {
			return "Enter valid Email";
		}
		
	}

}
