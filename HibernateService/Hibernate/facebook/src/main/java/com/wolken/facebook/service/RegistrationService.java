package com.wolken.facebook.service;

import com.wolken.facebook.dto.LoginDTO;
import com.wolken.facebook.dto.UserDTO;

public interface RegistrationService {

	String validateandsave(UserDTO dto);

	String validateandLogin(LoginDTO loginDTO);

	String validateandUpdatePassword(LoginDTO loginDTO);

}
