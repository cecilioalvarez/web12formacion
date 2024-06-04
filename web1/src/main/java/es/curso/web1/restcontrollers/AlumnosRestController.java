package es.curso.web1.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.curso.web1.models.Alumno;
import es.curso.web1.services.AlumnoExamenService;

@RestController
@RequestMapping("/webapi/alumnos")
public class AlumnosRestController {

	@Autowired
	private AlumnoExamenService alumnoExamenService;

	@GetMapping("/listaalumnos")
	public List<Alumno> buscarTodosAlumnos() {
		return alumnoExamenService.buscarTodosAlumnos();
	}
	
	
	
	
	
	
}
