package com.gp.demo.interfaces.service;

import java.util.List;
 

 
import com.gp.demo.exceptions.ErrorException;
import com.gp.demo.model.Cliente;
import com.gp.demo.model.Persona;
 
import com.gp.demo.model.dto.PersonaDTO;

public interface PersonaServiceInterface {
	
	public  Persona findById(Long id) ;
	public List<Persona> findAll() ;
	
	// guarda 1 persona a la vez
	public void save(Persona persona);
	public void update(Persona persona);
	public void delete(Long id) ;
	
	//guarda una lista de personas
	public List<Persona> saveList(List<Persona> personas) throws ErrorException;
	
	//void deleteByCedula(int cedula) throws GeneralLP3Exception;

	// busca en Email y Password por metodo de jpa nombres de campos
	
	PersonaDTO findByEmailAndPassword(String email, String pass) throws ErrorException;
	
	public List<Persona> listarClientePorApellido(String apellido);
	
	public Cliente actualizarCliente(Cliente cliente);

	public Cliente crearCliente(Cliente cliente);

	public void eliminarCliente(Long id);
	
 
}
