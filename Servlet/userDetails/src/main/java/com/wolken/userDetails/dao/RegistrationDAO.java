package com.wolken.userDetails.dao;

import com.wolken.userDetails.entity.LoginEntity;
import com.wolken.userDetails.entity.RegistrationEntity;

public interface RegistrationDAO {

	String save(RegistrationEntity entity);

	LoginEntity getByEmail(String email);

	int forgotPassword(LoginEntity entity);

	int deleteData(String email);

}
