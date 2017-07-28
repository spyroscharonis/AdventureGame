import java.util.Random;

public class SwampHero extends Player {
	
	public boolean hasMagicCompass = true; 
	public boolean hasTreasure = false; 
	SwampGrid sg = new SwampGrid(); 

	
	public SwampHero( double health, boolean hasMagicCompass, boolean hasTreasure) {
		
		super(health);
		this.hasMagicCompass = hasMagicCompass;
		this.hasTreasure = hasTreasure;
		
	}
	
	public Square getInitPosition() {
		// start player at the centre of the grid 
		return sg.getSquare(24, 24); 
	}
	
	
	public void playerMove(String s) {
				
		System.out.println("Which direction would you like to travel? " +
		   		   " (N: north, E: East, S: South, W: West");
		
		s = InputClass.sc.nextLine();
		
		// Allow the player to choose between N,E,S,W 		
		if (!s.equals("N") || !s.equals("E") || !s.equals("S") || !s.equals("W")) {

			System.out.println("Your can only choose N, E, S, W"); 
			s = InputClass.sc.nextLine();
		}
		
		else {
			System.out.println("You moved " + s); 
		}
		
	}
	
	public Square playerMove1(String s, int n) {
		
		System.out.println("Which direction would you like to move in? " +
		   		   " (N: north, E: East, S: South, W: West");
		
		s = InputClass.sc.nextLine();
		

		// Allow the player to choose between N,E,S,W 		
		while (!s.equals("N") || !s.equals("E") || !s.equals("S") || !s.equals("W")) {

			System.out.println("Your can only choose N, E, S, W"); 
			s = InputClass.sc.nextLine();
		}
		
		switch (s) {
			case (s == "N")) :
				System.out.println("You moved north"); 
		}

		
		
	}
	

		
	

}
