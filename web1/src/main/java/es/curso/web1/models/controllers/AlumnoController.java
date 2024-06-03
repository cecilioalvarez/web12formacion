package es.curso.web1.models.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import es.curso.web1.models.Alumno;
import es.curso.web1.models.repositories.AlumnoRepository;

@Controller
public class AlumnoController {

	@Autowired
	AlumnoRepository alumnoRepository;
	
	//una url  que se encarga de esto
	// y nos redirige a listaalumnos.xhtml
	@GetMapping("/listaalumnos")
	public String listaAlumnos(Model modelo) {
		List<Alumno> lista=alumnoRepository.buscarTodos();
		
		//asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);
		
		return "listaalumnos.xhtml";
		
	}
}
