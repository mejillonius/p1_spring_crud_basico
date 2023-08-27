package com.lucatic.lucasteam.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucatic.lucasteam.model.Juego;
import com.lucatic.lucasteam.service.JuegoService;

@RestController
@RequestMapping("/juegos")
public class JuegoController {

	@Autowired
	private JuegoService service;
	
	private static final Logger log = LoggerFactory.getLogger(JuegoController.class);
		
	
	@GetMapping
	public List<Juego> listJuegos() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Juego readJuego(@PathVariable int id) {
		return service.findById(id).orElseThrow(JuegoNoEncontradoException::new);	
	}
	
	@PutMapping
	public void editJuego(@RequestBody Juego juego) {
		service.save(juego);
	}
	
	@DeleteMapping("/id")
	public void deleteJuego(@PathVariable int id) {
		service.deleteById(id);
	}
	
	@PostMapping
	public void saveJuego(@RequestBody Juego juego) {
		log.info("----- Juego JSON (en metodo POST, Control): "+juego);
		service.save(juego);
	}
	
}
