package ar.edu.unju.edm.until;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.edm.model.Alumno;

@Component
public class ListadoAlumno {
	private List<Alumno> listado = new ArrayList<>(); //List es una interfaz , implementacion de List es ArrayList
	
	public ListadoAlumno() {
		// TODO Auto-generated constructor stub
	}

	public List<Alumno> getListado() {
		return listado;
	}

	public void setListado(List<Alumno> listado) {
		this.listado = listado;
	}
	
	
}
