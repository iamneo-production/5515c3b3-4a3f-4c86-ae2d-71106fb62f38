package com.virtusa.abacusacademyadmissionportal.util;

import com.virtusa.abacusacademyadmissionportal.model.AdmissionModel;
import com.virtusa.abacusacademyadmissionportal.model.CourseModel;
import com.virtusa.abacusacademyadmissionportal.model.InstituteModel;
import com.virtusa.abacusacademyadmissionportal.model.StudentModel;

public class AdmissionCollection {

	public AdmissionModel collectDetails(AdmissionModel admissionModel,InstituteModel instituteModel,CourseModel courseModel,StudentModel studentModel) {
		
		AdmissionModel newAdmission=new AdmissionModel();
		newAdmission.setCourseName(courseModel.getCourseName());
		newAdmission.setMobileNumber(studentModel.getMobile());
		newAdmission.setStudentEmail(studentModel.getEmail());
		newAdmission.setStudentName(studentModel.getStudentName());
		newAdmission.setInstituteName(instituteModel.getInstituteName());
		newAdmission.setInstituteLocation(instituteModel.getInstituteAddress());
		
		return newAdmission;
	}
}
