package com.wolken.facebook.dao;

import com.wolken.facebook.entity.LoginEntity;
import com.wolken.facebook.entity.UserEntity;

public interface RegistrationDAO {

	int save(UserEntity entity);
	
	LoginEntity getByEmail(String email);

	int forgotPassword(LoginEntity entity);
}
