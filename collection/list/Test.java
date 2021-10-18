package com.wolken.exception_handling.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList();
		Scanner sc=new Scanner(System.in);
		Festival fest=new Festival();
		for(int i=0;i<2;i++) {
		System.out.println("Enter festival name:");
		String name=sc.nextLine();
		System.out.println("Enter date:");
		String date=sc.nextLine();
		System.out.println("Enter number of days:");
		byte noofDay=sc.nextByte();
		sc.nextLine();
		System.out.println("Enter Specification:");
		String specification=sc.nextLine();
		String fname=fest.setName(name);
		String fdate =fest.setDate(date);
		byte numday=fest.setNoOfDays(noofDay);
		String specif=fest.setSpecification(specification);
		
		
		
		arrayList.add(fname);
		arrayList.add(fdate);
		arrayList.add(numday);
		arrayList.add(specif);
		}
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}
}
