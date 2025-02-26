package com.example.employee.service;

import java.util.List;

import com.example.employee.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeByEmpId(Long empId);
	
	List<Employee> getEmployeeByName(String name);
	
	List<Employee> sortEmployeeByAge();
	
	Employee updateEmployeeDetails(Long empId, Employee employeeDetails);
	
	String removeEmployee(Long empId);

}
