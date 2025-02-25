package com.example.employee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.exception.EmployeeNotFoundException;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public Employee createEmployee(Employee employee) {
		LOGGER.info("creating new employee: "+employee.getName());
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		LOGGER.info("fetching all employees");
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeByEmpId(Long empId) {
		LOGGER.info("fetching employee by id: "+empId);
		return employeeRepository.findById(empId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with Id: "+empId));
	}
	
	@Override
	public List<Employee> getEmployeeByName(String name) {
		LOGGER.info("fetching employee by name: "+name);
		
		return employeeRepository.findByName(name);
	}

	@Override
	public Employee updateEmployeeDetails(Long empId, Employee employeeDetails) {
		LOGGER.info("updating employee data for id: "+empId);
		
		Employee employee = employeeRepository.findById(empId)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with Id: "+empId));
		
		employee.setName(employeeDetails.getName());
		employee.setDesignation(employeeDetails.getDesignation());
		return employeeRepository.save(employee);	
	}

	@Override
	public String removeEmployee(Long empId) {
		LOGGER.info("removing employee for id: "+empId);
		
		if(!employeeRepository.existsById(empId)) {
			LOGGER.error("Employee not found with id: "+empId);
			return "Employee not found with Id: "+empId;
		}	
		
		employeeRepository.deleteById(empId);
		return "Employee with id "+empId+" sucessfully removed.";
	}
}
