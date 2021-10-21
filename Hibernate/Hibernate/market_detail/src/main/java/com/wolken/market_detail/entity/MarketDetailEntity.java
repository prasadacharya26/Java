package com.wolken.market_detail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="market_details")
public class MarketDetailEntity {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String location;
	@Column
	private int noOfShops;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfShops() {
		return noOfShops;
	}
	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}
	
	@Override
	public String toString() {
		return "MarketDetailEntity [id=" + id + ", name=" + name + ", location=" + location + ", noOfShops=" + noOfShops
				+ "]";
	}
	
	
}
