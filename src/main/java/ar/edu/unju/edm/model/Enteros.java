package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Enteros {
	
	//variables locales
	private int numero1;
	
	public Enteros() {
		// TODO Auto-generated constructor stub
	}

	public Enteros(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

}