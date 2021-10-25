package com.wolken.hackerrank.dao;

import com.wolken.hackerrank.entity.LoginEntity;
import com.wolken.hackerrank.entity.UserEntity;

public interface RegistrationDAO {

	int save(UserEntity entity);
	
	LoginEntity getByEmail(String email);

	int forgotPassword(LoginEntity entity);
}
