package com.lucatic.lucasteam.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucatic.lucasteam.controller.JuegoController;
import com.lucatic.lucasteam.model.Juego;
import com.lucatic.lucasteam.repository.JuegoDao;

@Service
public class JuegoServiceImpl implements JuegoService {

	private static final Logger log = LoggerFactory.getLogger(JuegoController.class);	

	@Autowired
	private JuegoDao juegoDAO;
	
	@Override
	public List<Juego> findAll() {
		// TODO Auto-generated method stub
		return juegoDAO.findAll();
	}

	@Override
	public Optional<Juego> findById(int id) {
		// TODO Auto-generated method stub
		return juegoDAO.findById(id);
	}

	@Override
	public void save(Juego juego) {
		log.info("------ Juego JSON (en metodo POST, Service): " + juego);
		juegoDAO.save(juego);
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		juegoDAO.deleteById(id);
		// TODO Auto-generated method stub

	}

}
