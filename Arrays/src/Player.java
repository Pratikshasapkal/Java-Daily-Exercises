public class Player {

	int jerseyNo;
	String name;
	int runs;
	int wickets;
	String teamName;

	public Player(int j, String n, int r, int w, String t) {

		this.jerseyNo = j;
		this.name = n;
		this.wickets = w;
		this.teamName = t;
		
	}

	public static void main(String[] args) {

		Player[] rcb = new Player[11];

		rcb[0]  = new Player(18, "Virat Kohli", 7263, 4, "RCB");
		rcb[1]  = new Player(17, "AB de Villiers", 5162, 0, "RCB");
		rcb[2]  = new Player(97, "Glenn Maxwell", 2771, 36, "RCB");
		rcb[3]  = new Player(19, "Faf du Plessis", 4133, 0, "RCB");
		rcb[4]  = new Player(5, "Dinesh Karthik", 4516, 0, "RCB");
		rcb[5]  = new Player(23, "Harshal Patel", 230, 135, "RCB");
		rcb[6]  = new Player(99, "Mohammed Siraj", 58, 109, "RCB");
		rcb[7]  = new Player(7, "Wanindu Hasaranga", 196, 35, "RCB");
		rcb[8]  = new Player(10, "Josh Hazlewood", 45, 25, "RCB");
		rcb[9]  = new Player(28, "Shahbaz Ahmed", 321, 13, "RCB");
		rcb[10] = new Player(13, "Rajat Patidar", 799, 0, "RCB");

	
		for (Player p : rcb) {
			System.out.println(
				p.jerseyNo + " " +
				p.name + " " +
				p.runs + " " +
				p.wickets + " " +
				p.teamName
			);
		}
	}
}
