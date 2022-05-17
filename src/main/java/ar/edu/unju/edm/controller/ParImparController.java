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
		
		ParImpar numero1 = new ParImpar(475);
		ParImpar numero2 = new ParImpar(3254);
		ParImpar numero3 = new ParImpar(65);
		ParImpar numero4 = new ParImpar(13);
		ParImpar numero5 = new ParImpar(17);
		ParImpar numero6 = new ParImpar(1004);
		ParImpar numero7 = new ParImpar(24);
		ParImpar numero8 = new ParImpar(2003);
		

		Arreglo numeros = new Arreglo(); 
		
		numeros.getNumeros().add(numero1);
		numeros.getNumeros().add(numero2);
		numeros.getNumeros().add(numero3);
		numeros.getNumeros().add(numero4);
		numeros.getNumeros().add(numero5);
		numeros.getNumeros().add(numero6);
		numeros.getNumeros().add(numero7);
		numeros.getNumeros().add(numero8);
		
		model.addAttribute("arreglo", numeros.getNumeros());
		return "punto4tp2";
	}
}
