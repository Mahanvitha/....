package com.capgemini.employeeapp.service;

import java.util.List;

import org.springframework.web.servlet.DispatcherServlet;

import com.capgemini.employeeapp.entity.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(int employeeId);
	public Employee findEmployeeById(int employeeId);
	public List<Employee> findAllEmployees();
	
}
