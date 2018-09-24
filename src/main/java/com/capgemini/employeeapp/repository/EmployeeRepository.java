package com.capgemini.employeeapp.repository;

import java.util.List;

import com.capgemini.employeeapp.entity.Employee;

public interface EmployeeRepository {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(int employeeId);
	public Employee findEmployeeById(int employeeId);
	public List<Employee> findAllEmployees();
		
	}

