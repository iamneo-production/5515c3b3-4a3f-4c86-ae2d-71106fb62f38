package com.virtusa.abacusacademyadmissionportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.virtusa.abacusacademyadmissionportal.model.AdmissionModel;

public interface AdmissionRepository extends JpaRepository<AdmissionModel, Integer> {

	
}
