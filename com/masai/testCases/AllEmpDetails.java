package com.masai.testCases;

import java.util.List;

import com.masai.EmployeeDao.Employee;
import com.masai.EmployeeDao.EmployeeDao;
import com.masai.EmployeeDao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;



public class AllEmpDetails {

	public static void main(String[] args) {
    EmployeeDaoImpl dao = new EmployeeDaoImpl();
		
	 	try {
			List<Employee> employee= dao.getAllEmployees();
			
			employee.forEach(e -> {
				
				System.out.println("Roll is :"+e.getId());
				System.out.println("Name is :"+e.getName());
				System.out.println("Address is :"+e.getAdderss());
				System.out.println("Marks is :"+e.getSalary());
				
				System.out.println("==================================");
				
			});
			
			
			
			
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
