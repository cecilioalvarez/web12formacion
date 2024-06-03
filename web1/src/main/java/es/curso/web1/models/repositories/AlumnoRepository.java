package es.curso.web1.models.repositories;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Repository
public class AlumnoRepository {

	@PersistenceContext
	EntityManager em;
}
