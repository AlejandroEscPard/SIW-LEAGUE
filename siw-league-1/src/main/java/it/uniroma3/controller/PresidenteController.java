package it.uniroma3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ch.qos.logback.core.model.Model;
import it.uniroma3.model.Jugador;
import it.uniroma3.model.Presidente;
import it.uniroma3.repository.PresidenteRepository;

@Controller
public class PresidenteController {
	
	@Autowired
	private PresidenteRepository presidenteRepository;
	
	@GetMapping("/presidentes/{id}")
	public String getPresidenteByNome(@PathVariable("id") Long id, Model model) {
		
		List<Jugador> presidente = presidenteRepository.findById(id);
		return "presidente";
	}

	//Crear presidente
	@PostMapping("/presidentes/crear")
	public String newPresidente(@ModelAttribute Presidente presidente){
		presidenteRepository.save(presidente);
		return "redirect:/presidentes";
	}
	
	//Renviar a formulario
	@PostMapping("/presidentes/new")
	public String formNewpresidente(Model model) {
		model.addAttribute("presidente", new Presidente());
		return "nuevo-presidente";
		
	}
	
}