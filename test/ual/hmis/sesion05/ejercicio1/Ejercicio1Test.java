package ual.hmis.sesion05.ejercicio1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class Ejercicio1Test {
	
	
	@Test
	void testObjectNotNull() {

		Ejercicio1 ejercicio1 = new Ejercicio1();
		
		assertNotEquals(ejercicio1, null);
	}
	
	@ParameterizedTest
	@CsvSource({"4, 1",
				"6, 1",
				"9, 1",
				"5, 1",
				"10, 1",
				"1, 1",
				"7, 7",
				"13, 13"})
		
	void testTransformar(int numero, int expected) {

		Ejercicio1 ejercicio1 = new Ejercicio1();
		
		assertEquals(expected, ejercicio1.transformar(numero));
	}
	
}
