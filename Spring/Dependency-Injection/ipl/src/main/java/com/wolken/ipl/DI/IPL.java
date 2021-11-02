package com.wolken.ipl.DI;

public class IPL {
	private String teamname;
	private int won;
	private int rank;
	Players players;
	
	public IPL() {
		System.out.println("Default constructor");
	}
	
	public IPL(String teamname,int won,int rank,Players players) {
		this.teamname=teamname;
		this.won=won;
		this.rank=rank;
		this.players=players;
	}
	public void print() {
		System.out.println("Team Name :"+teamname);
		System.out.println("Won :"+won);
		System.out.println("Rank :"+rank);
		System.out.println("Team Details :"+players);
	}
}
