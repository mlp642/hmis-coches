package ual.hmis.sesion05.ejercicio5;

import java.util.*;

public class Ejercicio5 {
	
	
	public <T extends Comparable<T>> Set<T> combinarConjuntosOrdenados (Set<T> a , Set<T> b) {
		
		
		// casos en el que alguna sea vacia o las dos
		
		if(a.isEmpty()) {
			if(b.isEmpty()) {
				return new TreeSet<T>();
			}
			else {
				return b;
			}
		}
		else if (b.isEmpty()) {
			return a;
		}
		
		Set<T> resultado = new TreeSet<T>(a);
	
        resultado.addAll(b);
        
      
        return resultado;
    }
		

}
