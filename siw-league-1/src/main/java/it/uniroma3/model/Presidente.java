package it.uniroma3.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
@Entity
public class Presidente extends Persona{
	@Column(nullable=false)
	private LocalDate fechaInicio;
	
	@Column(nullable=false)
	private LocalDate fechaFin;

	

	public Presidente(LocalDate fechaInicio, LocalDate fechaFin) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public Presidente() {
		// TODO Auto-generated constructor stub
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
	
}
