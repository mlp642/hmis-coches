package ual.hmis.sesion05.ejercicio4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvFileSource;

public class Ejercicio4Test {
	
	
	@Test
	void testObjectNotNull() {

		Ejercicio4 ejercicio4 = new Ejercicio4();
		
		assertNotEquals(ejercicio4, null);
	}
	

	double [] [] datosMatriz (String matricesCSV , boolean diagonales) {
		
		String [] elementos = matricesCSV.split(",");
		
		// si queremos la matriz de diagonales, la matriz tendra dos filas y si queremos la matriz entera
		// el numero tanto de filas como de columnas sera la raiz cuadrada del numero de elementos de la matriz
		// guardada en el archivo
		int n = diagonales? 2  :  (int) Math.sqrt(elementos.length)  ; 
		
		// si queremos la matriz de diagonales, las columnas seran el numero de elementos de la matriz de diagonales 
		// guardada en el archivo y si queremos la matriz original las columnas son la raiz cuadrada del numero de elementos
		// de la matriz original guardada en el archivo
		int m = diagonales? elementos.length/2  : (int) Math.sqrt(elementos.length);
		
		double [][] matriz = new double[n][m];
		
		int index = 0;
		
		  for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                matriz[i][j] = Double.parseDouble(elementos[index++]);
	            }
	        }
	        
	      return matriz;
	}
	
	@ParameterizedTest
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio4/matrices.csv")
	void testObtenerDiagonales(String matricesCSV) {

		String[] matrizArchivo = matricesCSV.split(";");

		double[][] matriz = datosMatriz(matrizArchivo[0], false);
		double[][] diagonales = datosMatriz(matrizArchivo[1], true);

		assertArrayEquals(diagonales, Ejercicio4.obtenerDiagonales(matriz));
	}
	
	@ParameterizedTest
	@CsvFileSource(files = "test/ual/hmis/sesion05/ejercicio4/matrices.csv")
	void testSumarColumnas(String matricesCSV) {

		String[] matrizArchivo = matricesCSV.split("; ");

		double[][] matriz = datosMatriz(matrizArchivo[0], false);
		
		// obtenemos del archivo el array de elementos que contiene la suma de cada columna
        String[] elementos = matrizArchivo[2].split(", ");
        
		double[] resultado = new double[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
			resultado[i] = Double.parseDouble(elementos[i]);
		}

		assertArrayEquals(resultado, Ejercicio4.sumarColumnas(matriz));
	}
	
	
	
}
