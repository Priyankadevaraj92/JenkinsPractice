package com.ibm.employeeApp.service;

import java.util.List;

import com.ibm.employeeApp.exception.EmployeeException;
import com.ibm.employeeApp.model.Employee;

public interface EmployeeService {

	public Employee SaveEmployee(Employee employee) throws EmployeeException;

	List<Employee> getAllEmployees();

	// public Employee getEmployeebyId(int id) throws EmployeeException;

	// public Employee updateEmployee(Employee employee) throws EmployeeException;

	// public void deleteEmployeebyId(int id) throws EmployeeException;

}
