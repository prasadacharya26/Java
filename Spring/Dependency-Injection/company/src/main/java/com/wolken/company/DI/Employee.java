package com.wolken.company.DI;

public class Employee {
	private String name;
	private int salary;
	private String email;
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", email=" + email + "]";
	}
	
	
}
