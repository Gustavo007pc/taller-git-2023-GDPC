package com.gp.demo.interfaces.service;

import java.util.List;
import java.util.Optional;

import com.gp.demo.model.RolesPersona;

public interface RolesPersonaService {
	public   RolesPersona  findById(Long id) ;
	
	//public  List<RolesPersona> findByIdPersona(Integer id) ;
	
	public List<RolesPersona> findAll() ;
	
//	public List<RolesPersona> findByIdPersona(Long id) ;
	
	
	public void save(RolesPersona rolper);
	public void update(RolesPersona rolper);
	public void delete(Long id) ;
}
