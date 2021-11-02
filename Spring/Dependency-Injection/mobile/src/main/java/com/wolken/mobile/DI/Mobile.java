package com.wolken.mobile.DI;

public class Mobile {
	private String mobilename;
	private String model;
	private int price;
	Application application;
	
	public Mobile() {
		System.out.println("Default Constructor");
	}
	
	public Mobile(String mobilename,String model,int price,Application application) {
		this.mobilename=mobilename;
		this.model=model;
		this.price=price;
		this.application=application;
	}
	
	public void print() {
		System.out.println("mobile Name :"+mobilename);
		System.out.println("model :"+model);
		System.out.println("price :"+price);
		System.out.println(" Details :"+application);
	}
}
