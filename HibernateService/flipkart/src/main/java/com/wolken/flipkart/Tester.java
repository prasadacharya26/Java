package com.wolken.flipkart;

import java.util.Scanner;

import com.wolken.flipkart.dto.FlipkartDTO;
import com.wolken.flipkart.service.RegistrationService;
import com.wolken.flipkart.service.RegistrationServiceImpl;



public class Tester {

	public static void main(String[] args) {
		RegistrationService service=new RegistrationServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter user name");
		String name=sc.nextLine();
		System.out.println("Enter email id");
		String email=sc.nextLine();
		System.out.println("Enter contact number");
		long contactNo=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter password");
		String password=sc.nextLine();
		
		FlipkartDTO dto=new FlipkartDTO();
		dto.setId(id);
		dto.setUsername(name);
		dto.setEmail(email);
		dto.setContactNumber(contactNo);
		dto.setPassword(password);
		String isSaved=service.validateandsave(dto);
		System.out.println(isSaved);
	}
}
