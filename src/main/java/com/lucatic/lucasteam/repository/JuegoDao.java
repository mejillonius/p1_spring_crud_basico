package com.lucatic.lucasteam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucatic.lucasteam.model.Juego;

@Repository
public interface JuegoDao extends JpaRepository<Juego,Integer>{

}
