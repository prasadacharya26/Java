package com.wolken.ipl.DI;

public class Players {
	private String captain;
	private String coach;
	private String owner;
	
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Players [captain=" + captain + ", coach=" + coach + ", owner=" + owner + "]";
	}
	
	
}
