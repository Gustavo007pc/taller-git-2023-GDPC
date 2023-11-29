package com.gp.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gp.demo.exceptions.GeneralLP3Exception;
import com.gp.demo.exceptions.ErrorException;
import com.gp.demo.interfaces.service.PersonaServiceInterface;
import com.gp.demo.model.Cliente;
import com.gp.demo.model.Persona;
import com.gp.demo.model.dto.LoginDTO;


@RestController
@RequestMapping(value="/persona")
public class PersonaController {

		//se comunica con el servicio
		
		@Autowired
		private PersonaServiceInterface personaService;// = PersonaService.buildInstance();


		@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public ResponseEntity<Persona> buscarPorId(@PathVariable("id") Long id){
	 
			Persona persona = personaService.findById(id);
			return new ResponseEntity<>(persona, HttpStatus.OK);
			
		}

		/*
		 * Llama a la funcion para ver a todos las personas
		 */
		@RequestMapping(value = "/", method = RequestMethod.GET)
		public List<Persona> list() {
			return personaService.findAll();
		}

		/*
		 * Llama a la funcion para agregar una persona por metodo POST
		 */
		
		@PostMapping("/add") 
		public ResponseEntity<Persona> add(@RequestBody Persona persona) {
			personaService.save(persona);
			return new ResponseEntity<>(persona, HttpStatus.CREATED);
		}
		@PostMapping("/update")
		public ResponseEntity<Persona> update(@RequestBody Persona persona) {
			personaService.update(persona);

			return new ResponseEntity<>(persona, HttpStatus.OK);
		}
		

		/*
		 * Llama a la funcion para agregar una lista de personas por metodo POST
		 */
		
		@RequestMapping(value = "/agregarLista", method = RequestMethod.POST)
		public void saveList(@RequestBody List<Persona> personas) {
			try {
				personaService.saveList(personas);
			} catch (ErrorException e) {
				
				System.out.println("ERROR AL AGREGAR LA LISTA DE PERSONAS: " + e.getMessage());
			}
		}

		/*
		 * Llama a la funcion para eliminar un persona por su numero de cedula por
		 * DELETE por metodo DELETE
		 */
		@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
		public void delete(@PathVariable("id") Long id) {
			try {
				personaService.eliminarCliente(id);
			} catch ( GeneralLP3Exception e) {
				// TODO Auto-generated catch block
				String mensaje = e.getMessage();
				System.out.println("Ocurrió un error al tratar de elimniar la persona: " )	 ;
			
			}
			}
			
		

}
