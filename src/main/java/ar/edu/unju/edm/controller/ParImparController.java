package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.ParImpar;
import ar.edu.unju.edm.until.Arreglo;

@Controller
public class ParImparController {
	
	@GetMapping ("/mostrarParImpar")
	public String getArreglo(Model model) {
		//creacion de enteros
		
		ParImpar entero1 = new ParImpar(48);
		ParImpar entero2 = new ParImpar(50);
		ParImpar entero3 = new ParImpar(37);
		ParImpar entero4 = new ParImpar(102);
		ParImpar entero5 = new ParImpar(199);
		ParImpar entero6 = new ParImpar(1004);
		ParImpar entero7 = new ParImpar(2004);
		ParImpar entero8 = new ParImpar(2003);
		

		Arreglo numeros = new Arreglo(); 
		
		numeros.getEnteros().add(entero1);
		numeros.getEnteros().add(entero2);
		numeros.getEnteros().add(entero3);
		numeros.getEnteros().add(entero4);
		numeros.getEnteros().add(entero5);
		numeros.getEnteros().add(entero6);
		numeros.getEnteros().add(entero7);
		numeros.getEnteros().add(entero8);
		
		model.addAttribute("arreglo", numeros.getEnteros());
		return "punto4tp2";
	}
}
