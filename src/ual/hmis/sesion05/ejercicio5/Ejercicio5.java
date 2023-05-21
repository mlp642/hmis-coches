package ual.hmis.sesion05.ejercicio5;

import java.util.*;

public class Ejercicio5 {
	
	
	public <T extends Comparable<T>> Set<T> combinarConjuntosOrdenados (Set<T> conjunto1 , Set<T> conjunto2) {
		
		
		// casos en el que alguna sea vacia o las dos
		
		if(conjunto1.isEmpty()) {
			if(conjunto2.isEmpty()) {
				return new TreeSet<T>();
			}
			else {
				return conjunto2;
			}
		}
		else if (conjunto2.isEmpty()) {
			return conjunto1;
		}
		
		Set<T> resultado = new TreeSet<T>(conjunto1);
	
        resultado.addAll(conjunto2);
        
      
        return resultado;
    }
		

}
