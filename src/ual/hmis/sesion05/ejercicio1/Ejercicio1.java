package ual.hmis.sesion05.ejercicio1;

public class Ejercicio1 {
	
	
	public int transformar (int numero) {
		int resultado = 0; 
		
		if (numero % 2 == 0) { // % Resto de una división entre enteros (mod)
		resultado = transformar (numero/2);
		}
		else if (numero % 3 == 0) {
		resultado = transformar (numero/3);
		}
		else if (numero % 5 == 0) {
		resultado = transformar (numero/5);
		}
		else return numero;
		return resultado;
	}
}
