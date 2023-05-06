package org.hmis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
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
	@ValueSource(strings = {"Toyota", "Ford", "Mercedes", "Audi"})
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
	@ValueSource(strings = {"Corolla", "Fiesta", "Benz", "A1"})
	void testGetModeloParameterized(String modelo) {

		Coche c = new Coche("", modelo, 0, 0);
		
		assertEquals(modelo, c.getModelo());
	}
	
	@Test
	void testGetAño() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, coche.getAño() == 2022);  // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2022, 2010, 2015, 2018})
	void testGetAñoParameterized(int año) {

		Coche c = new Coche("", "", año, 0);	
		assertEquals(año, c.getAño());
	}
	
	@Test
	void testGetPrecio() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertTrue(coche.getPrecio() == 22000);  // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(ints = {22000, 10500, 14000, 34000})
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
	@ValueSource(strings = {"Corolla", "Fiesta", "Benz", "A1"})
	void testSetModeloParameterized(String modelo) {

		Coche c = new Coche();	
		c.setModelo(modelo);
		assertEquals(modelo, c.getModelo());
	}

	@Test
	void testSetAño() {
		Coche coche = new Coche ();
		coche.setAño(2000);
		assertTrue(coche.getAño()==2000);
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2022, 2010, 2015, 2018})
	void testSetAñoParameterized(int año) {

		Coche c = new Coche();	
		c.setAño(año);
		assertEquals(año, c.getAño());
	}

	@Test
	void testSetPrecio() {
		Coche coche = new Coche ();
		coche.setPrecio(24000);
		assertEquals(true, coche.getPrecio() == 24000);   // Action // Assert
	}
	
	@ParameterizedTest
	@ValueSource(ints = {22000, 10500, 14000, 34000})
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
	@ValueSource(strings = {"Toyota", "Ford", "Mercedes", "Audi"})
	void testSetMarcaParameterized(String marca) {

		Coche c = new Coche();
		c.setMarca(marca);
		assertEquals(marca, c.getMarca());
	}
	
	@Test
	void testToString() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals("Coche [marca=Toyota, modelo=Corolla, año=2022, precio=22000]" , coche.toString());
	
	}
	
	@ParameterizedTest
	@CsvSource({"Toyota, Corolla, 2022, 22000",
				"Mercedes, Benz, 2010, 20000",
				"Ford, Fiesta, 2021, 17000",
				"Audi, A1, 2015, 32000"})
	void testToStringParameterized(String marca, String modelo, int año, int precio) {

		String cadena = "Coche [marca=" + marca + ", modelo=" + modelo + ", año=" + año + ", precio=" + precio + "]";

		Coche c = new Coche(marca, modelo, año, precio);
		
		assertEquals(cadena, c.toString());
	}
	
}
