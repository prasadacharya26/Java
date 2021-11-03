package com.wolken.laptop.DI;

public class Laptop {
	private String name;
	private int price;
	Features features;
	
	public Laptop() {
		System.out.println("Default constructot");
	}
	public Laptop(String name,int price,Features features) {
		this.name=name;
		this.price=price;
		this.features=features;
	}
	public void print() {
		System.out.println("Name:"+name);
		System.out.println("price:"+price);
		System.out.println("details:"+features);
	}
}
