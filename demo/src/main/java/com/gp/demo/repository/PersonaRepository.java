package com.gp.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gp.demo.model.Cliente;
import com.gp.demo.model.Persona;


 

public interface PersonaRepository extends  JpaRepository<Persona,Long>{
	
	Persona findByNumDoc(int numeroCedula);	
	Persona findByEmail(String email);	
	Persona getByEmail(String email);	
	Persona findByEmailAndPassword(String email, String pass);	
	
	/*Devuelve una lista de Clientes filtrando por una cadena */
	List<Persona> findByApellidoContaining(String cadena);
}
