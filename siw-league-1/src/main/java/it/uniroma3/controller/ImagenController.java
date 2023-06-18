package it.uniroma3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import it.uniroma3.model.Imagen;
import it.uniroma3.repository.ImagenRepository;

@Controller
public class ImagenController {
	@Autowired
	private ImagenRepository imagenRepository;
	
	@PostMapping("/imagenes")
	public String newImagen (@ModelAttribute Imagen imagen) {
		imagenRepository.save(imagen);
		return "redirect/imagenes";
	}
}