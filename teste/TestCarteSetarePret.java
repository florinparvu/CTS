package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ase.csie.grupa1053.Carte;

public class TestCarteSetarePret {

	@Test
	public void test() {
		double pret = 25;
		
		Carte c3 = new Carte();
		c3.setPret(pret);
		assertTrue(c3.getPret() == pret);		
	}

}
