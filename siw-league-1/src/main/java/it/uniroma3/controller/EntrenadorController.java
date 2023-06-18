package it.uniroma3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;
import it.uniroma3.model.Entrenador;
import it.uniroma3.repository.EntrenadorRepository;


@Controller
public class EntrenadorController {
	
	@Autowired
	private EntrenadorRepository entrenadorRepository;
	
	@GetMapping("/entrenadores/{id}")
	public String getEntrenadorByNome(@PathVariable("id") Long id, Model model) {
		
		Optional<Entrenador> entrenador = entrenadorRepository.findById(id);
		model.addAttribute("entrenador", entrenador);
		return "entrenador";
	}

	//Crear tecnico
	@PostMapping("/entrenadores/crear")
	public String newEntrenador(@ModelAttribute Entrenador entrenador){
		entrenadorRepository.save(entrenador);
		return "redirect:/entrenadores";
	}
	
	//Renviar a formulario
	@PostMapping("/entrenador/new")
	public String formNewEntrenador(Model model) {
		model.addAttribute("entrenador", new Entrenador());
		return "nuevo-entrenador";
		
	}
	
}