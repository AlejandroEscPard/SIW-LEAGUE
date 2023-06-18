package it.uniroma3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;
import it.uniroma3.model.Jugador;
import it.uniroma3.model.Presidente;
import it.uniroma3.repository.JugadorRepository;
import it.uniroma3.repository.PresidenteRepository;

@Controller
public class JugadorController {
	
	@Autowired
	private JugadorRepository jugadorRepository;
	
	@GetMapping("/jugadores/{id}")
	public String getJugadorById(@PathVariable("id") Long id, Model model) {
		
		List<Jugador> jugador = jugadorRepository.findById(id);
		return "jugador";
	}

	//Crear jugador
	@PostMapping("/jugadores/crear")
	public String newJugador(@ModelAttribute Jugador jugador){
		jugadorRepository.save(jugador);
		return "redirect:/jugadores";
	}
	//Renviar a formulario
	@PostMapping("/jugadores/new")
	public String formNewJugador(Model model){
		model.addAttribute("jugador", new Jugador());
		return "nuevo-jugador";
		
	}
	
	@GetMapping("/buscarJugadorPorPosicion")
	public String searchJugadorPorPosicion(@RequestParam("posicion") String posicion, Model model) {
		List<Jugador> listajugadores = jugadorRepository.findAllByPosicion(posicion);
		model.addAttribute("jugadores", listajugadores);
		return "jugadores";
	}
	
	@GetMapping("/buscarJugadorPorAñosDeExperiencia")
	public String searchJugadorPorAñosExperiencia(@RequestParam("años") int años, Model model) {
		List<Jugador> listajugadores = jugadorRepository.findAllByAñosExperiencia(años);
		model.addAttribute("jugadores", listajugadores);
		return "jugadores";
	}
	
}
