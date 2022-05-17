package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.edm.model.ParImpar;
@Component
public class Arreglo {
	private List<ParImpar> numeros = new ArrayList<>();
	public Arreglo() {
		// TODO Auto-generated constructor stub
	}
	public List<ParImpar> getNumeros() {
		return numeros;
	}
	public void setNumeros(List<ParImpar> numeros) {
		this.numeros = numeros;
	}
	public Arreglo(List<ParImpar> numeros) {
		super();
		this.numeros = numeros;
}
	
}
