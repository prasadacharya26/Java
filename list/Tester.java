package com.wolken.exception_handling.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Festival fest=new Festival();
		System.out.println("Enter festival name:");
		String name=sc.nextLine();
		System.out.println("Enter date:");
		String date=sc.nextLine();
		System.out.println("Enter number of days:");
		byte noofDay=sc.nextByte();
		sc.nextLine();
		System.out.println("Enter Specification:");
		String specification=sc.nextLine();
		fest.setName(name);
		fest.setDate(date);
		fest.setNoOfDays(noofDay);
		fest.setSpecification(specification);
		ArrayList arrayList=new ArrayList();
		ArrayList arrayList1=new ArrayList();
		arrayList1.add("Prasad");
		arrayList1.add(8197192003l);
		arrayList.add(fest);
		
		ArrayList arrayList2=new ArrayList();
		arrayList.add("A");
		arrayList.add("Z");
		arrayList.add("P");
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("--------------Add--------------------");
		arrayList.add("Prasad");
		arrayList.add(8197192003l);
		arrayList.add(2,"prasadacharya092@gmail.com");
	
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("--------------AddAll--------------------");
		arrayList.addAll(arrayList1);
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("--------------IndexOf--------------------");
		System.out.println(arrayList.indexOf("Prasad"));
		
		System.out.println("--------------Size--------------------");
		System.out.println(arrayList.size());
		
		System.out.println("----------Conatins------------------------");
		System.out.println(arrayList.contains("Prasad"));
		
		System.out.println("----------ConatinsAll------------------------");
		System.out.println(arrayList.containsAll(arrayList1));
		
		System.out.println("----------Sort------------------------");
		Collections.sort(arrayList2);
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList2.get(i));
		}
		
		System.out.println("-----------Remove-----------------------");
		arrayList.remove(3);
		System.out.println("After remove index 3s");
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("-------------Clear---------------------");
		arrayList.clear();
		System.out.println("After clear");
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("-------------isEmpty---------------------");
		if(arrayList.isEmpty()) {
			System.out.println("Empty");
		}else {
			System.out.println("Not Empty");
		}
		
	}
}
