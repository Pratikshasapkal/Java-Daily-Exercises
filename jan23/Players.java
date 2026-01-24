package com.tka.jan23;

public class Players {
	
	private int jerseyNum;
	private String name;
	private int runs;
	private int wickets;
	private String teamName;
	
	Players(int j, String n, int r, int w, String t){
		
		this.jerseyNum = j;
		this.name = n;
		this.runs = r;
		this.wickets = w;
		this.teamName = t;
		
	}

	public int getJerseyNum() {
		return jerseyNum;
	}

	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Players [jerseyNum=" + jerseyNum + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets + ", teamName=" + teamName + "]";
	}
	
	

}
