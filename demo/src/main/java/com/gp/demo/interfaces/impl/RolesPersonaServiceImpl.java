package com.gp.demo.interfaces.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.gp.demo.exceptions.GeneralLP3Exception;
import com.gp.demo.interfaces.service.RolesPersonaService;
import com.gp.demo.model.Persona;
import com.gp.demo.model.RolesPersona;
import com.gp.demo.repository.RolesPersonaRepository;

@Service
public class RolesPersonaServiceImpl implements RolesPersonaService{

	@Autowired
	RolesPersonaRepository repository;
	
	@Override
	public  RolesPersona  findById(Long id) {
		RolesPersona rolpersona = null;
		Optional<RolesPersona> rolperFromBD = repository.findById(id);
		if (rolperFromBD.isPresent()) {
			rolpersona = rolperFromBD.get();
		} else {
			throw new GeneralLP3Exception("No se encontró la persona con id: " + id);
		}
		return rolpersona;
	}
	
	@Override
	public List<RolesPersona> findAll() {
		 
		return repository.findAll();
	}

	@Override
	public void save(RolesPersona rolpersona) {
		  repository.save(rolpersona);
		
	}

	@Override
	public void update(RolesPersona rolpersona) {
		repository.save(rolpersona);
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

/*	@Override
	public List<RolesPersona> findByIdPersona(Long id) {
		// TODO Auto-generated method stub
		return repository.findByPersonaId(id);
	}*/







}
