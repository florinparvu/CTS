package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ase.csie.grupa1053.Carte;

public class TestCarteTitluNull {

	//titlul carti sa nu fie NULL
	@Test
	public void test() {
		Carte c4 = new Carte();
		assertNotNull(c4.getNume());
	}

}
