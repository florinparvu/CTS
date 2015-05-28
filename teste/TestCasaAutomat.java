package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import junit.framework.TestCase;

import org.junit.Test;

import ase.csie.grupa1053.Casa;

public class TestCasaAutomat extends TestCase{
	//preconditii
	Casa casa7;
	final String fisier = "Casa.txt";
	public void setUp(){
		System.out.println("SetUp unit test");
		casa7 = new Casa(100, 1000, 50);		
	}

	//preluare valori din fisier
	
	@Test
	public void testValoriFisier() throws Exception {
		File file = new File(fisier);
		
		if(!file.exists())
			throw new FileNotFoundException("Lipsa fisier "+this.fisier);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String linie = null;
		while((linie = reader.readLine())!=null){
			
			//elimin comentariile
			if(linie.startsWith("#"))
				continue;
			
			//elimin valorile initiale
			if(linie.startsWith("initial"))
				continue;
			
			//elimin spatiile si liniile goale
			linie = linie.trim();
			if(linie.isEmpty())
				continue;
			
			//procesare si testare valori
			Casa c = new Casa(casa7.getTotal(), 1000, 50);
			String[] valori = linie.split("\t");
			if(valori.length==1)
				continue;
			double suma = Double.parseDouble(valori[0]);
			double expected = Double.parseDouble(valori[1]);
			
			//System.out.println("Suma " + suma + "    Expected: " + expected);
			
			c.totalCasa(suma);
			
			assertEquals("Testare depozit",expected,c.getTotal());
			
			System.out.println("Testare: "+linie);
			
		}
		
		reader.close();		
		
	}

}


