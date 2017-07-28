
public class BarrenMoor {	
	
	public static void main(String[] args) { 
		 
		System.out.println("Welcome to the Barren Moor Adventure Game!\n" +
						   "You have awakon to find yourself in a barren moor\n" +
						   "You are at the centre of the moor and many\n" + 
						   "malicious swamp creatures await you!\n" + 
						   "They will stop at nothing to kill you as you\n" +
						   "are in their territory!\n"); 
		
		System.out.println("However, not all is bad! Somewhere in the swamp\n" +
						   "a treasure awaits you which will transport you\n" + 
						   "back home! You have a magic compass that informs" +
						   "you how far away the next feature is!\n" + 
						   "Use this to find the treasure and avoid \n" + 
						   "a grim death ... Good Luck on your quest!"); 
		
		
		
		SwampHero player = new SwampHero(50, true, false);
		System.out.println(player);
		player.playerMove("N");
		
	}
	

	
}
