package com.virtusa.abacusacademyadmissionportal.service;

import java.util.ArrayList;

import com.virtusa.abacusacademyadmissionportal.model.InstituteModel;

public interface InstituteService {

	InstituteModel addInstitute(InstituteModel instituteModel);
	
	ArrayList<InstituteModel> viewInstitutes();
	
	InstituteModel editInstitute(InstituteModel instituteModel,int instituteId);
	
	String deleteInstitute(int instituteId);
	
	InstituteModel getInstitute(int instituteId);
}
