package com.gp.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.gp.demo.interfaces.service.FacturacionServicio;
import com.gp.demo.model.Cliente;
import com.gp.demo.model.ItemFacturable;

@RestController
public class FacturacionController {

	//se comunica con la implementacion del servicio
	@Autowired
		public FacturacionServicio servicio; // punto de contacto con la capa de servicios
		
		@GetMapping("/listarPorRuc/{ruc}")
		public Cliente ListarClientePorRuc(@PathVariable("ruc") String ruc) {
			 
			servicio.listarClientesNombreORuc(ruc);
			Cliente cli=new Cliente();
			cli.setNumDoc(34535);
			cli.setNombre("Gustavo");
			cli.setApellido("Perez");
			cli.setEmail("gp@hotmail.com");
			cli.setRuc(ruc);

			return cli;
			 
		}
		
		@PostMapping("/facturar")
		public ItemFacturable facturar(@RequestBody ItemFacturable item) {
			 
			servicio.facturar(item);
			 
			
			return item;
		}
}
