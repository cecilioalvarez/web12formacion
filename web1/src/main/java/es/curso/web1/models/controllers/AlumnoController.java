package es.curso.web1.models.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {

	@GetMapping("/listaalumnos")
	public String listaAlumnos() {
		
		return "listaalumnos.xhtml";
		
	}
}
