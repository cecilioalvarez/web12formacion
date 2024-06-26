package es.curso.web1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.curso.web1.models.Alumno;
import es.curso.web1.models.Examen;
import es.curso.web1.repositories.AlumnoRepository;
import es.curso.web1.repositories.ExamenRepository;
import es.curso.web1.services.AlumnoExamenService;

@Controller
public class AlumnoController {

	@Autowired
	AlumnoExamenService alumnoExamenesService;


	// una url que se encarga de esto
	// y nos redirige a listaalumnos.xhtml
	@GetMapping("/listaalumnos")
	public String listaAlumnos(Model modelo) {
		List<Alumno> lista = alumnoExamenesService.buscarTodosAlumnos();

		// asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);

		return "listaalumnos.xhtml";

	}

	// redireccion
	@GetMapping("/formularioalumno")
	public String formularioAlumno() {

		return "formularioalumno.xhtml";

	}
	// model attribute mapea el formulario con sus datos
	// aun objeto

	@PostMapping("/insertaralumno")
	public String formularioAlumno(@ModelAttribute Alumno alumno, Model modelo) {

		alumnoExamenesService.insertar(alumno);

		List<Alumno> lista = alumnoExamenesService.buscarTodosAlumnos();

		// asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);
		return "listaalumnos.xhtml";

	}

	@GetMapping("/verexamenes")
	public String verExamenes(Model modelo, @RequestParam String nombre) {
		List<Examen> lista = alumnoExamenesService.buscarExamenPorNombreAlumno(nombre);

		// asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);

		return "verexamenes.xhtml";

	}

	@GetMapping("/verexamenestotal")
	public String verExamenesTotal(Model modelo) {
		List<Examen> lista = alumnoExamenesService.buscarTodosExamenes();

		// asigna a la plantilla una nombre de lista junto con los datos
		modelo.addAttribute("lista", lista);

		return "verexamenestotal.xhtml";

	}
}
