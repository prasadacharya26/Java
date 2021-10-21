package com.wolken.market_detail;

import java.util.Scanner;

import com.wolken.market_detail.dao.MarketDetailsDAO;
import com.wolken.market_detail.dao.MarketDetailsDAOImpl;
import com.wolken.market_detail.entity.MarketDetailEntity;

public class MarketDetailsTester {
	public static void main(String[] args) {
		MarketDetailsDAO dao = new MarketDetailsDAOImpl();
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		String ans;
		do {
			System.out.println("1.Save");
			System.out.println("2.Display by Id");
			System.out.println("3.Update by Id");
			System.out.println("4.Delete by Id");
			System.out.println("Enter your choice");
			int ch=scanner.nextInt();
			if(ch==1) {
				System.out.println("Enter market Id");
				int id=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter market name");
				String name=scanner.nextLine();
				System.out.println("Enter market location");
				String loaction=scanner.nextLine();
				System.out.println("Enter market number of shops");
				int noOfshops=scanner.nextInt();
				
				MarketDetailEntity entity=new MarketDetailEntity();
				entity.setId(id);
				entity.setName(name);
				entity.setLocation(loaction);
				entity.setNoOfShops(noOfshops);
				
				boolean isSaved=dao.save(entity);
				if(isSaved) {
					System.out.println("Data Saved");
				}else {
					System.out.println("Data not saved");
				}
			}
			else if(ch==2) {
				System.out.println("Enter market Id");
				int id=scanner.nextInt();
				boolean found=dao.getById(id);
				if(found){
					System.out.println("Data found");
				}else {
					System.out.println("Data not found");
				}
			}
			else if(ch==3) {
				System.out.println("Enter market Id");
				int id=scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter market name");
				String name=scanner.nextLine();
				System.out.println("Enter market location");
				String loaction=scanner.nextLine();
				System.out.println("Enter market number of shops");
				int noOfshops=scanner.nextInt();
				
				MarketDetailEntity entity=new MarketDetailEntity();
				entity.setId(id);
				entity.setName(name);
				entity.setLocation(loaction);
				entity.setNoOfShops(noOfshops);
				
				boolean isUpdated=dao.updateById(entity);
				if(isUpdated) {
					System.out.println("Data Updated");
				}else {
					System.out.println("Data not updated");
				}
			}
			else if(ch==4) {
				System.out.println("Enter market Id");
				int id=scanner.nextInt();
				MarketDetailEntity entity=new MarketDetailEntity();
				entity.setId(id);
				boolean found=dao.deleteById(entity);
				if(found){
					System.out.println("Data Deleted");
				}else {
					System.out.println("Data not found");
				}
			}
			scanner.nextLine();
			System.out.println("Do you want to continue");
			ans=scanner.nextLine();
		}while(ans.equals(ans));
	}
}
