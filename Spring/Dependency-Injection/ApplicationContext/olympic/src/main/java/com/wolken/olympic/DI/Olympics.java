package com.wolken.olympic.DI;

public class Olympics {
	private String name;
	private String nation;
	private int year;
	Country country;
	
	public Olympics() {
		System.out.println("Default Constructor");
	}
	public Olympics(String name,String nation,int year,Country country) {
		System.out.println("Olympics Constructor");
		this.name=name;
		this.nation=nation;
		this.year=year;
		this.country=country;
	}
	
	public void print() {
		System.out.println("Name :"+name);
		System.out.println("Nation :"+nation);
		System.out.println("Year :"+year);
		System.out.println("Country Details :"+country);
	}
	
}
