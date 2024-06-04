package es.curso.web1.models.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import es.curso.web1.models.Alumno;
import es.curso.web1.models.Examen;
import es.curso.web1.models.repositories.AlumnoRepository;
import es.curso.web1.models.repositories.ExamenRepository;

@Service
public class AlumnoExamenService {

	private AlumnoRepository alumnoRepository;
	private ExamenRepository examenRepository;
	
	
	public List<Alumno> buscarTodos() {
		return alumnoRepository.buscarTodos();
	}
	public void insertar(Alumno alumno) {
		alumnoRepository.insertar(alumno);
	}
	public List<Examen> buscarExamenPorNombreAlumno(String nombre) {
		return examenRepository.buscarExamenPorNombreAlumno(nombre);
	}
	public List<Examen> buscarExamenes() {
		return examenRepository.buscarTodos();
	}
	
	
	
}
