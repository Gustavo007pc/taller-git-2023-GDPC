package com.gp.demo.interfaces.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.gp.demo.exceptions.ErrorException;
import com.gp.demo.model.Roles;


public interface RolesService {
	// busca una Rolpor su id
	public  Roles findById(Long id) throws ErrorException ;
	
	//recupera todos los roles
	public List<Roles> findAll() ;
	
	// guarda 1 Rol a la vez
	public void save(Roles rol);
	
	//actualiza un rol
	public void update(Roles rol);
	
	//borra un roll por su id
	public void delete(Long id) ;

	public void saveList(List<Roles> roles);
}
