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
import it.uniroma3.model.Tecnico;
import it.uniroma3.repository.PresidenteRepository;
import it.uniroma3.repository.TecnicoRepository;

@Controller
public class TecnicoController {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@GetMapping("/tecnicos/{id}")
	public String getTecnicoByNome(@PathVariable("id") Long id, Model model) {
		
		List<Jugador> tecnico = tecnicoRepository.findById(id);
		return "tecnico";
	}

	//Crear tecnico
	@PostMapping("/tecnicos/crear")
	public String newPresidente(@ModelAttribute Tecnico tecnico){
		tecnicoRepository.save(tecnico);
		return "redirect:/tecnicos";
	}
	
	//Renviar a formulario
	@PostMapping("/tecnicos/new")
	public String formNewTecnico(Model model) {
		model.addAttribute("tecnico", new Tecnico());
		return "nuevo-tecnico";
		
	}
	
}