package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.edm.model.InvertirCadena;
@Component

public class ListadoCadenaPunto5 {
	private List<InvertirCadena> cadena = new ArrayList<>();

	public ListadoCadenaPunto5() {
		// TODO Auto-generated constructor stub
	}

	public List<InvertirCadena> getListado() {
		return cadena;
	}

	public void setListado(List<InvertirCadena> cadena) {
		this.cadena = cadena;
	}
}
