package com.ibm.employeeApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.employeeApp.exception.EmployeeException;
import com.ibm.employeeApp.model.Employee;
import com.ibm.employeeApp.response.EmployeeResponse;
import com.ibm.employeeApp.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/health")
	public String status() {
		return "Employee Service is healthy!";

	}

	@PostMapping("/addemployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
		try {
			Employee newEmployee = employeeService.SaveEmployee(employee);
			return ResponseEntity.status(HttpStatus.CREATED).body(
					new EmployeeResponse(HttpStatus.CREATED.value(), "New employee created successfully", newEmployee));
		
		} catch (EmployeeException empEx) {
			return ResponseEntity.status(HttpStatus.CONFLICT).body(new EmployeeResponse(HttpStatus.CONFLICT.value(),
					"Employee already exists in the system", empEx.getMessage()));
		}

	}

	@GetMapping("/employees")
	public List<Employee> listEmployees() {
		return employeeService.getAllEmployees();
	}

	// @GetMapping("/employee/{id}")
	// public ResponseEntity<?> employee(@PathVariable int id) {
	// 	try {
	// 		Employee employeeObject = employeeService.getEmployeebyId(id);
	// 		return ResponseEntity.status(HttpStatus.OK).body(
	// 				new EmployeeResponse(HttpStatus.OK.value(), "Employee retrieved successfully", employeeObject));
		
	// 	} catch (EmployeeException ex) {
	// 		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new EmployeeResponse(HttpStatus.NOT_FOUND.value(),
	// 				"Employee not exists", ex.getMessage()));
	// 	}
	// }

	// @PutMapping("/updateemployee")
	// public ResponseEntity<?> updateEmployee(@RequestBody Employee employee) {
	// 	try {
	// 		Employee updatedEmployee = employeeService.updateEmployee(employee);
	// 		return ResponseEntity.status(HttpStatus.OK).body(
	// 				new EmployeeResponse(HttpStatus.OK.value(), "Employee updated successfully", updatedEmployee));
	
	// 	} catch (EmployeeException ex) {
	// 		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new EmployeeResponse(HttpStatus.NOT_FOUND.value(),
	// 				"Employee not exists", ex.getMessage()));
	// 	}
	// }

	// @DeleteMapping("/deleteemployee/{id}")
	// public ResponseEntity<?> deleteemployee(@PathVariable int id) {
	// 	try {
	// 		employeeService.deleteEmployeebyId(id);
	// 		return ResponseEntity.status(HttpStatus.OK)
	// 				.body(new EmployeeResponse(HttpStatus.OK.value(), "Employee deleted successfully", id));
	// 	} catch (EmployeeException ex) {
	// 		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new EmployeeResponse(HttpStatus.NOT_FOUND.value(),
	// 				"Employee not exists", ex.getMessage()));
	// 	}
	// }

}
