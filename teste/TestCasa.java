package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ase.csie.grupa1053.Casa;


public class TestCasa {
	private Casa casa;


	@BeforeClass
	public static void setUpClass(){
		System.out.println("--Set up class");
	}
	
	@Before
	public void setUp(){
		System.out.println("--setup");
		casa = new Casa(500, 1000, 0);
		
	}
	@After
	public void tearDown(){
		System.out.println("-teardown");
		casa = null;
	}
	
	@AfterClass
	public static void tearDownClass(){
		System.out.println("--Tear down class");
	}
	
	
	//suma corecta in casa
	@Test
	public void test_suma_casa() {
		Casa casa1 = new Casa();
		double rezultat = casa1.total(500.0, 10.20);
		System.out.println(rezultat);
		assertEquals(510.20, rezultat, 0);
	}
	
	//impartire profit in mod corect

	@Test
	public void test_impartire_profit_corect(){
		Casa casa2 = new Casa();
		double rezultat = casa2.impartireProfit(500, 2);
		assertEquals(250, rezultat, 0);
	}
	
   //impartire profit in mod incorect
	@Test
	public void test_impartire_profit_eronat(){
		Casa casa3 = new Casa();
		double rezultat = 0;
		try{
			rezultat=casa3.impartireProfit(500, 0);
			System.out.println(rezultat);
			fail("trebuie sa fie exceptie");
		}
		catch(Exception e){
			System.out.println("Nu se poate divide prin 0");
		}
	}
	
	
	//mai mult de doua zecimale
	@Test
	public void test_zecimale_depozit(){
		Casa casa4 = new Casa(10, 100, 50);
		try {
			casa4.depozit(10.8889);
			assertFalse("Metoda nu arunca exceptie", true);
		} catch (Exception e) {
			assertTrue(true);
		}		
		
	}
	
	//test valori care depasesc limita
	@Test
	public void test_valori_limita(){
		try {
			Casa casa5 = new Casa(900, 1000, 50);
			double suma = 300;		
			casa5.depozit(suma);			
		} catch (Exception e) {			
			
		}
		
		
	}
	
	
	//testare valori nule
	@Test
	public void test_valori_nule(){
		
		try {
			Casa casa6 = new Casa(900, 1000, 50);
			double suma = 0;		
			casa6.depozit(suma);			
		} catch (Exception e) {			
			System.out.println("Trebuie o suma mai mare de 0");
		}
				
	}
	


}
