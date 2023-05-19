package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {
	
	public boolean login (String username, String password){
		
		// comprobar que sean distintos de vacio
		
		if(username.isEmpty() || password.isEmpty()) return false;
		
		// comprobar que la longitud sea < 30
		
		if(username.length() >=30 || password.length() >= 30) return false;
		
		// comprobar que contiene al menos una mayuscula , una minuscula y un digito
		
		boolean contieneMayus = false;
		boolean contieneMinus = false;
		boolean contieneDigito = false;
		
		for (char c : password.toCharArray()) {
			
			if(Character.isUpperCase(c)) contieneMayus = true;
			if(Character.isLowerCase(c)) contieneMinus = true;
			if(Character.isDigit(c)) contieneDigito = true;
		}
		
		if (!contieneMayus || !contieneMinus || !contieneDigito) return false;
		
		// llamar al método de la bbdd
		
		return compruebaLoginEnBD(username, password);
	}
	
	public boolean compruebaLoginEnBD (String username, String password){
		
		// método mock (simulado)
		
		if (username.equals("user") && password.equals("Password1")) return true; 
		else return false;
	}

}
