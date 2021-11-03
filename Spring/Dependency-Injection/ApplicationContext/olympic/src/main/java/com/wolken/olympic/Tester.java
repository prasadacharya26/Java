package com.wolken.olympic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.olympic.DI.Olympics;

public class Tester {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		Olympics olympics=(Olympics) container.getBean("details");
		olympics.print();
	}
}
