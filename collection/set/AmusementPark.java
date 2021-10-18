package com.wolken.exception_handling.set;

public class AmusementPark {
	public static final int id = 0;
	private String name;
	private String city;
	private String state;
	private byte rating;
	private long phone;
	private byte pool;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public byte getRating() {
		return rating;
	}
	public void setRating(byte rating) {
		this.rating = rating;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public byte getPool() {
		return pool;
	}
	public void setPool(byte pool) {
		this.pool = pool;
	}
}
