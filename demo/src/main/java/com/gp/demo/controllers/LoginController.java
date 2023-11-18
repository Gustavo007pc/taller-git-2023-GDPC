package com.gp.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gp.demo.exceptions.ErrorException;

import com.gp.demo.interfaces.service.PersonaServiceInterface;
import com.gp.demo.interfaces.service.RolesPersonaService;
import com.gp.demo.model.Persona;
import com.gp.demo.model.RolesPersona;
import com.gp.demo.model.dto.LoginDTO;
import com.gp.demo.model.dto.PersonaDTO;


@Controller
@RequestMapping(value="/login")
@CrossOrigin(origins="*")
public class LoginController {
	@Autowired
	private PersonaServiceInterface personaService;
	
	/* Funcion que recibe los datos en un  dto (data transfer objet) 
	 * que tiene los datos del usuario y contraseña
	 * llama a la funcion definida en el servicio
	 * Retorna los datos completos de la persona logueada y  sus roles*/
	
 
	@PostMapping
 	public ResponseEntity<PersonaDTO> registrarse(@RequestBody LoginDTO logindto) {
		
		PersonaDTO personaDTO = new PersonaDTO();
		
		try {
			personaDTO = personaService.findByEmailAndPassword(logindto.getEmail(),logindto.getPassword());
		} catch (ErrorException e) {
			System.out.println("ERROR EN USUARIO O CONTRASENA!! INTENTE DE NUEVO: " + e.getMessage());
			return new ResponseEntity<>(personaDTO, HttpStatus.UNAUTHORIZED);
			
		}
		// retorna un status code 200 y la lista de roles de la persona que estan en LA CLASE personaDTO
		return new ResponseEntity<>(personaDTO, HttpStatus.OK);
		
	}
	


	

}
