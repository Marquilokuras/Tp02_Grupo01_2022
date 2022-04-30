package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.edm.model.Enteros;
import ar.edu.unju.edm.until.ListadoEnterosPunto6;

@Controller
public class EnterosController {
	
	@GetMapping ("/mostrarEnteros")
	public String GetListado(Model model) {
		//creacion de enteros
		Enteros entero1 = new Enteros(1);
		Enteros entero2 = new Enteros(2);
		Enteros entero3 = new Enteros(3);
		Enteros entero4 = new Enteros(4);
		Enteros entero5 = new Enteros(5);
		Enteros entero6 = new Enteros(6);
		Enteros entero7 = new Enteros(7);
		Enteros entero8 = new Enteros(8);
		Enteros entero9 = new Enteros(9);
		Enteros entero10 = new Enteros(10);
		
		//agregar enteros al listado
		ListadoEnterosPunto6 enteros = new ListadoEnterosPunto6(); 
		enteros.getListado().add(entero10);
		enteros.getListado().add(entero9);
		enteros.getListado().add(entero8);
		enteros.getListado().add(entero7);
		enteros.getListado().add(entero6);
		enteros.getListado().add(entero5);
		enteros.getListado().add(entero4);
		enteros.getListado().add(entero3);
		enteros.getListado().add(entero2);
		enteros.getListado().add(entero1);
		
		//enviar listado a la vista
		model.addAttribute("listadoEnterosPunto6", enteros.getListado());
		return "punto6tp3";
	}
}
	

