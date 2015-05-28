package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ase.csie.grupa1053.Carte;

public class TestCarteTitlu {

	@Test
	public void test() {
		Carte c1 = new Carte();
		int rezultat = c1.succesiuneLitere("Raid aerian");
		assertEquals(1, rezultat);
	}

}
