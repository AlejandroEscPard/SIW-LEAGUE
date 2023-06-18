package it.uniroma3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
import it.uniroma3.model.Equipo; //Error importando model equipo
import it.uniroma3.repository.EquipoRepository;

@Controller
public class EquipoController {
	
	@Autowired
	private EquipoRepository equipoRepository;
	
	@GetMapping("/equipos")
	public String getEquipos (Model model) {
		Iterable<Equipo> equipos = equipoRepository.findAll();
		model.addSubModel((Model) equipos);
		return "equipos";
	}
	
	@GetMapping("/equipos/{nombre}")
	public String getByNome(String nome) {
		Equipo equipo = equipoRepository.findByNome(nome);
		return "equipo";
		
	}
}
