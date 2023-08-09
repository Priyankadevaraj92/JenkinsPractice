package com.ibm.employeeApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.employeeApp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	/*
	 * here jpaRepostory interface defines methods for all the CRUD operations on
	 * the entity and default implementation of the JpaRepository(interface) called
	 * SimpleJpaRepository(class)
	 * 
	 */

	public Employee findByEmail(String email);

}
