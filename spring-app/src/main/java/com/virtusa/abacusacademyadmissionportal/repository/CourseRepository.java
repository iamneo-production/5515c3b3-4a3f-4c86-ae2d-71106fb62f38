package com.virtusa.abacusacademyadmissionportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.abacusacademyadmissionportal.model.CourseModel;

public interface CourseRepository extends JpaRepository<CourseModel, Integer> {

}
