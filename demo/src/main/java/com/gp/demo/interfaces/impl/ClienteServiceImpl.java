package com.gp.demo.interfaces.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.demo.exceptions.GeneralLP3Exception;
import com.gp.demo.interfaces.service.ClienteService;
import com.gp.demo.model.Cliente;

import com.gp.demo.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService  {

	@Autowired
	ClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> buscarByApellidoContaining(String cadena) {
		
		List<Cliente> lista= clienteRepository.findAllByApellidoContaining(cadena);
		return lista;
	}

	@Override
	
	
	public Cliente findById(Long id) {
		Cliente cliente = new Cliente();
		
		Optional<Cliente> clienteFromBD = clienteRepository.findById(id);
	
		if (clienteFromBD.isPresent()) {
			cliente = clienteFromBD.get();
		} else {
			throw new GeneralLP3Exception("No se encontró el cliente con id: " + id);
		}
		return cliente;
	}

	@Override
	public List<Cliente> findAll() {
		List<Cliente> lista= (List<Cliente>) clienteRepository.findAll();
		 return lista;
	}

	@Override
	public void save(Cliente cliente) {
		 clienteRepository.save(cliente);
		
	}

	@Override
	public void update(Cliente cliente) {
		 clienteRepository.save(cliente);
		
	}

	@Override
	public void delete(Long id) {
		clienteRepository.deleteById(id);
		
	}

	@Override
	public List<Cliente> buscarByApellidoLike(String cadena) {
		clienteRepository.findAllByApellidoLike("%cadena%");
		return null;
	}



	 

}
