package teste;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import ase.csie.grupa1053.Carte;

public class TestCarteTitluReturnat {

	//verificare daca numele asteptat este cel furnizat de catre constructor
	@Test
	public void test() {
		String titlu = "Nume";
		Carte carte2 = new Carte();
		assertTrue(carte2.getNume().equals(titlu));
	}

}
