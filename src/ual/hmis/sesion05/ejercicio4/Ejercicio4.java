package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {
	
	
	public static double [] [] obtenerDiagonales(double [][] matriz){
		
		double [][] result = new double [2][matriz.length];
		int n = matriz.length;
		
		//if(n != matriz[0].length) return matriz; //no es cuadrada
		
		for (int i = 0; i < n; i++) {
	    	result[0][i] = matriz[i][i];          // Diagonal principal
	    	result[1][i] = matriz[i][n - 1 - i];  // Diagonal secundaria
	    }
			
		
		return result;
	}

	public static double [] sumarColumnas(double [][] matriz) {
		
		int n = matriz.length;
		int m = matriz[0].length;
		double [] result = new double [m];
		double suma = 0;
		
		for(int i = 0 ; i < n ; i++) {
			
			suma = 0;
			
			for(int j = 0; j < m ; j++) {
				suma += matriz[j][i];
			}
			
			result[i] = suma;
		}

		return result;

	}

}
