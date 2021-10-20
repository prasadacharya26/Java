package com.wolken.market_details.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="market_details")
public class Market_Details {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="noOfShops")
	private int noOfshops;
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
	public int getNoOfshops() {
		return noOfshops;
	}
	public void setNoOfshops(int noOfshops) {
		this.noOfshops = noOfshops;
	}
	@Override
	public String toString() {
		return "Market_Details [id=" + id + ", name=" + name + ", location=" + location + ", noOfshops=" + noOfshops
				+ "]";
	}
}
