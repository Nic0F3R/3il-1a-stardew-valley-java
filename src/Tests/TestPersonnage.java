package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import application.*;

class TestPersonnage {

	@Test
	void testPositionPersonnage() {
		Personnage perso = new Personnage();
		assertEquals(0, perso.getPosX());
		assertEquals(0, perso.getPosY());
	}

}
