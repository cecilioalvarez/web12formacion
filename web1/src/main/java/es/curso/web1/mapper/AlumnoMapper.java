package es.curso.web1.mapper;

import es.curso.web1.dto.AlumnoDto;
import es.curso.web1.models.Alumno;

public class AlumnoMapper {

	
	public static AlumnoDto toDto(Alumno alumno) {
		return new AlumnoDto(alumno.getNombre(),alumno.getEdad());
	}
	public static Alumno toBo(AlumnoDto alumnoDto) {
		return new Alumno(alumnoDto.getNombre(),alumnoDto.getEdad());
	}
}
