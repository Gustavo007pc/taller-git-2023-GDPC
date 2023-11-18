package com.gp.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gp.demo.interfaces.service.ClienteService;
import com.gp.demo.interfaces.service.PersonaServiceInterface;
import com.gp.demo.model.Cliente;
import com.gp.demo.model.Persona;

import java.util.List;


/*CRUD CLIENTES*/
@RestController
@RequestMapping(value="/cliente")
 public class ClienteController {

 
	@Autowired
	private ClienteService clienteService;
	
	/*Agrega un cliente a la base de datos*/
	
	@PostMapping("/add")
	public Cliente crearCliente(@RequestBody Cliente nuevoCli) {
		clienteService.save(nuevoCli);
		return nuevoCli;
	}
	
	@PostMapping("/update")
	public Cliente updateCliente(@RequestBody Cliente cliente) {
		clienteService.save(cliente);
		return cliente;
	}
	
	/* 	POR METODO GET
	 *  listar los clientes filtrado por sus apellidos.
	 *   La palabra de búsqueda puede ser una subcadena. 
	 *  Ej. Si busco: "ca" debe devolver:  Acasuso, Candia, Teneca,
	 * */
	@GetMapping("/buscarConteniendo/{cadena}")
	public ResponseEntity<List<Cliente>> clienteContaining(@PathVariable("cadena") String cadena) {
 
		List<Cliente> lista= clienteService.buscarByApellidoContaining(cadena);
		return new ResponseEntity<>(lista, HttpStatus.OK);
 
	} 
	
	@GetMapping("/buscarLike/{cadena}")
	public ResponseEntity<List<Cliente>> clienteLike(@PathVariable("cadena") String cadena) {
 
		List<Cliente> lista= clienteService.buscarByApellidoContaining(cadena);
		return new ResponseEntity<>(lista, HttpStatus.OK);
 
	} 

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Iterable<Cliente> list() {
		return clienteService.findAll();
	}
 
	

	//borrar cliente por numero de doc
	@DeleteMapping("/borrar/{id}")
	public String eliminarCliente(@PathVariable("id") Long id) {
		clienteService.delete(id);
		return "EL CLIENTE CON ID : "+ id +" FUE ELIMINADO";
	}
	
	
}
