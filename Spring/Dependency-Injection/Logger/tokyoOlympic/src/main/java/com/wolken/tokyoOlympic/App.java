package com.wolken.tokyoOlympic;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.wolken.tokyoOlympic.dto.OlympicDTO;
import com.wolken.tokyoOlympic.service.OlympicService;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	Logger logger=Logger.getLogger(App.class);
        String ans;
        do {
        	System.out.println("Enter id");
    		int id=sc.nextInt();
    		sc.nextLine();
    		System.out.println("Enter country name");
    		String name=sc.nextLine(); 
    		System.out.println("Enter rank");
    		int rank=sc.nextInt();
    		System.out.println("Enter number of gold medal");
    		int gold=sc.nextInt();
    		System.out.println("Enter number of silver medal");
    		int silver=sc.nextInt();
    		System.out.println("Enter number of bronze medal");
    		int bronze=sc.nextInt();
    		OlympicService service =  (OlympicService) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("service");
   		 
    		OlympicDTO dto=new OlympicDTO();
    		dto.setId(id);
    		dto.setCountryName(name);
    		dto.setPosition(rank);
    		dto.setGold(gold);
    		dto.setSilver(silver);
    		dto.setBronze(bronze);
    		
    		String isSaved=service.validateandsave(dto);
    		logger.info(isSaved);	
    		System.out.println("Do yo want to continue:");
    		ans=sc.next();
        }while(ans.equals("yes"));
    }
}
