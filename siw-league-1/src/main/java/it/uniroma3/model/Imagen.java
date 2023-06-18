package it.uniroma3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Imagen {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private byte[] data;
	
	@NotBlank
	@Column(nullable=false)
	private String nombre;

	
	public Imagen( byte[] data, @NotBlank String nombre) {
		super();
		this.data = data;
		this.nombre = nombre;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
