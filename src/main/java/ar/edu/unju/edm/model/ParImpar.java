package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class ParImpar {

	//variables locales
	private int enteros;
	private String rest;
	public ParImpar() {
		// TODO Auto-generated constructor stub
	}
	public String getEnteros() {
		if(enteros%2==0){
			  rest= "Es par";
		     }else{
		      rest="Es impar";
		      }
		return rest;
	}
	public void setEnteros(int enteros) {
		this.enteros = enteros;
	}
	public ParImpar(int enteros) {
		this.enteros = enteros;
	}

}

	