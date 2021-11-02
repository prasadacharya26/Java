package com.wolken.olympic.DI;

public class Country {
	private String name;
	private int medal;
	private int rank;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMedal(int medal) {
		this.medal = medal;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", medal=" + medal + ", rank=" + rank + "]";
	}
	
	
}
