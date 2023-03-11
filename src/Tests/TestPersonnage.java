package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import application.*;

class TestPersonnage {

	@Test
	void testPositionPersonnage() {
		Personnage.initialiserPersonnage();
		Personnage perso = new Personnage();
		assertEquals(0, perso.getPosX());
		assertEquals(0, perso.getPosY());
	}
	
	@Test
	void testDeplacementDroite() {
		Personnage.initialiserPersonnage();
		Personnage perso = new Personnage();
		perso.deplacerX(1);
		assertEquals(1,perso.getPosX());
	}
	
	@Test
	void testDeplacement2Droite() {
		Personnage.initialiserPersonnage();
		Personnage perso = new Personnage();
		perso.deplacerX(1);
		perso.deplacerX(1);
		assertEquals(2,perso.getPosX());
	}
	
	@Test
	void testDeplacementGauche() {
		Personnage.initialiserPersonnage();
		Personnage perso = new Personnage();
		perso.deplacerX(-1);
		assertEquals(-1,perso.getPosX());
	}
	
	@Test
	void testDeplacementHaut() {
		Personnage.initialiserPersonnage();
		Personnage perso = new Personnage();
		perso.deplacerY(1);
		assertEquals(1,perso.getPosY());
	}
	
	@Test
	void testDeplacementBas() {
		Personnage.initialiserPersonnage();
		Personnage perso = new Personnage();
		perso.deplacerY(-1);
		assertEquals(-1,perso.getPosY());
	}

}
