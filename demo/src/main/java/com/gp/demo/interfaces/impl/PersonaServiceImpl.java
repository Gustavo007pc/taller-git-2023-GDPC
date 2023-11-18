package com.gp.demo.interfaces.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.demo.interfaces.service.PersonaServiceInterface;
import com.gp.demo.model.Cliente;
import com.gp.demo.model.Persona;
import com.gp.demo.model.RolesPersona;

import com.gp.demo.model.dto.PersonaDTO;
import com.gp.demo.repository.PersonaRepository;
import com.gp.demo.repository.RolesPersonaRepository;
import com.gp.demo.exceptions.GeneralLP3Exception;
import com.gp.demo.exceptions.ErrorException;

@Service
public class PersonaServiceImpl implements PersonaServiceInterface {

	@Autowired
	private PersonaRepository personaRepository;

	@Autowired
	private RolesPersonaRepository rpRepository; // repositorio rolespersona
	
	@Override
	public Persona findById(Long id) {
		Persona persona = null;
		Optional<Persona> personaFromBD = personaRepository.findById(id);
		if (personaFromBD.isPresent()) {
			persona = personaFromBD.get();
		} else {
			throw new GeneralLP3Exception("No se encontró la persona con id: " + id);
		}
		return persona;
	}

	@Override
	public List<Persona> findAll() {
		List<Persona> personas = new ArrayList<>();
		Iterator<Persona> iteratorPersonas = personaRepository.findAll().iterator();
		while (iteratorPersonas.hasNext()) {
			personas.add(iteratorPersonas.next());
		}
		return personas;
	}

	/* Funcion para guardar un  persona  con persistencia Parametros:
	 *  un objeto  persona  :  Retorno: nada
	 */
	@Override
	public void save(Persona persona) {
		personaRepository.save(persona);
		
	}

	/*
	 * Funcion para guardar una lista de personas con persistencia Parametros:
	 * List<Persona> personas : la lista de las personas que guardaremos con
	 * persistencia Retorno: Lista Guardada
	 */
	@Override
	public List<Persona> saveList(List<Persona> personas) throws  ErrorException {
		List<Persona> listPersonas= null;
		listPersonas =personaRepository.saveAll(personas);
		
		if (listPersonas== null )  {
			ErrorException errorException = new ErrorException( 
					personas.toString());
			
			throw errorException;
			 
		}
		return listPersonas;
	
		
	}
	/*
	 * Funcion para eliminar un persona con un id especifico de la persistencia
	 * Parametros: integer id : el ide del persona que queremos eliminar Retorno:
	 * ninguno
	 */
	@Override
	public void delete(Long id) {
		personaRepository.deleteById(id);
		
	}

	/* Funcion para modificar una  persona  con persistencia Parametros:
	 *  un objeto  persona  :  Retorno: nada
	 */
	@Override
	public void update(Persona persona) {
		personaRepository.save(persona);
		
	}

	//funcionaBA
	@Override
	public PersonaDTO findByEmailAndPassword(String email,String pass) throws ErrorException {
	 	PersonaDTO personaDTO = new PersonaDTO();
		Persona persona = personaRepository.findByEmailAndPassword(email,pass);
	
		if (persona == null )  {
			ErrorException errorException = new ErrorException(// System.out.println(
					email +" / "+pass);
			
			throw errorException;
			 
		}
		
		
 		personaDTO.setPersona(persona);
		
		//si existe tiene que buscar los roles de la persona y devolver lista de roles
		
		List<RolesPersona> roles =rpRepository.findByPersonaId(persona.getId());
		
		if (roles == null) {
			ErrorException errorException = new ErrorException(// System.out.println(
					email +" / "+pass);
			
			throw errorException;
		}
		personaDTO.setListRolesPersona(roles); 
		
		return personaDTO;
	}

	@Override
	public List<Persona> listarClientePorApellido(String apellido) {
		// TODO Auto-generated method stub
		return personaRepository.findByApellidoContaining(apellido);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		//llama al repositorio que conecta  a la base de datos
		personaRepository.save(cliente);
		
	 	System.out.println("****** ACTUALIZANDO UN CLIENTE ***********");
		System.out.println("Numero de Documento: " + cliente.getNumDoc());
		System.out.println("Numero de RUC: " + cliente.ruc);
		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Apellido: " + cliente.getApellido());
		System.out.println("Tipo de Documento: " + cliente.getTipoDoc());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println("Pais de Origen: " + cliente.getPaisOrigen());
		System.out.println("Ruc del cliente: " + cliente.getRuc());
		System.out.println("Password: " + cliente.getPassword());
		
		return cliente; 
	}

	/* llama al save del jparepositorio*/
	@Override
	public Cliente crearCliente(Cliente cliente) {
		// Se crea la persona per con los datos del parametro recibido
		//Cliente cliente = new Cliente();
		//cliente = parameter;
		personaRepository.save(cliente);
		
		System.out.println("GUARDANDO CLIENTE EN LA BASE DE DATOS");
		System.out.println("Numero de Documento: " + cliente.getNumDoc());
		System.out.println("Numero de RUC: " + cliente.getRuc());
		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Apellido: " + cliente.getApellido());
		System.out.println("Tipo de Documento: " + cliente.getTipoDoc());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println("Pais de Origen: " + cliente.getPaisOrigen());
		System.out.println("Ruc del cliente: " + cliente.getRuc());
		System.out.println("Password: " + cliente.getPassword());
		
		return cliente;
	}

 

	@Override
	public void eliminarCliente(Long id) {
		
		personaRepository.deleteById(id);
		System.out.println(" ************* ELIMINANDO CLIENTE *************");
		System.out.println("ID CLIENTE ELIMINADO: " +id);
 
	}


}
