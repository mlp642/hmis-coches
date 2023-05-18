package org.hmis;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MainTest {
	
	PrintStream originalOut = System.out;
    ByteArrayOutputStream bos = new ByteArrayOutputStream();

	@Test
	void testObjectNotNull() {

		Main main = new Main();

		assertNotEquals(main, null);
	}


	 @Test
	 public void testMain(){
		 
		 String ruta = "data/coches.json";
	     Coche[] coches = JsonReader.leerCochesJSON(ruta);

	     String cadena = "";

	     for (Coche coche : coches) {
	        cadena = cadena + coche + System.lineSeparator();
	     }
	    
	     //salida se guarda en un array
	     System.setOut(new PrintStream(bos));
	      
	     // Ejecuta la función main
	      Main.main(null);

		  assertEquals(cadena, bos.toString());
	   
	     // salida vuelve a mostrarse por consola
	     System.setOut(originalOut);
	   }
	
}
