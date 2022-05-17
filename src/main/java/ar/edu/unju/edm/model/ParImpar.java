package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class ParImpar {
	//variables locales
		private int numeros;
		private String rest;
		public ParImpar() {
			// TODO Auto-generated constructor stub
		}
		public String getNumeros() {
			if(numeros%2==0){
				  rest= "Es par";
			     }else{
			      rest="Es impar";
			      }
			return rest;
		}
		
		public void setNumeros(int numeros) {
			this.numeros = numeros;
		}
		public ParImpar(int numeros) {
			super();
			this.numeros = numeros;
		}
		
		
}
