package com.wolken.exception_handling.list.task;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Tester {
	 static Scanner sc=new Scanner(System.in);
	 static List<Gun> linked=new LinkedList();

	void save(Gun gun) {
		linked.add(gun);
	}
	
	void saveAll(List<Gun> array) {
		linked.addAll(array);
	}
	
	void display() {
		System.out.println("Name\t\tType\t\tWeight\tPrice\tBullets\tRange");
		System.out.println("-------------------------------------------------------------------");
		for(Gun gun:linked) {
			String name=gun.getName();
			String type=gun.getType();
			short weight=gun.getWeight();
			float price=gun.getPrice();
			int noOfBullets=gun.getNoOfBullets();
			short range=gun.getRange();
			System.out.println(name+"\t\t"+type+"\t\t"+weight+"\t"+price+"\t"+noOfBullets+"\t"+range);
		}
		
	}
	
	void displayOne(String name) {
		System.out.println("Name\t\tType\t\tWeight\tPrice\tBullets\tRange");
		System.out.println("---------------------------------------------------------------------");
		for(Gun gun:linked) {
			if(gun.getName().equals(name)) {
				String fname=gun.getName();
				String type=gun.getType();
				short weight=gun.getWeight();
				float price=gun.getPrice();
				int noOfBullets=gun.getNoOfBullets();
				short range=gun.getRange();
				System.out.println(fname+"\t\t"+type+"\t\t"+weight+"\t"+price+"\t"+noOfBullets+"\t"+range);
				return;
			}
		}
		System.out.println("Not Found!!!");
		
	}
	
	boolean update(String name) {
		for(Gun gun:linked) {
			if(gun.getName().equals(name)) {
				System.out.println("Enter gun type:");
				String type=sc.nextLine();
				System.out.println("Enter gun weight:");
				short weight=sc.nextShort();
				System.out.println("Enter gun price:");
				float price=sc.nextFloat();
				System.out.println("Enter gun number of bullets:");
				int noOfBullets=sc.nextInt();
				System.out.println("Enter gun range:");
				short range=sc.nextShort();
				
				gun.setName(name);
				gun.setType(type);
				gun.setWeight(weight);
				gun.setPrice(price);
				gun.setNoOfBullets(noOfBullets);
				gun.setRange(range);
				//linked.set(linked.indexOf(gun), gun);
				return true;
			}
		}
		return false;
	}
	
	boolean deleteOne(String name) {
		for(Gun gun:linked) {
			if(gun.getName().equals(name)) {
				linked.remove(gun);
				return true;
			}
		}
		return false;
	}
	
	boolean deleteAll() {
		linked.clear();
		return true;
	}
	public static void main(String[] args) {
		Tester test=new Tester();
		String ans;
		do {
			System.out.println("1.Save one");
			System.out.println("2.Save more");
			System.out.println("3.Display All");
			System.out.println("4.Display One");
			System.out.println("5.Update");
			System.out.println("6.Delete One");
			System.out.println("7.Delete All");
			System.out.println("Enter your choice:");
			int ch=sc.nextInt();
			
			if(ch==1) {
				sc.nextLine();
				System.out.println("Enter gun name:");
				String name=sc.nextLine();
				System.out.println("Enter gun type:");
				String type=sc.nextLine();
				System.out.println("Enter gun weight:");
				short weight=sc.nextShort();
				System.out.println("Enter gun price:");
				float price=sc.nextFloat();
				System.out.println("Enter gun number of bullets:");
				int noOfBullets=sc.nextInt();
				System.out.println("Enter gun range:");
				short range=sc.nextShort();
				
				Gun gun=new Gun();
				gun.setName(name);
				gun.setType(type);
				gun.setWeight(weight);
				gun.setPrice(price);
				gun.setNoOfBullets(noOfBullets);
				gun.setRange(range);
				
				test.save(gun);
				
				
			}
			else if(ch==2) {
				List<Gun> arrayList = new ArrayList();
				System.out.println("Enter number of elements");
				byte num=sc.nextByte();
				for(int i=0;i<num;i++) {
					sc.nextLine();
					System.out.println("Enter gun name:");
					String name=sc.nextLine();
					System.out.println("Enter gun type:");
					String type=sc.nextLine();
					System.out.println("Enter gun weight:");
					short weight=sc.nextShort();
					System.out.println("Enter gun price:");
					float price=sc.nextFloat();
					System.out.println("Enter gun number of bullets:");
					int noOfBullets=sc.nextInt();
					System.out.println("Enter gun range:");
					short range=sc.nextShort();
					
					Gun gun=new Gun();
					gun.setName(name);
					gun.setType(type);
					gun.setWeight(weight);
					gun.setPrice(price);
					gun.setNoOfBullets(noOfBullets);
					gun.setRange(range);
					
					arrayList.add(gun);
				}
				test.saveAll(arrayList);
			}
			else if(ch==3) {
				test.display();
			}
			else if(ch==4) {
				sc.nextLine();
				System.out.println("Enter gun name:");
				String name=sc.nextLine();
				test.displayOne(name);
			}
			else if(ch==5) {
				sc.nextLine();
				System.out.println("Enter gun name:");
				String name=sc.nextLine();
				boolean flag=test.update(name);
				if(flag) {
					System.out.println("Updated Sucessfully");
				}else {
					System.out.println("Not Updated/Not Found");
				}
			}
			else if(ch==6) {
				sc.nextLine();
				System.out.println("Enter gun name:");
				String name=sc.nextLine();
				boolean flag=test.deleteOne(name);
				if(flag) {
					System.out.println("Deleted Sucessfully");
				}else {
					System.out.println("Not Deleted/Not Found");
				}
			}
			else if(ch==7) {
				boolean flag=test.deleteAll();
				if(flag) {
					System.out.println("Deleted Sucessfully");
				}else {
					System.out.println("Not Deleted/Not Found");
				}
			}
			System.out.println("Do you want to continue(yes/no):");
			ans=sc.next();
		}while(ans.equals(ans));
	}

	
}
