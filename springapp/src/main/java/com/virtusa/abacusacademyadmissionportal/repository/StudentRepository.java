package com.virtusa.abacusacademyadmissionportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.abacusacademyadmissionportal.model.StudentModel;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {

}
