package com.masai.testCases;

import java.util.Scanner;

import com.masai.EmployeeDao.Employee;
import com.masai.EmployeeDao.EmployeeDao;
import com.masai.EmployeeDao.EmployeeDaoImpl;


public class InsertDetails {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id");
		int id= sc.nextInt();
		
		System.out.println("Enter name");
		String name= sc.next();
		
		System.out.println("Enter address");
		String address= sc.next();
		
		System.out.println("Enter Salary");
		int marks= sc.nextInt();
		
		
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setAdderss(address);
		emp.setSalary(marks);
		
		
		
		String msg= dao.saveEmployeeDetails(emp);

		System.out.println(msg);

	}

}
