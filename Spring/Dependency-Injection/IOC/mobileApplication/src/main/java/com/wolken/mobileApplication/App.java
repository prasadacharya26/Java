package com.wolken.mobileApplication;

import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.mobileApplication.dao.MobileAppDAOImpl;
import com.wolken.mobileApplication.dto.MobileAppDTO;
import com.wolken.mobileApplication.service.MobileAppService;
import com.wolken.mobileApplication.service.MobileAppServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
    
    	Scanner scanner=new Scanner(System.in);
    	
		System.out.println("Enter Id");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter application name");
		String name=scanner.nextLine();
		System.out.println("Enter application type");
		String type=scanner.nextLine();
		System.out.println("Enter application size");
		short size=scanner.nextShort();
		System.out.println("Enter application rating");
		byte rating=scanner.nextByte();
		MobileAppService service =  (MobileAppService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("appservice");
		    
		MobileAppDTO dto=new MobileAppDTO();
		dto.setId(id);
		dto.setAppName(name);
		dto.setType(type);
		dto.setSize(size);
		dto.setRating(rating);
		String isSaved = service.validateandSave(dto);
		System.out.println(isSaved);	
    }
}
