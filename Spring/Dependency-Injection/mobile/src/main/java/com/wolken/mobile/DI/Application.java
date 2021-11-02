package com.wolken.mobile.DI;

public class Application {
	private String appname;
	private int size;
	private int rate;
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "Application [appname=" + appname + ", size=" + size + ", rate=" + rate + "]";
	}
	
}
