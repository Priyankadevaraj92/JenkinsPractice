package com.ibm.employeeApp.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.employeeApp.exception.EmployeeException;
import com.ibm.employeeApp.model.Employee;
import com.ibm.employeeApp.repository.EmployeeRepository;
import com.ibm.employeeApp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee SaveEmployee(Employee employee) throws EmployeeException {
		Employee existingEmployee = this.employeeRepository.findByEmail(employee.getEmail());
		if (existingEmployee != null) {
			String message = "Employee with email %s already exists.".formatted(employee.getEmail());
			throw new EmployeeException(message);
		} else {
			this.employeeRepository.save(employee);
			return employeeRepository.findByEmail(employee.getEmail());
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// @Override
	// public Employee getEmployeebyId(int id) throws EmployeeException {
	// 	String message = "Employee with id %s is not found.".formatted(id);
	
	// 	Optional<Employee> existingEmployee = employeeRepository.findById(id);
	// 	if (existingEmployee.isPresent()) {
	// 		return existingEmployee.get();
	// 	} else {
	// 		throw new EmployeeException(message);
	// 	}
		
	// }

	// @Override
	// public Employee updateEmployee(Employee updatedEmployee) throws EmployeeException {
	// 	Employee existingEmployee = getEmployeebyId(updatedEmployee.getId());
	// 	if (existingEmployee != null) {
	// 		this.employeeRepository.save(updatedEmployee);
	// 		return updatedEmployee;
	// 	} else {
	// 		String message = "Employee with id %s is not found.".formatted(updatedEmployee.getId());
	// 		throw new EmployeeException(message);
	// 	}
	// }

	// @Override
	// public void deleteEmployeebyId(int id) throws EmployeeException {

	// 	Employee existingEmployee = getEmployeebyId(id);
	// 	if (existingEmployee != null) {
	// 		this.employeeRepository.deleteById(id);
	// 	} else {
	// 		String message = "Employee with id %s is not found.".formatted(id);
	// 		throw new EmployeeException(message);
	// 	}

	// }

}
