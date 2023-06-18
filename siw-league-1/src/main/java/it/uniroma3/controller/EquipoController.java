package it.uniroma3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;
import it.uniroma3.model.Equipo; //Error importando model equipo
import it.uniroma3.repository.EquipoRepository;

@Controller
public class EquipoController {
	
	@Autowired
	private EquipoRepository equipoRepository;
	
	@GetMapping("/public/equipos")
	public String getEquipos (Model model) {
		Iterable<Equipo> equipos = equipoRepository.findAll();
		model.addSubModel((Model) equipos);
		return "equipos";
	}
	
	@GetMapping("/public/equipos/{nombre}")
	public String getByNome(String nome) {
		Equipo equipo = equipoRepository.findByNome(nome);
		return "equipo";
		
	}

	@GetMapping("/admin/cambiarPresupuesto")
	public String cambiarPresupuesto(@RequestParam( "id") int numero, Long id){
		Optional<Equipo> equipo = equipoRepository.findById(id);
		equipo.setPresupuesto(numero);
		equipoRepository.save(equipo);
		return"redirect:/equipo";
	}

	
	@GetMapping("/admin/cambiarAñosFundacion")
	public String cambiarAñosFundacioS(@RequestParam("numero", "id") int numero, Long id){
		Equipo equipo = equipoRepository.findById(id);
		equipo.setAñoFundacion(numero);
		equipoRepository.save(equipo);
		return "redirect:/equipo";
	}
}
