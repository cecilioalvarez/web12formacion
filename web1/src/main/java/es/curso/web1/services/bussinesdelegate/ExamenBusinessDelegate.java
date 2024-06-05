package es.curso.web1.services.bussinesdelegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import es.curso.web1.dto.AlumnoDto;
import es.curso.web1.dto.ExamenDto;
import es.curso.web1.models.Alumno;
import es.curso.web1.services.bussinesdelegate.dto.ExamenDtoWeb2;

@Service
public class ExamenBusinessDelegate {

	@Autowired
	RestTemplate plantilla;
	@Value("${servidor.examenes}")
	private String servidorExamenes;
	
	public void insertar(ExamenDtoWeb2 examenDtoWeb2) {

		plantilla.postForEntity(servidorExamenes + "/webapi/examenes", examenDtoWeb2, ExamenDto.class);

	}
	
	
}
