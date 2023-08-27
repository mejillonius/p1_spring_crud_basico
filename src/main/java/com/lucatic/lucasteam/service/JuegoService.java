package com.lucatic.lucasteam.service;

import java.util.List;
import java.util.Optional;

import com.lucatic.lucasteam.model.Juego;

public interface JuegoService {

	public List<Juego> findAll();
	
	public Optional<Juego> findById(int id);
	
	public void save(Juego juego);
	
	public void deleteById(int id);
}
