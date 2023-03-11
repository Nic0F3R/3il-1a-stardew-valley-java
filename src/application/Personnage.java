package application;

public class Personnage {

	private int posX;
	private int posY;
	
	public Personnage() {
		this.posX = 0;
		this.posY = 0;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void deplacerX(int x) {
		this.posX += x;
	}

	public void deplacerY(int y) {
		this.posY += y;
	}

}
