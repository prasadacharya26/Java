package com.wolken.policyBaazar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.policyBaazar.dto.PolicyBazaarDTO;
import com.wolken.policyBaazar.service.RegistrationService;

public class App 
{
    public static void main( String[] args ) throws ParseException
    {
        Scanner sc=new Scanner(System.in);
        String ans;
        do {
        	
        	System.out.println("Enter id");
    		int id=sc.nextInt();
    		sc.nextLine();
    		System.out.println("Enter user name");
    		String name=sc.nextLine();
    		System.out.println("Enter contact number");
    		long contactNo=sc.nextLong();
    		sc.nextLine();
    		System.out.println("Enter user gender");
    		String gender=sc.nextLine();
    		System.out.println("Enter user date of birth(01/01/2000)");
    		String dbirth=sc.nextLine();
    		Date dob=new SimpleDateFormat("dd/MM/yyyy").parse(dbirth);  
    		System.out.println("Enter user age");
    		int age=sc.nextInt();
    		sc.nextLine();
    		System.out.println("Enter password");
    		String password=sc.nextLine();
    		RegistrationService service =  (RegistrationService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("service");
   		 
    		PolicyBazaarDTO dto=new PolicyBazaarDTO();
    		dto.setId(id);
    		dto.setUsername(name);
    		dto.setContactNumber(contactNo);
    		dto.setGender(gender);
    		dto.setDob(dob);
    		dto.setAge(age);
    		dto.setPassword(password);
    		
    		String isSaved=service.validateandsave(dto);
    		System.out.println(isSaved);
    		System.out.println("Do yo want to continue:");
    		ans=sc.next();
        }while(ans.equals("yes"));
    }
}
