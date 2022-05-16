package ar.edu.unju.edm.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class Punto03tp2 {

	private String nombre,apellido;
	private long libreta; 
	//private ArrayList<Integer> notas = new ArrayList<>();
	private double[] notas = new double[5];
	public Punto03tp2() {
		// TODO Auto-generated constructor stub
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
	public long getLibreta() {
		return libreta;
	}
	public void setLibreta(long libreta) {
		this.libreta = libreta;
	}
	
	
	
	
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public double calcularPromedio() {
		double totalnotas=0;
		double promedio=0;
		
		
		double[] notas = {8.5,9.5,10.0,6.75,7.0};
		
		for(double i:notas) {
			totalnotas=totalnotas+i;
		}
		
		promedio = totalnotas/5;
		return promedio;
	}
	
	public double obtenerNotaMaxima() {
		double notamaxima=0.0;

		double[] notas = {8.5,9.5,10.0,6.75,7.0};
		
		for(double i:notas) {
			if(i>notamaxima) {
				notamaxima=i;
			}
		}
		return notamaxima;
	}
	public Punto03tp2(String nombre, String apellido, long libreta, double[] notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libreta = libreta;
		this.notas = notas;
	}
	
	/*public ArrayList<Integer> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}
	
	public double calcularPromedio() {
		double totalnotas=0;
		double promedio=0;
		
		notas.add(8);
		notas.add(8);
		notas.add(8);
		notas.add(6);
		notas.add(6);
		
		for(int i:notas) {
			totalnotas=totalnotas+i;
		}
		
		promedio = totalnotas/5;
		return promedio;
	}
	public int obtenerNotaMaxima() {
		int notamaxima=0;
		for(int i:notas) {
			if(i>notamaxima) {
				notamaxima=i;
			}
		}
		return notamaxima;
	}
	public punto03tp2(String nombre, String apellido, long libreta, ArrayList<Integer> notas) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.libreta = libreta;
		//this.notas = notas;
	}*/
	
	
	
	
	
	
}

