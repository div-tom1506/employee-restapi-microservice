package com.example.employee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public Employee createEmployee(Employee employee) {
		LOGGER.info("creating new employee: ", employee.getName());
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		LOGGER.info("fetching all employees");
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeByEmpId(Long empId) {
		LOGGER.info("fetching employee by id: ", empId);
		return employeeRepository.findById(empId).orElseThrow(); // if emp not found then log with id
	}

	@Override
	public Employee updateEmployeeDetails(Long empId, Employee employeeDetails) {
		LOGGER.info("updating employee data for id: ", empId);
		
		Employee employee = employeeRepository.findById(empId).orElseThrow(); // if emp not found then log with id
		employee.setName(employeeDetails.getName());
		employee.setDesignation(employeeDetails.getDesignation());
		return employeeRepository.save(employee);	
	}

	@Override
	public String removeEmployee(Long empId) {
		LOGGER.info("removing employee for id: ",empId);
		
		if(!employeeRepository.existsById(empId)) {
			LOGGER.error("Employee not foiund with id: ",empId);
			// throw error here
		}
		
		employeeRepository.deleteById(empId);
		String response = "Employee with id - "+empId+" sucessfully removed.";
		return response;
	}
}
