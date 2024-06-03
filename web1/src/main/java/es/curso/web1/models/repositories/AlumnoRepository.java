package es.curso.web1.models.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import es.curso.web1.models.Alumno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
@Repository
public class AlumnoRepository {

	@PersistenceContext
	EntityManager em;
	
	public List<Alumno> buscarTodos() {
		//java persistence query language
		TypedQuery<Alumno> consulta= em.createQuery("select a from Alumno a"
				,Alumno.class);
		return consulta.getResultList();
	}
}
