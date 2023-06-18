package it.uniroma3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Tecnico extends Persona{
	
	@NotBlank
	@Column(nullable=false)
	private String funcion;

	
	

	public Tecnico(@NotBlank String funcion) {
		super();
		this.funcion = funcion;
	}

	public Tecnico() {
		// TODO Auto-generated constructor stub
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}
	
	
	
}
