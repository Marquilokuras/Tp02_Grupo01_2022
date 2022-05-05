package ar.edu.unju.edm.controller;

import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.edm.model.Alumno;
import ar.edu.unju.edm.until.ListadoAlumno;

@Controller
public class AlumnoController {
	
	@GetMapping ("/mostrarAlumnos")
	public String GetListado(Model model) {
		
		//creacion de alumno
		Alumno alumno1 = new Alumno(45085907,388596802,"Marcos","Quinteros",LocalDate.now());
		Alumno alumno2 = new Alumno(40876548,385765803,"Lucas","Quinteros",LocalDate.of(2003,12,27));
		Alumno alumno3 = new Alumno(45034909,382836804,"Lionel","Messi",LocalDate.parse("2003-12-27"));
		Alumno alumno4 = new Alumno(43081240,380974805,"Santiago","Colque",LocalDate.of(2003,7,23));
	
		//agregar alumnos al listado
		ListadoAlumno nombre = new ListadoAlumno(); 
		nombre.getListado().add(alumno1);
		nombre.getListado().add(alumno2);
		nombre.getListado().add(alumno3);
		nombre.getListado().add(alumno4);
		
		//enviar listado a la vista
		model.addAttribute("listadoAlumno", nombre.getListado());
		return "punto7tp02";
	}
	
}
