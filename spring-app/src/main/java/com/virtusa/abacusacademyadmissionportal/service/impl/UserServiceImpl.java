package com.virtusa.abacusacademyadmissionportal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.abacusacademyadmissionportal.model.UserModel;
import com.virtusa.abacusacademyadmissionportal.repository.UserRepository;
import com.virtusa.abacusacademyadmissionportal.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserModel saveUser(UserModel userModel) {

		return userRepository.save(userModel);
	}

	@Override
	public boolean userLogin(String email, String password) {

		return userRepository.existsByEmailAndPassword(email, password);
	}

}
