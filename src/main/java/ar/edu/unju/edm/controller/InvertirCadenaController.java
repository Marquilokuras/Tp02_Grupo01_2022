package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.InvertirCadena;

@Controller

public class InvertirCadenaController {
	@Autowired
	InvertirCadena unaCadena;
	
	@GetMapping("/punto5tp03")
	
	public String getInvertirCadenaPage(Model model) {
		
		unaCadena.setCadena("HOLA MUNDO, SOY AGUS");
		
		model.addAttribute("punto5tp03",unaCadena.invertir());
		
		return "punto5tp03";
		
	}
	
	/*@GetMapping("/mostrarInvertirCadena")
	
	public String GetListado(Model model) {
		//creacion de la cadena
		InvertirCadena unaCadena = new InvertirCadena("HolaMundo");
		
		
		
		
		//agregar cadena al listado
		ListadoCadenaPunto5 cadena = new ListadoCadenaPunto5(); 
		cadena.getListado().add(unaCadena);
		
		
		//enviar cadena invertida a la vista
		model.addAttribute("listadoAlumno", unaCadena.invertir() );
		return "punto05tp3";
	}*/

}
