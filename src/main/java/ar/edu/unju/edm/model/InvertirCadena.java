package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component

public class InvertirCadena {
	private String cadena;
	
	
	
	public InvertirCadena() {
		// TODO Auto-generated constructor stub
	}

	public InvertirCadena(String cadena) {
		super();
		this.cadena = cadena;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	
	//PUNTO 05 del TP3
	
	public String invertir( ) {
		String resultado="";
		char actual;
		
		for(int i=cadena.length()-1; i>=0; i--) {
			actual = cadena.charAt(i);
			resultado+=actual;
		}
		return resultado;
	}
	
}
