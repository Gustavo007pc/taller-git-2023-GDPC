package com.gp.demo.interfaces.service;

import java.util.List;

import com.gp.demo.model.Cliente;



public interface ClienteService {
	
	public Cliente findById(Long id) ;
	public List<Cliente> findAll() ;
	
	// guarda 1 persona a la vez
	public void save(Cliente cliente);
	public void update(Cliente cliente);
	public void delete(Long id) ;
	
	public  List<Cliente> buscarByApellidoContaining(String cadena) ;
	public  List<Cliente> buscarByApellidoLike(String cadena) ;
}
