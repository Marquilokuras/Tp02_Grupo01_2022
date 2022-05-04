package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Enteros {
	
	//variables locales
	private int enteros;
	
	public Enteros() {
		// TODO Auto-generated constructor stub
	}

	public Enteros(int enteros) {
		this.enteros = enteros;
	}

	public int getEnteros() {
		return enteros;
	}

	public void setEnteros(int enteros) {
		this.enteros = enteros;
	}
	
}