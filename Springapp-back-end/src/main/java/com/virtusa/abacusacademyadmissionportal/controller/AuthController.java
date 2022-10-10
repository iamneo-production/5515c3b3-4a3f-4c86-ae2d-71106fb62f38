package com.virtusa.abacusacademyadmissionportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.abacusacademyadmissionportal.model.AdminModel;
import com.virtusa.abacusacademyadmissionportal.model.LoginModel;
import com.virtusa.abacusacademyadmissionportal.model.UserModel;
import com.virtusa.abacusacademyadmissionportal.service.AdminService;
import com.virtusa.abacusacademyadmissionportal.service.UserService;

@CrossOrigin("*")

@RestController
public class AuthController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/admin/signup")
	public AdminModel saveAdmin(@RequestBody AdminModel adminModel) {
		
		return adminService.saveAdmin(adminModel);
	}
	
	@PostMapping("/admin/login")
	public boolean isAdminPresent(@RequestBody LoginModel loginModel) {
		
		String email=loginModel.getEmail();
		String password=loginModel.getPassword();
		
		return adminService.adminLogin(email, password);
	}
	
	@PostMapping("/user/signup")
	public UserModel saveUser(@RequestBody UserModel userModel) {
		
		return userService.saveUser(userModel);
	}
	
	@PostMapping("/user/login")
	public boolean isUserPresent(@RequestBody LoginModel loginModel) {
		
		String email=loginModel.getEmail();
		String password=loginModel.getPassword();
		
		return userService.userLogin(email, password);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
