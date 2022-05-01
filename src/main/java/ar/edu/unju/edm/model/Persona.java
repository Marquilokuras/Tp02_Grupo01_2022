package ar.edu.unju.edm.model;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class Persona {

	private LocalDate fecha;
	
	public Persona() {
		// TODO Auto-generated constructor stubs
	}

	public Persona(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public String getEdad() {
		
		return "La edad es: " ;
	}
	
}
