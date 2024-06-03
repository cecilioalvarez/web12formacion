package es.curso.web1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Examen {
	@Id
	@GeneratedValue
	private int id;
	private String texto;
	private double nota;
	private String asignatura;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="alumno_nombre")
	private Alumno alumno;
	
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public Examen(int id, String texto, double nota, String asignatura) {
		super();
		this.id = id;
		this.texto = texto;
		this.nota = nota;
		this.asignatura = asignatura;
	}
	public Examen() {
		super();
	}
	public Examen(int id) {
		super();
		this.id = id;
	}
	
	
	
}
