package es.curso.web1.restcontrollers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.curso.web1.dto.AlumnoDto;
import es.curso.web1.mapper.AlumnoMapper;
import es.curso.web1.models.Alumno;
import es.curso.web1.services.AlumnoExamenService;

@RestController
@RequestMapping("/webapi/alumnos")
public class AlumnosRestController {

	@Autowired
	private AlumnoExamenService alumnoExamenService;

	@GetMapping
	public List<AlumnoDto> buscarTodosAlumnos() {
		
		List<AlumnoDto> listaDto= new ArrayList<AlumnoDto>();
		for (Alumno alumno:alumnoExamenService.buscarTodosAlumnos()) {
			
			listaDto.add(AlumnoMapper.toDto(alumno));
		}
		
		return listaDto;
	}
	//pedir la url con post usando json
	@PostMapping
	public void insertar(@RequestBody Alumno alumno){
		 alumnoExamenService.insertar(alumno);
	}
	
	
	
	
	
	
}
