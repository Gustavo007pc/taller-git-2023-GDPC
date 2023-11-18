package com.gp.demo.controllers;

import java.util.List;
import java.util.Optional;

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


import com.gp.demo.interfaces.service.RolesPersonaService;

import com.gp.demo.model.RolesPersona;

@RestController
@RequestMapping(value="/rolespersona")
@CrossOrigin(origins="*")	
public class RolesPersonaController {
	// llama o inyecta el servicio
	
	@Autowired
	private RolesPersonaService service;

	
	/*
	 * Llama a la funcion para ver a todos los registros que estan en la BD
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<RolesPersona> list() {
		return service.findAll();
	}
	
	
	/*Recupera de la Base de Datos Tabla RolesPersona, por el id*/
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<RolesPersona> buscarPorId(@PathVariable("id") Long id) {
 
		RolesPersona rolpersona = null;
		rolpersona = service.findById(id);
		return new ResponseEntity<>(rolpersona, HttpStatus.OK);
		
	}


	/*
	 * Llama a la funcion para guardar un registro tipo rolesPersona por metodo POST
	 * param: rolpersona de tipo RolesPersona
	 */
	
	@PostMapping("/add")
	public ResponseEntity<RolesPersona> add(@RequestBody RolesPersona rolpersona) {
		service.save(rolpersona);
		return new ResponseEntity<>(rolpersona, HttpStatus.CREATED);
	}
}
