package com.example.employee.service;

import java.util.List;

import com.example.employee.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeByEmpId(Long empId);
	
	Employee updateEmployeeDetails(Long empId, Employee employee);
	
	String removeEmployee(Long empId);

}
