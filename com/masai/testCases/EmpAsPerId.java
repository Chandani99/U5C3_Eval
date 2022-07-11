package com.masai.testCases;

import java.util.Scanner;

import com.masai.EmployeeDao.Employee;
import com.masai.EmployeeDao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;


public class EmpAsPerId {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id");
		int id= sc.nextInt();

		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		
		
		try {
			Employee emp= dao.getEmployeeById(id);
			
			
			System.out.println(emp);
			
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}

	}

}
