package com.wolken.company.DI;

public class Company {
	private String name;
	private int noOfemployee;
	Employee employee;
	
	public Company() {
		System.out.println("Default Constructor");
	}
	public Company(String name,int noOfemployee,Employee employee) {
		this.name=name;
		this.noOfemployee=noOfemployee;
		this.employee=employee;
	}
	
	public void print() {
		System.out.println("name:"+name);
		System.out.println("Number of employee:"+noOfemployee);
		System.out.println("details:"+employee);
	}
}
