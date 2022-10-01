package com.virtusa.abacusacademyadmissionportal.service;

import com.virtusa.abacusacademyadmissionportal.model.AdminModel;

public interface AdminService {

	AdminModel saveAdmin(AdminModel adminModel);
	
	boolean adminLogin(String email,String password);
}
