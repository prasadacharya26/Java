package com.wolken.market;

import java.util.Scanner;

import com.wolken.market.dao.MarketDetailsDAO;
import com.wolken.market.dao.MarketDetailsDAOImpl;
import com.wolken.market.dto.MarketDetailsDTO;

public class MarketDetailTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MarketDetailsDAO dao = new MarketDetailsDAOImpl();
		MarketDetailsDTO dto = new MarketDetailsDTO();
		String ans;
		do {
			System.out.println("1.Save");
			System.out.println("2.Display All");
			System.out.println("3.Display By Location");
			System.out.println("4.Update");
			System.out.println("5.Delete");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			
			if(ch==1) {
				System.out.println("Enter Market Id");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Market Name");
				String name = sc.nextLine();
				System.out.println("Enter Market Location");
				String loaction = sc.nextLine();
				System.out.println("Enter Market Number of shops");
				int shops = sc.nextInt();
				
				dto.setId(id);
				dto.setName(name);
				dto.setLocation(loaction);
				dto.setNoOfShop(shops);
				
				boolean isSaved = dao.save(dto);
				if(isSaved) {
					System.out.println("Data Saved");
				}else {
					System.out.println("Data not saved");
				}
			}
			else if(ch==2) {
				dao.displayAll();
			}
			else if(ch==3) {
				sc.nextLine();
				System.out.println("Enter Market Location");
				String loaction = sc.nextLine();
				dto.setLocation(loaction);
				boolean found = dao.displayOne(dto);
				if(found) {
					System.out.println("Data Found");
				}else {
					System.out.println("Data not found");
				}
			}
			else if(ch==4) {
				sc.nextLine();
				System.out.println("Enter Market Name");
				String name = sc.nextLine();
				System.out.println("Enter Market Number of shops");
				int shops = sc.nextInt();
				
				dto.setName(name);
				dto.setNoOfShop(shops);
				
				boolean isUpdated = dao.update(dto);
				if(isUpdated) {
					System.out.println("Data Updated");
				}else {
					System.out.println("Data not updated");
				}
			}
			else if(ch==5) {
				System.out.println("Enter Market Id");
				int id = sc.nextInt();
				
				dto.setId(id);
				boolean isDeleted = dao.delete(dto);
				if(isDeleted) {
					System.out.println("Data Deleted");
				}else {
					System.out.println("Not found");
				}
			}
			else {
				System.out.println("Enter valid number");
			}
			sc.nextLine();
			System.out.println("Do you want to continue(yes/no):");
			ans = sc.nextLine();
		}while(ans.equals("yes"));
	}
}
