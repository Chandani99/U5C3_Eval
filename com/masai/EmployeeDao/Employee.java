package com.masai.EmployeeDao;

public class Employee {
    private int id;
    private String name;
    private String adderss;
    private int salary;
    
    
	public Employee() {
	}
	
	public Employee(int id, String name, String adderss, int salary) {
		this.id = id;
		this.name = name;
		this.adderss = adderss;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", adderss=" + adderss + ", salary=" + salary + "]";
	}
    
}
