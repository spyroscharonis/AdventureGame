
public class GameObject {
	
	private boolean avail; 
	private int x; 
	private int y; 
	 
	
	public GameObject(boolean avail, int x, int y) {
		this.avail = avail;
		this.x = x; 
		this.y = y; 
	}
	
	public boolean isAvail() {
		return avail; 
	}
	
	public void setAvail(boolean avail) {
		this.avail = avail; 
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y; 
	}
	
	public void setY(int y) {
		this.y = y;
	}

}
