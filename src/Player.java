
public abstract class Player {
	
	private String name; 
	public double health; 
	
	
	public Player( double health) {
		this.name = chooseName();
		this.health = health; 
	}
	
	public String chooseName() {
		System.out.println("First of all, choose a name for your player: ");
		return InputClass.sc.nextLine();
	}	
	
	@Override 
	public String toString(){
		return this.name + this.health;
	}
	

}
