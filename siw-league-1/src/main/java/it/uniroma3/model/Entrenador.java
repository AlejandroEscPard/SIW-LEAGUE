package it.uniroma3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
@Entity
public class Entrenador extends Persona {
	
	@NotBlank
	@Column(nullable=false)
	private String modoJuego;
	

	public Entrenador(@NotBlank String modoJuego) {
		super();
		this.modoJuego = modoJuego;
	}

	public String getModoJuego() {
		return modoJuego;
	}

	public void setModoJuego(String modoJuego) {
		this.modoJuego = modoJuego;
	}
	
}
