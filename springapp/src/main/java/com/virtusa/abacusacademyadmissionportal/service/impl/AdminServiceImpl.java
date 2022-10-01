package com.virtusa.abacusacademyadmissionportal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.abacusacademyadmissionportal.model.AdminModel;
import com.virtusa.abacusacademyadmissionportal.repository.AdminRepository;
import com.virtusa.abacusacademyadmissionportal.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public AdminModel saveAdmin(AdminModel adminModel) {

		return adminRepository.save(adminModel);
	}

	@Override
	public boolean adminLogin(String email, String password) {

		return adminRepository.existsByEmailAndPassword(email, password);
	}
}
