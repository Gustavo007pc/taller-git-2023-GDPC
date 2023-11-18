package com.gp.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.gp.demo.interfaces.impl.GenericosImpl;

@RestController
public class ControladorGenerico<T> {

	public GenericosImpl<Object> servicio = new GenericosImpl<>();
	
	@PostMapping("/facturarGenericos")
	public T facturar(@RequestBody T item) {
		 
		servicio.notificarComprador(item);
		 
		
		return item;
	}
}
