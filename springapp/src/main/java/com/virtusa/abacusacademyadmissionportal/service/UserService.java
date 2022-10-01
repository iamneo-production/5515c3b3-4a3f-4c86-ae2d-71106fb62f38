package com.virtusa.abacusacademyadmissionportal.service;

import com.virtusa.abacusacademyadmissionportal.model.UserModel;

public interface UserService {

	UserModel saveUser(UserModel userModel);
	
	boolean userLogin(String email,String password);
}
