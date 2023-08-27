package com.lucatic.lucasteam.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
