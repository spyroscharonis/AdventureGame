
public class Square {
	
	int x;
	int y;
	GameObject newobj; 
	
	
	public Square(int x, int y) {
		this.x = x;
		this.y = y; 
		newobj = null; 
	}
	
	public void occupySquare(SwampHero player) {
		if (this.newobj != null) {
			this.newobj.setAvail(false); 
		// place GameObject here
		this.newobj = newobj; 
		}
	}
	
	public boolean isOccupied() {
		
		if (newobj != null) {
			return true;
		}
		
		else return false; 
		
		}
	
	public GameObject vacateSpot() {
		GameObject releasedGameObj = this.newobj;
		this.newobj = null; 
		return releasedGameObj; 
	}
	

}
