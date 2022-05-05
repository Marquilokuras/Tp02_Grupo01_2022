package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.Period;

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
	
	public String CalcularEdad() {
		
		String anio;
	    Period edad = Period.between(this.fecha, LocalDate.now());
	    anio=String.format("%d años, %d meses y %d días",
	    edad.getYears(),
	    edad.getMonths(),
	    edad.getDays());
	    
		return anio;
	}
	
}
