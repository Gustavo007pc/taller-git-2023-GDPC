package com.gp.demo.interfaces.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.demo.exceptions.ErrorException;
import com.gp.demo.exceptions.GeneralLP3Exception;
import com.gp.demo.interfaces.service.RolesService;
import com.gp.demo.model.Persona;
import com.gp.demo.model.Roles;
import com.gp.demo.repository.RolesRepository;

@Service
public class RolesServiceImpl implements RolesService{

	@Autowired
	RolesRepository repository;
	
	 
	public Roles findById(Long id) throws ErrorException {
		Roles rol = null;
		Optional<Roles> rolFromBD = repository.findById(id);
		if (rolFromBD.isPresent()) {
			rol = rolFromBD.get();
		} else {
			
			throw new ErrorException("No se encontró el rol con id: " + id);
		}
		return rol;
		 
	}

	@Override
	public List<Roles> findAll() {
		// TODO Auto-generated method stub
		 return repository.findAll();
	}

	@Override
	public void save(Roles rol) {
		 repository.save(rol);
	}

	@Override
	public void update(Roles rol) {
		 repository.save(rol);
		 
	}

	@Override
	public void delete(Long id) {
		 repository.deleteById(id);
		
	}

	@Override
	public void saveList(List<Roles> roles) {
		repository.saveAll(roles);
		
	}

}
