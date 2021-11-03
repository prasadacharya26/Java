package com.wolken.laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.laptop.DI.Laptop;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		Laptop laptop=(Laptop) container.getBean("details");
		laptop.print();
	}
}
