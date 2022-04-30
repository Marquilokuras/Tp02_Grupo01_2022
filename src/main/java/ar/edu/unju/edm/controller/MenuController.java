package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
	
	@GetMapping({"/menu","/index","/"})
	public String obtenerMenu() {
		return ("menu");
	}
	
}
