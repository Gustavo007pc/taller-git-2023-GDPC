package com.gp.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gp.demo.exceptions.ErrorException;
import com.gp.demo.interfaces.service.RolesService;

import com.gp.demo.model.Roles;

@RestController
@RequestMapping(value="/roles")
public class RolesController {
	@Autowired
	private RolesService rolesService;// = PersonaService.buildInstance();


	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Roles> buscarPorId(@PathVariable("id") Long id) {
 
		Roles rol = new Roles();
	
			try {
				rol = rolesService.findById(id);
			} catch (ErrorException e) {
				// TODO Auto-generated catch block
				e.getCause();
			}
		return new ResponseEntity<>(rol, HttpStatus.OK);
		
	}

	/*
	 * Llama a la funcion para ver a todos los roles
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Roles> list() {
		return rolesService.findAll();
	}

	/*
	 * Llama a la funcion para agregar una persona por metodo POST
	 */
	
	@PostMapping("/add") 
	public ResponseEntity<Roles> add(@RequestBody Roles rol) {
		rolesService.save(rol);
		return new ResponseEntity<>(rol, HttpStatus.CREATED);
	}
	

	/*
	 * Llama a la funcion para agregar una lista de personas por metodo POST
	 */
	
	@RequestMapping(value = "/agregarLista", method = RequestMethod.POST)
	public void saveList(@RequestBody List<Roles> roles) {
		rolesService.saveList(roles);
	}
}
