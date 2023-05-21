package ual.hmis.sesion05.ejercicio5;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import java.util.*;

public class Ejercicio5Test {
	
	
	@Test
	void testObjectNotNull() {

		Ejercicio5 ejercicio5 = new Ejercicio5();
		
		assertNotEquals(ejercicio5, null);
	}
	
	
	@ParameterizedTest
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjuntos.csv", delimiter = ';')
	void testCombinarConjuntos(String conjuntoCSV) {

		Ejercicio5 ejercicio5 = new Ejercicio5();
		String [] conjuntos = conjuntoCSV.split(", ");
		Set<Integer> setA = convertirConjunto(conjuntos[0]);
        Set<Integer> setB = convertirConjunto(conjuntos[1]);
        Set<Integer> setEsperado = convertirConjunto(conjuntos[2]);

        Set<Integer> resultado = ejercicio5.combinarConjuntosOrdenados(setA, setB);

        assertEquals(setEsperado, resultado);
	}

		private Set<Integer> convertirConjunto(String conjunto) {
	        Set<Integer> lista = new TreeSet<>();
	        if (!conjunto.isEmpty()) {
	            String[] elementos = conjunto.split(",");
	            for (String elemento : elementos) {
	                lista.add(Integer.parseInt(elemento));
	            }
	        }
	        return lista;
	    }

	
}
