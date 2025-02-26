package com.example.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")
	public Employee createEmployee(@RequestBody Employee employee) {
		LOGGER.info("Received request to create employee: "+employee.getName());
		
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/all") 
	public List<Employee> getAllEmployees() {
		LOGGER.info("Received request to fetch all employees");
		
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long empId) {
		LOGGER.info("Recevied request to get employee by id: "+empId);
		
		return employeeService.getEmployeeByEmpId(empId);
		
	}
	
	@GetMapping("/name/{name}")
	public List<Employee> getEmployeeById(@PathVariable String name) {
		LOGGER.info("Recevied request to get employees by name: "+name);
		
		return employeeService.getEmployeeByName(name);
		
	}
	
	@GetMapping("/sortByAge")
	public List<Employee> sortEmployeeByAge() {
		LOGGER.info("Recevied request to sort employees by name");
		
		return employeeService.sortEmployeeByAge();
		
	}
	
	@PutMapping("/update/{id}")
	public Employee updateEmployeeDetails(@PathVariable("id") Long empId, @RequestBody Employee employeeDetails)
	{
		LOGGER.info("Received request to update employee with Id: "+empId);
		
		return employeeService.updateEmployeeDetails(empId, employeeDetails);
	}
	
	@DeleteMapping("/remove/{id}")
	public String removeEmployee(@PathVariable("id") Long empId) {
		LOGGER.info("Received request to delete employee with Id: "+empId);
		
		return employeeService.removeEmployee(empId);
	}
}
