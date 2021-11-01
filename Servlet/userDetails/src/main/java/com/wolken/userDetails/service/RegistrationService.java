package com.wolken.userDetails.service;

import com.wolken.userDetails.dto.LoginDTO;
import com.wolken.userDetails.dto.RegistrationDTO;

public interface RegistrationService {

	String validateandsave(RegistrationDTO dto);

	String validateandLogin(LoginDTO loginDTO);

	String validateandUpdatePassword(LoginDTO loginDTO);

	String validateandDelete(String email);

}
