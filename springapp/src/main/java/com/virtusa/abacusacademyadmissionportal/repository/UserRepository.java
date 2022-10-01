package com.virtusa.abacusacademyadmissionportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.abacusacademyadmissionportal.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

	boolean existsByEmailAndPassword(String email,String password);

}
