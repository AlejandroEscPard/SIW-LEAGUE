package it.uniroma3.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public abstract class Persona {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank
	@Column(nullable=false)
	private String nome;
	
	@NotBlank
	@Column(nullable=false)
	private String cognome;
	
	@Min(18)
	@Column(nullable=false)
	private int eta;
	
	@NotBlank
	@Column(nullable=false)
	private String nacionality;
	
	
	private int añosexperiencia;

	@OneToOne
	private Licencia licencia;
	
	@OneToOne
	private Equipo equipo;
	
	@OneToOne
	private Imagen imagen;
	
	
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getNacionality() {
		return nacionality;
	}

	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}

	public int getAnniexperienza() {
		return añosexperiencia;
	}

	public void setAnniexperienza(int anniexperienza) {
		this.añosexperiencia = anniexperienza;
	}
	
	
	
	
	
	
}
