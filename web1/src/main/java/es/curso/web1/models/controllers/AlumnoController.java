package es.curso.web1.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.web1.models.Alumno;
import es.curso.web1.models.Examen;
import es.curso.web1.models.repositories.AlumnoRepository;
import es.curso.web1.models.repositories.ExamenRepository;

@Controller
public class AlumnoController {

	@Autowired
	AlumnoRepository alumnoRepository;
	
	@Autowired
	ExamenRepository examenRepository;
	
	//una url  que se encarga de esto
	// y nos redirige a listaalumnos.xhtml
	@GetMapping("/listaalumnos")
	public String listaAlumnos(Model modelo) {
		List<Alumno> lista=alumnoRepository.buscarTodos();
		
		//asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);
		
		return "listaalumnos.xhtml";
		
	}
	
	
	// redireccion
	@GetMapping("/formularioalumno")
	public String formularioAlumno() {
		
		return "formularioalumno.xhtml";
		
	}
	
	
	
	
	@GetMapping("/verexamenes")
	public String verExamenes(Model modelo, @RequestParam String nombre) {
		List<Examen> lista=examenRepository.buscarExamenPorNombreAlumno(nombre);
		
		//asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);
		
		return "verexamenes.xhtml";
		
	}
	@GetMapping("/verexamenestotal")
	public String verExamenesTotal(Model modelo) {
		List<Examen> lista=examenRepository.buscarExamenes();
		
		//asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);
		
		return "verexamenestotal.xhtml";
		
	}
}
