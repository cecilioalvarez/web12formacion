package es.curso.web1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.curso.web1.models.Alumno;
import es.curso.web1.models.Examen;
import es.curso.web1.repositories.AlumnoRepository;
import es.curso.web1.repositories.ExamenRepository;

@Service
public class AlumnoExamenService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	@Autowired
	private ExamenRepository examenRepository;
	
	
	public List<Alumno> buscarTodosAlumnos() {
		return alumnoRepository.buscarTodos();
	}
	public void insertar(Alumno alumno) {
		alumnoRepository.insertar(alumno);
	}
	public List<Examen> buscarExamenPorNombreAlumno(String nombre) {
		return examenRepository.buscarExamenPorNombreAlumno(nombre);
	}
	public List<Examen> buscarTodosExamenes() {
		return examenRepository.buscarTodos();
	}
	public void insertar(Examen examen) {
		examenRepository.insertar(examen);
	}
	
	
	
}
