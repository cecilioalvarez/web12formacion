package es.curso.web1.services.bussinesdelegate.dto;

public class ExamenDtoWeb2 {

	private int id;
	private String texto;
	private String asignatura;
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
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public ExamenDtoWeb2(int id, String texto, String asignatura) {
		super();
		this.id = id;
		this.texto = texto;
		this.asignatura = asignatura;
	}
	public ExamenDtoWeb2() {
		super();
	}
	
}
