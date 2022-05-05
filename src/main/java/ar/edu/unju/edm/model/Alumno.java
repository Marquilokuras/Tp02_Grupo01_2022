package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Alumno {
	private int dni;
	private int tel;
	private String nombre;
	private String apellido;
	private LocalDate fechanac;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(int dni, int tel, String nombre, String apellido, LocalDate fechanac) {
		super();
		this.dni = dni;
		this.tel = tel;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanac = fechanac;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechanac() {
		return fechanac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}
	
	public String getEdad() {
		String anio;
	    Period edad = Period.between(fechanac, LocalDate.now());
	    anio = " " + edad.getYears();
		return anio;
	}
}
