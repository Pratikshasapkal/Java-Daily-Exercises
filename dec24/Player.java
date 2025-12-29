package com.tka.dec24;

public class Player {

	int jersy_num;
	String p_name;
	int runs;
	int wickets;
	String team_name;
	
	Player(int j, String p, int r, int w, String t){
		
		jersy_num = j;
		p_name = p;
		runs = r;
		wickets =w;
		team_name = t;
		
		System.out.println(j + " " + p + " " + r + " " + w + " " + t);
	}
}
