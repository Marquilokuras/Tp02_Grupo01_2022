package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Punto03tp2;
@Controller
public class Punto03tp2Controller {
	@GetMapping("/punto03")
	public String getPunto03page(Model model) {
		Punto03tp2 punto3 = new Punto03tp2();
		punto3.setNombre("Emilio");
		punto3.setApellido("Soruco");
		punto3.setLibreta(1000);	
		
		model.addAttribute("Nombre",punto3.getNombre());
		model.addAttribute("Apellido",punto3.getApellido());
		model.addAttribute("Libreta",punto3.getLibreta());
		model.addAttribute("Promedio",punto3.calcularPromedio());
		model.addAttribute("NotaMaxima",punto3.obtenerNotaMaxima());
		
		return "Punto03tp2";
	}
}
