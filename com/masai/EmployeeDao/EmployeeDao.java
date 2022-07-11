package com.masai.EmployeeDao;

import java.util.List;

import com.masai.exception.EmployeeException;

public interface EmployeeDao {

	
	public String saveEmployeeDetails(Employee employee);
	public Employee getEmployeeById(int empId) throws EmployeeException, EmployeeException;
	public List<Employee> getAllEmployees() throws EmployeeException;
}
