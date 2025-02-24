package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	// to implement logger here

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeByEmpId(Long empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployeeDetails(Long empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeEmployee(Long empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
