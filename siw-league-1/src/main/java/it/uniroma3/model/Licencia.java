package it.uniroma3.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Licencia {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable=false)
	private int numeroLicencia;
	
	@Column(nullable=false)
	private String tipo;
	
	@Column(nullable=false)
	private LocalDate fechaExpedicion;
	
	@Column(nullable=false)
	private LocalDate fechaVencimiento;
	
	
	@Column(nullable=false)
	@OneToOne
	private Persona persona;

	@OneToOne
	private Imagen imagen;



	public Licencia( int numeroLicencia, String tipo, LocalDate fechaExpedicion, LocalDate fechaVencimiento,
			Persona persona) {
		super();
		this.numeroLicencia = numeroLicencia;
		this.tipo = tipo;
		this.fechaExpedicion = fechaExpedicion;
		this.fechaVencimiento = fechaVencimiento;
		this.persona = persona;
	}

	public int getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(int numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(LocalDate fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}
