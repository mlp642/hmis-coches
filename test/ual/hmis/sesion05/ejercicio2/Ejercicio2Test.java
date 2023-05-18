package ual.hmis.sesion05.ejercicio2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class Ejercicio2Test {
	
	
	@Test
	void testObjectNotNull() {

		Ejercicio2 ejercicio2 = new Ejercicio2();
		
		assertNotEquals(ejercicio2, null);
	}
	
	@ParameterizedTest
	@CsvSource({"'','' ,false",
		"user,'',false",
		"'', pass,false",
		"123456789101112131415161718192, pass,false",
		"1234567891011121314151617181920, pass,false",
		"user, 123456789101112131415161718192,false",
		"user, 1234567891011121314151617181920,false",
		"user, password1,false",
		"user, PASSWORD1,false",
		"user, Password,false",
		"user, Password1, true",
		"user, wrongPassword1,false",
		"wrongUser, Password1,false",
		"wrongUser, wrongPassword1,false"})

	void testLogin(String user, String password, boolean expected) {

		Ejercicio2 ejercicio2 = new Ejercicio2();
		assertEquals(expected,ejercicio2.login(user, password));
	}
	
}
