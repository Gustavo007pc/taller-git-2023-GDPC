package com.gp.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.gp.demo.model.Cliente;
 


public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long>  {

	// busca cliente que contenga cadena en apellido
	public List<Cliente> findAllByApellidoContaining(String cadena);
	
	public List<Cliente> findAllByApellidoLike(String cadena);

	 
}
