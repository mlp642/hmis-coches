//package ual.hmis.sesion05.ejercicio5;
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.*;
//
//public class Ejercicio5Test {
//	
//	
//	@Test
//	void testObjectNotNull() {
//
//		Ejercicio5 ejercicio5 = new Ejercicio5();
//		
//		assertNotEquals(ejercicio5, null);
//	}
//	
//	@ParameterizedTest
//	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjuntosVacios.csv")
//	void testPrimerConjuntoVacio(String conjuntoCSV) {
//
//		Ejercicio5 ejercicio5 = new Ejercicio5();
//
//        Set<String> conjunto1 = new TreeSet<>();
//        Set<String> conjunto2 = new TreeSet<>();
//
//        for (String s : conjuntoCSV.split(", ")) {
//        	conjunto2.add(s);
//        }
//
//		assertArrayEquals(conjunto2.toArray(), ejercicio5.fusionarConjuntosOrdenados(conjunto1, conjunto2).toArray());
//	}
//	
//	@ParameterizedTest
//	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjuntosAlgunoVacio.csv")
//	void testSegundoConjuntoVacio(String conjuntoCSV) {
//
//		Ejercicio5 ejercicio5 = new Ejercicio5();
//
//        Set<String> conjunto1 = new TreeSet<>();
//        Set<String> conjunto2 = new TreeSet<>();
//        
//        for (String s : conjuntoCSV.split(", ")) {
//        	conjunto1.add(s);
//        }
//
//		assertArrayEquals(conjunto1.toArray(), ejercicio5.fusionarConjuntosOrdenados(conjunto1, conjunto2).toArray());
//	}
//	
//	@Test
//	void testConjuntosVacios() {
//
//		Ejercicio5 ejercicio5 = new Ejercicio5();
//
//        Set<Integer> conjunto1 = new TreeSet<>();
//        Set<Integer> conjunto2 = new TreeSet<>();
//        Set<Integer> conjuntoFusionado = new TreeSet<>();
//
//		assertArrayEquals(conjuntoFusionado.toArray(), ejercicio5.fusionarConjuntosOrdenados(conjunto1, conjunto2).toArray());
//	}
//	
//	Set<Integer> darFormatoConjuntoTipoInteger(String conjuntoCSV) {
//
//        Set<Integer> conjunto = new TreeSet<>();
//
//        for (String s : conjuntoCSV.split(", ")) {
//        	conjunto.add(Integer.parseInt(s));
//        }
//
//		return conjunto;
//	}
//
//	@ParameterizedTest
//	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjuntosInteger.csv")
//	void testFusionarConjuntosTipoInteger(String conjuntosCSV) {
//
//		Ejercicio5 ejercicio5 = new Ejercicio5();
//
//        String[] arrayConjuntosCSV = conjuntosCSV.split("; ");
//
//        Set<Integer> conjunto1 = darFormatoConjuntoTipoInteger(arrayConjuntosCSV[0]);
//        Set<Integer> conjunto2 = darFormatoConjuntoTipoInteger(arrayConjuntosCSV[1]);
//        Set<Integer> conjuntoFusionado = darFormatoConjuntoTipoInteger(arrayConjuntosCSV[2]);
//
//		assertArrayEquals(conjuntoFusionado.toArray(), ejercicio5.fusionarConjuntosOrdenados(conjunto1, conjunto2).toArray());
//	}
//	
//	Set<Double> darFormatoConjuntoTipoDouble(String conjuntoCSV) {
//
//        Set<Double> conjunto = new TreeSet<>();
//
//        for (String s : conjuntoCSV.split(", ")) {
//        	conjunto.add(Double.parseDouble(s));
//        }
//
//		return conjunto;
//	}
//
//	@ParameterizedTest
//	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjuntosDouble.csv")
//	void testFusionarConjuntosTipoDouble(String conjuntosCSV) {
//
//		Ejercicio5 ejercicio5 = new Ejercicio5();
//
//        String[] arrayConjuntosCSV = conjuntosCSV.split("; ");
//
//        Set<Double> conjunto1 = darFormatoConjuntoTipoDouble(arrayConjuntosCSV[0]);
//        Set<Double> conjunto2 = darFormatoConjuntoTipoDouble(arrayConjuntosCSV[1]);
//        Set<Double> conjuntoFusionado = darFormatoConjuntoTipoDouble(arrayConjuntosCSV[2]);
//
//		assertArrayEquals(conjuntoFusionado.toArray(), ejercicio5.fusionarConjuntosOrdenados(conjunto1, conjunto2).toArray());
//	}
//	
//	Set<String> darFormatoConjuntoTipoString(String conjuntoCSV) {
//
//        Set<String> conjunto = new TreeSet<>();
//
//        for (String s : conjuntoCSV.split(", ")) {
//        	conjunto.add(s);
//        }
//
//		return conjunto;
//	}
//
//	@ParameterizedTest
//	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio5/conjuntosString.csv")
//	void testFusionarConjuntosTipoString(String conjuntosCSV) {
//
//		Ejercicio5 ejercicio5 = new Ejercicio5();
//
//        String[] arrayConjuntosCSV = conjuntosCSV.split("; ");
//
//        Set<String> conjunto1 = darFormatoConjuntoTipoString(arrayConjuntosCSV[0]);
//        Set<String> conjunto2 = darFormatoConjuntoTipoString(arrayConjuntosCSV[1]);
//        Set<String> conjuntoFusionado = darFormatoConjuntoTipoString(arrayConjuntosCSV[2]);
//
//		assertArrayEquals(conjuntoFusionado.toArray(), ejercicio5.fusionarConjuntosOrdenados(conjunto1, conjunto2).toArray());
//	}
//	
//}
