package com.api.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.employee.entities.Employee;
import com.api.employee.modal.EmployeeModal;
import com.api.employee.repos.EmployeeRepository;


@RestController
@CrossOrigin
public class EmployeeContoller {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/")
	public String getHi() {
		return "Hi";	
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();	
	}
	
	@GetMapping("/employee")
	public Employee getEmployee(@RequestParam long id) {
		return employeeRepository.findById(id).orElse(null);	
	}
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee emp = new Employee();
		return employeeRepository.save(employee);	
	}
	
	@PostMapping("/employees")
	public List<Employee> saveEmployees(@RequestBody List<Employee> employees) {
		return employeeRepository.saveAll(employees);	
	}
	
	@DeleteMapping("/employee")
	public void deleteEmployee(@RequestBody Employee employee) {
		 employeeRepository.delete(employee);	
	}
}
