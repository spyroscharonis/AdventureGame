
public class SwampGrid {
	
	private Square[][] squares = new Square[50][50]; 
	
	public SwampGrid() {
		
		// Discretise the swamp into a 50 x 50 grid of squares 
		for (int i = 0; i < squares.length; i++) {
			for (int j = 0; j < squares.length; j++) {
				this.squares[i][j] = new Square(i, j); 
			}
		}
	
	}
		
	
	public Square getSquare(int x, int y) {
		return squares[x][y];
	}	
	
	public void printSwamp() {
		for (int i = 0; i <= squares.length; i++) {
			for (int j = 0; j < squares.length; j++) {
				System.out.print(" S ");
			}
			System.out.println();
		}
	}
	
			
}


