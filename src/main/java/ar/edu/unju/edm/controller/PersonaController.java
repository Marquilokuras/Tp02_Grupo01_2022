package ar.edu.unju.edm.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Persona;

@Controller
public class PersonaController {
	@Autowired Persona persona;
	@GetMapping("/calculoEdad")
	public ModelAndView getEdad (@RequestParam (name= "fecha") String fecha) {
	
		persona.setFecha(LocalDate.parse(fecha));
		
		//calcular la edad
		String resultadoEdad=persona.getEdad();
		String resultadoSigno=persona.getSigno();
		String resultadoEstacion= persona.getEstacion();
		
		
		//mandar el resultado a la vista
		ModelAndView modelView = new ModelAndView("punto1tp2");
		
		modelView.addObject("resultado1",resultadoEdad);
		modelView.addObject("resultado2",resultadoSigno);
		modelView.addObject("resultado3",resultadoEstacion);
		return modelView;
	}


		
		

}
