package es.curso.web1.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.curso.web1.models.Examen;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class ExamenRepository {

	@PersistenceContext
	EntityManager em;

	public List<Examen> buscarExamenPorNombreAlumno(String nombre) {

		TypedQuery<Examen> consulta = em.createQuery("select e from Examen e where e.alumno.nombre=:nombre",
				Examen.class);
		consulta.setParameter("nombre", nombre);
		return consulta.getResultList();

	}
	
	public List<Examen> buscarTodos() {

		TypedQuery<Examen> consulta = em.createQuery("select e from Examen e",
				Examen.class);
		
		return consulta.getResultList();

	}
	@Transactional
	public void insertar(Examen examen) {
		
		em.persist(examen);
	}
}
