package org.hmis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



class CocheTest {

	@Test
	void testEqualsObject() {
		Coche c = new Coche ();   // Arrange
		assertTrue(c.equals(c));  // Action // Assert
	}
	
	@Test
	void testEqualsObjectNull() {
		Coche c = new Coche ();   // Arrange
		Coche c2 = null;
		assertFalse(c.equals(c2));  // Action // Assert
	}
	

	@Test
	void testEqualsObjectString() {
		Coche c = new Coche ();   // Arrange
		String c2 = "";
		assertFalse(c.equals(c2));  // Action // Assert
	}

	
	@Test
	void testEqualsObjectMultiple1() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple2() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2023, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple3() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple4() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Auris", 2022, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple5() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2022, 32000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}
	
	@ParameterizedTest
	@CsvSource({"Toyota, Corolla, 2023, 22000",
				"Nissan, Corolla, 2022, 22000",
				"Toyota, Auris, 2022, 22000",
				"Toyota, Corolla, 2022, 32000"})
	
	void testEqualsObjectMultipleParameterized(String marca, String modelo, int anio, int precio) {
		
		Coche c1 = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche c2 = new Coche(marca, modelo, anio, precio);
		
		assertEquals(false, c1.equals(c2));
	}
	
	
	@Test
	void testGetMarca() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, coche.getMarca().equals("Toyota"));  // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Toyota", "Ford", "Chevrolet", "Honda"})
	void testGetMarcaParameterized(String marca) {

		Coche c = new Coche(marca, "", 0, 0);
		
		assertEquals(marca, c.getMarca());
	}
	

	@Test
	void testGetModelo() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, coche.getModelo().equals("Corolla"));  // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Corolla", "Mustang", "Camaro", "Civic"})
	void testGetModeloParameterized(String modelo) {

		Coche c = new Coche("", modelo, 0, 0);
		
		assertEquals(modelo, c.getModelo());
	}
	
	@Test
	void testGetAnio() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(2022, coche.getAnio());  // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2022, 2021, 2023, 2022})
	void testGetAñoParameterized(int año) {

		Coche c = new Coche("", "", año, 0);	
		assertEquals(año, c.getAnio());
	}
	
	@Test
	void testGetPrecio() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		//assertTrue(coche.getPrecio() == 22000);  // Action // Assert
		assertEquals(22000, coche.getPrecio());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {22000, 45000, 52000, 25000})
	void testGetPrecioParameterized(int precio) {

		Coche c = new Coche("", "", 0, precio);	
		assertEquals(precio, c.getPrecio());
	}
	
	@Test
	void testSetModelo() {
		Coche coche = new Coche ();
		coche.setModelo("Corolla");
		assertEquals(true, coche.getModelo().equals("Corolla"));  // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Corolla", "Mustang", "Camaro", "Civic"})
	void testSetModeloParameterized(String modelo) {

		Coche c = new Coche();	
		c.setModelo(modelo);
		assertEquals(modelo, c.getModelo());
	}

	@Test
	void testSetAnio() {
		Coche coche = new Coche ();
		coche.setAnio(2000);
		assertEquals(2000 , coche.getAnio());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2022, 2021, 2023, 2022})
	void testSetAñoParameterized(int año) {

		Coche c = new Coche();	
		c.setAnio(año);
		assertEquals(año, c.getAnio());
	}

	@Test
	void testSetPrecio() {
		Coche coche = new Coche ();
		coche.setPrecio(24000);
		assertEquals(24000, coche.getPrecio());   // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(ints = {22000, 45000, 52000, 25000})
	void testSetPrecioParameterized(int precio) {

		Coche c = new Coche();	
		c.setPrecio(precio);
		assertEquals(precio, c.getPrecio());
	}
	
	@Test
	void testSetMarca() {
		Coche coche = new Coche ();
		coche.setMarca("Renault");
		assertEquals(true, coche.getMarca().equals("Renault"));  // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Toyota", "Ford", "Chevrolet", "Honda"})
	void testSetMarcaParameterized(String marca) {

		Coche c = new Coche();
		c.setMarca(marca);
		assertEquals(marca, c.getMarca());
	}
	
	@Test
	void testToString() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals("Coche [marca=Toyota, modelo=Corolla, anio=2022, precio=22000]" , coche.toString());
	
	}
	
	@ParameterizedTest
	@CsvFileSource(files = "test/org/hmis/coches.csv")
	void testToStringParameterized(String cochesCSV) {
		
		String[] cocheCadena = cochesCSV.split("; ");
		String[] coche = cocheCadena[0].split(", ");
		
		String marca = coche[0];
		String modelo = coche[1];
		int anio = Integer.parseInt(coche[2]);
		int precio = Integer.parseInt(coche[3]);
		
		String resultado = cocheCadena[1];
		
		Coche c = new Coche(marca, modelo, anio, precio);
		
		assertEquals(resultado, c.toString());
	}
	
}
