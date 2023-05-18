package ual.hmis.sesion05.ejercicio3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class Ejercicio3Test {
	
	
	@Test
	void testObjectNotNull() {

		Ejercicio3 ejercicio3 = new Ejercicio3();
		
		assertNotEquals(ejercicio3, null);
	}
	

	@ParameterizedTest
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio3/passwords.csv")
	void testEnmascarar(String passwordCSV) {

		Ejercicio3 ejercicio3 = new Ejercicio3();
		String[] passwordEnmascarada = passwordCSV.split(";");
		String password = passwordEnmascarada[0];
		String expected = passwordEnmascarada[1];
		
		assertEquals(expected, ejercicio3.enmascararPassword(password));
	}
	
	
}
