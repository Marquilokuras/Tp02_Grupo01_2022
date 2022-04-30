package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import ar.edu.unju.edm.model.Enteros;

@Component
public class ListadoEnterosPunto6 {
	private List<Enteros> enteros = new ArrayList<>(); //List es una interfaz , implementacion de List es ArrayList
	
	public ListadoEnterosPunto6() {
		// TODO Auto-generated constructor stub
	}

	public List<Enteros> getListado() {
		return enteros;
	}

	public void setListado(List<Enteros> enteros) {
		this.enteros = enteros;
	}	
}
