package ar.edu.unju.edm.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Persona;

@Controller
public class PersonaController{
	
	@Autowired //inyeccion del objeto de la clase persona
	
	Persona persona;
	
	@GetMapping("/calculoEdad")
	public ModelAndView getEdad(@RequestParam (name = "fecha") String fecha) {
		//Formato por defecto del localDate "Año-Dia-Mes"
		persona.setFecha(LocalDate.parse(fecha));
		
		//Calcular la Edad
		String resultadoEdad = persona.getEdad();
		
		//Mandar el resultado a la vista
		ModelAndView modelView = new ModelAndView("punto1tp2"); 
		modelView.addObject("resultado1", resultadoEdad);
		
		return modelView;
	}
	
}