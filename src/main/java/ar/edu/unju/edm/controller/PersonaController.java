package ar.edu.unju.edm.controller;

import java.time.LocalDate;
import java.time.Period;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.edm.model.Persona;

@Controller
public class PersonaController{
	
	@Autowired //inyeccion del objeto de la clase persona
	
	//variables
	Persona persona;
	
	@GetMapping("/calculoEdad")
	public ModelAndView getEdad(@RequestParam (name = "fecha") String fecha) {
		//Formato por defecto del localDate "Año-Dia-Mes"
		persona.setFecha(LocalDate.parse(fecha));
		
		//Comando para fecha actual del sistema
		LocalDate anioactual = LocalDate.now(); 
		
		//Calcular la Edad
		String nac = persona.getEdad();
		LocalDate localDate = LocalDate.parse(nac); //transformamos una variable String a LocalDate
		Period resultadoEdad = Period.between(anioactual, localDate); //para usar comando se necesitan dos fechas tipo LocalDate y resultado es tipo String
		
		//Mandar el resultado a la vista
		ModelAndView modelView = new ModelAndView("punto1tp2"); 
		modelView.addObject("resultado1", resultadoEdad);
		
		return modelView;
	}
	
}