package com.wolken.market.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wolken.market.dto.MarketDetailsDTO;

public class MarketDetailsDAOImpl implements MarketDetailsDAO{
	Connection con=null;
	PreparedStatement ps=null;
	boolean result=false;
	@Override
	public boolean save(MarketDetailsDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken","root","prsd@8197");
			ps = con.prepareStatement("INSERT INTO market_details VALUE (?,?,?,?)");
			ps.setInt(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getLocation());
			ps.setInt(4, dto.getNoOfShop());
			
			result = ps.execute();
			
			if(result) {
				return false;
			}else {
				return true;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}

	@Override
	public void displayAll() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken","root","prsd@8197");
			ps = con.prepareStatement("SELECT * FROM market_details");
			ResultSet rs = ps.executeQuery();
			System.out.println("Id\t Name \t\t Location \t\t Number of shop");
			System.out.println("-------------------------------------------------------------------------");
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String location = rs.getString(3);
				int shops = rs.getInt(4);
				System.out.println(id+"\t"+name+"\t"+location+ "\t\t  "+ shops);
				
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		
	}

	@Override
	public boolean displaybylocation(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken","root","prsd@8197");
			ps = con.prepareStatement("SELECT * FROM market_details WHERE location=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			System.out.println("Id\t Name \t\t Location \t\t Number of shop");
			System.out.println("-------------------------------------------------------------------------");
			while(rs.next()) {
				int id = rs.getInt(1);
				String sname = rs.getString(2);
				String location = rs.getString(3);
				int shops = rs.getInt(4);
				System.out.println(id+"\t"+sname+"\t"+location+ "\t\t  "+ shops);
				result=true;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}

	@Override
	public boolean updatebyname(String name,int shops) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken","root","prsd@8197");
			ps = con.prepareStatement("UPDATE market_details SET noOfShops=? WHERE name=?");
			ps.setInt(1, shops);
			ps.setString(2, name);
			
			result = ps.execute();
			
			if(result) {
				return false;
			}else {
				return true;
			}
	
		} catch (SQLException | ClassNotFoundException  e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}

	@Override
	public boolean deletebyId(int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wolken","root","prsd@8197");
			ps = con.prepareStatement("DELETE FROM market_details WHERE id=?");
			ps.setInt(1, id);
			result = ps.execute();
			
			if(result) {
				return false;
			}else {
				return true;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}
		}
		return result;
	}
	
}
