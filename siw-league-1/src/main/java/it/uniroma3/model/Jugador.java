package it.uniroma3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Jugador extends Persona{
	
	@NotNull
	@Column(nullable=false)
	private int numero;
	
	@NotBlank
	@Column(nullable=false)
	private String posizione;
	
	

	public Jugador(@NotBlank int numero, @NotBlank String posizione) {
		super();
		this.numero = numero;
		this.posizione = posizione;
	}

	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Jugador() {
		// TODO Auto-generated constructor stub
	}

	public String getPosizione() {
		return getPosizione();
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}
	
	
}
