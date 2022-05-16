package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.edm.model.ParImpar;
@Component
public class Arreglo {
	private List<ParImpar> enteros = new ArrayList<>();
	public Arreglo() {
		// TODO Auto-generated constructor stub
	}
	public List<ParImpar> getEnteros() {
		return enteros;
	}
	public void setEnteros(List<ParImpar> enteros) {
		this.enteros = enteros;
	}
	public Arreglo(List<ParImpar> enteros) {
		super();
		this.enteros = enteros;
}
	
}
