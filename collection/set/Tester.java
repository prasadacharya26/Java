package com.wolken.exception_handling.set;

import java.util.*;

import com.wolken.exception_handling.list.task.Gun;

public class Tester implements Comparable<AmusementPark>{
	 static Scanner sc=new Scanner(System.in);
	 static Set<AmusementPark> treeSet=new TreeSet<AmusementPark>();
	 int id;
	void save(AmusementPark parks) {
		treeSet.add(parks);
	}
	void saveAll(Set<AmusementPark> park) {
		treeSet.addAll(park);
	}
	
	void display() {
		System.out.println("Name\t\tCity\t\tState\t\tRating\tPhone\t\tPool");
		System.out.println("-------------------------------------------------------------------");
		for(AmusementPark parks:treeSet) {
			String name=parks.getName();
			String city=parks.getCity();
			String state=parks.getState();
			byte rate=parks.getRating();
			long phone=parks.getPhone();
			byte pool=parks.getPool();
			System.out.println(name+"\t\t"+city+"\t\t"+state+"\t\t"+rate+"\t"+phone+"\t\t"+pool);
		}
	}
	
	void displayOne(String name) {
		System.out.println("Name\t\tCity\t\tState\t\tRating\tPhone\t\tPool");
		System.out.println("-------------------------------------------------------------------");
		for(AmusementPark parks:treeSet) {
			if(parks.getName().equals(name)) {
				String pname=parks.getName();
				String city=parks.getCity();
				String state=parks.getState();
				byte rate=parks.getRating();
				long phone=parks.getPhone();
				byte pool=parks.getPool();
				System.out.println(pname+"\t\t"+city+"\t\t"+state+"\t\t"+rate+"\t"+phone+"\t\t"+pool);
				return;
			}
		}
		System.out.println("Not Found!!!");
		
	}
	
	boolean update(String name) {
		for(AmusementPark park:treeSet) {
			if(park.getName().equals(name)) {
				System.out.println("Enter park name:");
				String pname=sc.nextLine();
				System.out.println("Enter park city:");
				String city=sc.nextLine();
				System.out.println("Enter park state:");
				String state=sc.nextLine();
				System.out.println("Enter park rating:");
				byte rating=sc.nextByte();
				System.out.println("Enter park phone number:");
				long phone=sc.nextLong();
				System.out.println("Enter park number of pool:");
				byte pool=sc.nextByte();
				
				park.setName(pname);
				park.setCity(city);
				park.setState(state);
				park.setRating(rating);
				park.setPhone(phone);
				park.setPool(pool);
				//linked.set(linked.indexOf(gun), gun);
				return true;
			}
		}
		return false;
	}
	
	boolean deleteOne(String name) {
		for(AmusementPark park:treeSet) {
			if(park.getName().equals(name)) {
				treeSet.remove(park);
				return true;
			}
		}
		return false;
	}
	
	boolean deleteAll() {
		treeSet.clear();
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
				System.out.println("Enter park name:");
				String name=sc.nextLine();
				System.out.println("Enter park city:");
				String city=sc.nextLine();
				System.out.println("Enter park state:");
				String state=sc.nextLine();
				System.out.println("Enter park rating:");
				byte rating=sc.nextByte();
				System.out.println("Enter park phone number:");
				long phone=sc.nextLong();
				System.out.println("Enter park number of pool:");
				byte pool=sc.nextByte();
				
				AmusementPark park=new AmusementPark();
				park.setName(name);
				park.setCity(city);
				park.setState(state);
				park.setRating(rating);
				park.setPhone(phone);
				park.setPool(pool);
				
				test.save(park);
			}
			else if(ch==2) {
				Set<AmusementPark> tree = new TreeSet();
				System.out.println("Enter number of elements");
				byte num=sc.nextByte();
				for(int i=0;i<num;i++) {
					sc.nextLine();
					System.out.println("Enter park name:");
					String name=sc.nextLine();
					System.out.println("Enter park city:");
					String city=sc.nextLine();
					System.out.println("Enter park state:");
					String state=sc.nextLine();
					System.out.println("Enter park rating:");
					byte rating=sc.nextByte();
					System.out.println("Enter park phone number:");
					long phone=sc.nextLong();
					System.out.println("Enter park number of pool:");
					byte pool=sc.nextByte();
					
					AmusementPark park=new AmusementPark();
					park.setName(name);
					park.setCity(city);
					park.setState(state);
					park.setRating(rating);
					park.setPhone(phone);
					park.setPool(pool);
					
					tree.add(park);
				}
				test.saveAll(tree);
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

	@Override
	public int compareTo(AmusementPark park) {
		return Integer.compare(this.id, park.id);
	}	
}
