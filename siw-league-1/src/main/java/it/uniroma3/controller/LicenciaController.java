package it.uniroma3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
import it.uniroma3.model.Licencia;
import it.uniroma3.repository.EquipoRepository;
import it.uniroma3.repository.JugadorRepository;
import it.uniroma3.repository.LicenciaRepository;

@Controller
public class LicenciaController<Licencia> {
	@Autowired
	private JugadorRepository jugadorRepository;
	@Autowired
	private LicenciaRepository licenciaRepository;
	
	
	
	@GetMapping("/public/jugadores")
	public String getLicenciaJugadores(Model model) {
		List<it.uniroma3.model.Licencia> jugadores = licenciaRepository.findByTipo("Jugador");
		model.addAttribute("jugadores", jugadores);
		
		return "jugadores";
		
	}
	
	@GetMapping("/public/tecnicos")
	public String getLicenciaTecnicos(Model model) {
		List<it.uniroma3.model.Licencia> tecnicos = licenciaRepository.findByTipo("Tecnico");
		model.addAttribute("tecnicos", tecnicos);
		return "tecnicos";
	}
	
	@GetMapping("/public/entrenadores")
	public String getLicenciaEntrenadores(Model model) {
		List<it.uniroma3.model.Licencia> entrenadores = licenciaRepository.findByTipo("Entrenador");
		model.addAttribute("entrenadores", entrenadores);
		return "entrenadores";
	}
	
	@GetMapping("/public/presidentes")
	public String getLicenciaPresidentes(Model model) {
		List<it.uniroma3.model.Licencia> presidentes = licenciaRepository.findByTipo("Presidente");
		model.addAttribute("presidentes", presidentes);
		return "presidentes";
	}
	
	
	
	
}
