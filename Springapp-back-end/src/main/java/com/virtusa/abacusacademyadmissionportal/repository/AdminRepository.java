package com.virtusa.abacusacademyadmissionportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.virtusa.abacusacademyadmissionportal.model.AdminModel;

public interface AdminRepository extends JpaRepository<AdminModel, Integer> {

	boolean existsByEmailAndPassword(String email,String password);
}
 