package com.tka.jan23;

import java.util.ArrayList;

public class IPLPlayers {

	public static void main(String[] args) {
		
		ArrayList<Players> players = new ArrayList<>();
		
		players.add(new Players(18, "Virat Kohli", 7263, 4, "RCB"));
		players.add(new Players(45, "Rohit Sharma", 6211, 15, "MI"));
		players.add(new Players(7, "MS Dhoni", 5082, 0, "CSK"));
		players.add(new Players(33, "Hardik Pandya", 2309, 53, "MI"));
		players.add(new Players(77, "Shubman Gill", 2790, 0, "GT"));
		players.add(new Players(63, "Suryakumar Yadav", 3249, 0, "MI"));

		
		for(Players p : players) {
			System.out.println(p);
		}

	}

}
