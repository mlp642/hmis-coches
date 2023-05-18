package org.hmis;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class JsonReaderTest {

	@Test
	void testLeerCochesJSON() {
		String ruta = "data/coches.json";
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		assertEquals (4, coches.length);
	}
	
	@ParameterizedTest
	@CsvSource({"data/coches.json, 4",
				"data/coches1.json, 1",
				"data/coches2.json, 2",
				"data/coches3.json, 3"})
	void testLeerCochesJSONParameterized(String ruta, int numCoches) {

		Coche[] coches = JsonReader.leerCochesJSON(ruta);

		assertEquals(numCoches, coches.length);
	}


	@Test
	void testLeerCochesJSONprimero() {
		String ruta = "data/coches.json";
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche [] coches = JsonReader.leerCochesJSON(ruta);
		assertEquals(primero, coches[0]);
		assertTrue (primero.equals(coches[0]));
		assertTrue (coches[0].equals(primero));
	}
	
	@ParameterizedTest
	@CsvSource({"data/coches.json, Toyota, Corolla, 2022, 22000",
		"data/coches1.json, Ford, Mustang, 2021, 45000",
		"data/coches2.json, Chevrolet, Camaro, 2023, 52000",
		"data/coches3.json,  Honda, Civic, 2022, 25000"})
	
	void testLeerCochesJSONprimero(String ruta, String marca, String modelo, int anio, int precio) {

		Coche[] coches = JsonReader.leerCochesJSON(ruta);

		Coche primero = new Coche (marca, modelo, anio, precio);

		assertEquals(primero, coches[0]);
		assertTrue(primero.equals(coches[0]));
		assertTrue(coches[0].equals(primero));
	}
	
	@Test
	void testObjectNotNull() {

		JsonReader jsonReader = new JsonReader();

		assertNotEquals(jsonReader, null);
	}

	@Test
	void testExcepcionLeerCochesJSON() {

		String rutaIncorrecta = "data/cars.json";

		assertDoesNotThrow(() -> JsonReader.leerCochesJSON(rutaIncorrecta));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"data/cars.json", "data/autos.json", "data/automoviles.json"})
	void testExcepcionLeerCochesJSON(String rutaIncorrecta) {

		assertDoesNotThrow(() -> JsonReader.leerCochesJSON(rutaIncorrecta));
	}

}
