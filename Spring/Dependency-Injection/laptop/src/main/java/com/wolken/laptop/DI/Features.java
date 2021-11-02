package com.wolken.laptop.DI;

public class Features {
	private String processor;
	private int ram;
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Features [processor=" + processor + ", ram=" + ram + "]";
	}
	
	
}
