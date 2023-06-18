package it.uniroma3.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Equipo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank
	@Column(nullable=false)
	private String nombre;
	
	private String sigla;
	
	private int presupuesto;
	
	@NotBlank
	@Column(nullable=false)

	private String ciudad;
	
	@Column(nullable=false)
	private int añoFundacion;
	
	@NotBlank
	@Column(nullable=false)

	private String stadio;
	
	@OneToMany
	private List<Jugador> listaJugadores;
	
	@OneToMany
	private List<Tecnico> listaTecnicos;
	
	
	@OneToMany
	@Column(nullable=false)
	private Presidente presidente;
	
	@OneToMany
	@Column(nullable=false)
	private Entrenador entrenador;

	@OneToOne
	private Imagen imagen;

	public Equipo( @NotBlank String nombre, String sigla, int presupuesto, @NotBlank String ciudad,
			@NotNull int añoFundacion, @NotBlank String stadio, List<Jugador> listaJugadores,
			List<Tecnico> listaTecnicos, @NotNull Presidente presidente, @NotNull Entrenador entrenador) {
		super();
		
		this.nombre = nombre;
		this.sigla = sigla;
		this.presupuesto = presupuesto;
		this.ciudad = ciudad;
		this.añoFundacion = añoFundacion;
		this.stadio = stadio;
		this.listaJugadores = listaJugadores;
		this.listaTecnicos = listaTecnicos;
		this.presidente = presidente;
		this.entrenador = entrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getAñoFundacion() {
		return añoFundacion;
	}

	public void setAñoFundacion(int añoFundacion) {
		this.añoFundacion = añoFundacion;
	}

	public String getStadio() {
		return stadio;
	}

	public void setStadio(String stadio) {
		this.stadio = stadio;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	public List<Tecnico> getListaTecnicos() {
		return listaTecnicos;
	}

	public void setListaTecnicos(List<Tecnico> listaTecnicos) {
		this.listaTecnicos = listaTecnicos;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}
	
	
	
	
}
