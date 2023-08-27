package com.lucatic.lucasteam.controller;

public class JuegoNoEncontradoException extends RuntimeException {
	
	private static final long serialVersionUID =1L;
	
	public JuegoNoEncontradoException() {
		super("Epic Fail: No existe el juego");
	}
	public JuegoNoEncontradoException(Long id) {
		super("Epic Fail: No existe el juego "+id);
	}		
}
