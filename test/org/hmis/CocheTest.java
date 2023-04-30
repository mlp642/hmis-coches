package org.hmis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
	
	@Test
	void testGetMarca() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, coche.getMarca().equals("Toyota"));  // Action // Assert
	}

	@Test
	void testSetMarca() {
		Coche coche = new Coche ();
		coche.setMarca("Renault");
		assertEquals(true, coche.getMarca().equals("Renault"));  // Action // Assert
	}

	@Test
	void testGetModelo() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, coche.getModelo().equals("Corolla"));  // Action // Assert
	}

	@Test
	void testSetModelo() {
		Coche coche = new Coche ();
		coche.setModelo("Corolla");
		assertEquals(true, coche.getModelo().equals("Corolla"));  // Action // Assert
	}
	
	@Test
	void testGetAño() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, coche.getAño() == 2022);  // Action // Assert
	}

	@Test
	void testSetAño() {
		Coche coche = new Coche ();
		coche.setAño(2000);
		assertTrue(coche.getAño()==2000);
		
	}
	
	@Test
	void testGetPrecio() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertTrue(coche.getPrecio() == 22000);  // Action // Assert
	}

	@Test
	void testSetPrecio() {
		Coche coche = new Coche ();
		coche.setPrecio(24000);
		assertEquals(true, coche.getPrecio() == 24000);   // Action // Assert
	}
	
	@Test
	void testToString() {
		Coche coche = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals("Coche [marca=Toyota, modelo=Corolla, año=2022, precio=22000]" , coche.toString());
	
	}
	
}
