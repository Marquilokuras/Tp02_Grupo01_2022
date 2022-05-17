package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;

@Component
public class Persona {
	private LocalDate fecha;
	 public Persona() {
		// TODO Auto-generated constructor stub
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
		   String edad2;
		    Period edad = Period.between(this.fecha, LocalDate.now());
		    edad2=String.format("%d años, %d meses y %d dias",
		    edad.getYears(),
		    edad.getMonths(),
		    edad.getDays());
		    return edad2;
		   
	   }
	   
	   public String getSigno(){
		    String signo="",dia,mes;
		    int dia1;
		    LocalDate edad = this.fecha;
		    dia=String.valueOf(edad.getDayOfMonth());
		    dia1=Integer.parseInt(dia);
		    mes=String.valueOf(edad.getMonth());
		    switch(mes){
		      case "JANUARY":
		        if(dia1<=20){
		          signo="Capricornio";
		        }else{
		          signo="Acuario";
		        }
		      break;
		      case "FEBRUARY":
		        if(dia1<=19){
		        signo="Acuario";
		        }else{
		        signo="Picis";
		        }
		      break;
		      case "MARCH":
		        if(dia1<=20){
		          signo="Picis";
		        }else{
		          signo="Aries";
		        }
		      break;
		      case "APRIL":
		        if(dia1<=20){
		          signo="Aries";
		        }else{
		          signo="Tauro";
		        }
		      break;
		      case "MAY":
		        if(dia1<=20){
		          signo="Tauro";
		        }else{
		          signo="Geminis";
		        }
		      break;
		      case "JUNE":
		        if(dia1<=21){
		          signo="Geminis";
		        }else{
		          signo="Cancer";
		        }
		      break;
		      case "JULY":
		      if(dia1<=21){
		        signo="Cancer";
		      }else{
		        signo="Leo";
		      }
		      break;
		      case "AUGUST":
		        if(dia1<=23){
		          signo="Leo";
		        }else{
		          signo="Virgo";
		        }
		      break;
		      case "SEPTEMBER":
		        if(dia1<=23){
		          signo="Virgo";
		        }else{
		          signo="Libra";
		        }
		      break;
		      case "OCTOBER":
		        if(dia1<=22){
		          signo="Libra";
		        }else{
		          signo="Escorpio";
		        }
		      break;
		      case "NOVEMBER":
		        if(dia1<=22){
		          signo="Escorpio";
		        }else{
		          signo="Sagitario";
		        }
		      break;
		      case "DECEMBER":
		        if(dia1<=21){
		          signo="Sagitario";
		        }else{
		          signo="Capricornio";
		        }
		      break;
		    }
		    return signo;
		  }
		  public String getEstacion(){
		    String estacion="",dia,mes;
		    int dia1;
		    LocalDate edad = this.fecha;
		    dia=String.valueOf(edad.getDayOfMonth());
		    dia1=Integer.parseInt(dia);
		    mes=String.valueOf(edad.getMonth());
		    switch(mes){
		      case "JANUARY":
		        estacion="Verano";
		      break;
		      case "FEBRUARY":
		        estacion="Verano";
		      break;
		      case "MARCH":
		        if(dia1>=21){
		          estacion="Otoño";
		        }else{
		          estacion="Verano";
		        }
		      break;
		      case "APRIL":
		        estacion="Otoño";
		      break;
		      case "MAY":
		       estacion="OtoÃ±o";
		      break;
		      case "JUNE":
		        if(dia1>=21){
		          estacion="Invierno";
		        }else{
		          estacion="Otoño";
		        }
		      break;
		      case "JULY":
		        estacion="Invierno";
		      break;
		      case "AUGUST":
		        estacion="Invierno";
		      break;
		      case "SEPTEMBER":
		        if(dia1>=21){
		          estacion="Primavera";
		        }else{
		          estacion="Invierno";
		        }
		      break;
		      case "OCTOBER":
		       estacion="Primavera";
		      break;
		      case "NOVEMBER":
		       estacion="Primavera";
		      break;
		      case "DECEMBER":
		        if(dia1>=21){
		          estacion="Verano";
		        }else{
		          estacion="Primavera";
		        }
		      break;
		    }
		    return estacion;
		  }
	  
		   
		   
	
}
