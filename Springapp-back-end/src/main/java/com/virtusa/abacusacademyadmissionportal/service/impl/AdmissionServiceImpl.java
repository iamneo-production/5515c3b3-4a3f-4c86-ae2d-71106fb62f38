package com.virtusa.abacusacademyadmissionportal.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.abacusacademyadmissionportal.model.AdmissionModel;
import com.virtusa.abacusacademyadmissionportal.repository.AdmissionRepository;
import com.virtusa.abacusacademyadmissionportal.service.AdmissionService;

@Service
public class AdmissionServiceImpl implements AdmissionService {

	@Autowired
	AdmissionRepository admissionRepository;
	
	@Override
	public AdmissionModel addAdmission(AdmissionModel admissionModel) {

		return admissionRepository.save(admissionModel);
	}

	@Override
	public AdmissionModel viewAdmission(int admissionId) {

		Optional<AdmissionModel> optional=admissionRepository.findById(admissionId);
		
		return optional.get();
	}

	@Override
	public AdmissionModel updateAdmission(AdmissionModel admissionModel, int admissionId) {

		AdmissionModel existingAdmission=this.viewAdmission(admissionId);
		
		if(existingAdmission!=null) {
			existingAdmission.setCourseName(admissionModel.getCourseName());
			existingAdmission.setMobileNumber(admissionModel.getMobileNumber());
			existingAdmission.setStudentEmail(admissionModel.getStudentEmail());
			existingAdmission.setStudentName(admissionModel.getStudentName());
			
			return admissionRepository.save(existingAdmission);
		}
		
		return null;
	}

	@Override
	public String deleteAdmission(int admissionId) {

		AdmissionModel admissionModel=this.viewAdmission(admissionId);
		
		admissionRepository.delete(admissionModel);
		
		return "Admission is deleted";
	}

	@Override
	public String viewStatus(int admissionId) {

		return null;
	}

}
