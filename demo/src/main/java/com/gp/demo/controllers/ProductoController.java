package com.gp.demo.controllers;

import org.springframework.web.bind.annotation.RestController;


import com.gp.demo.interfaces.impl.ProductoInterfaceImpl;

import com.gp.demo.model.Producto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductoController {
	 
	public ProductoInterfaceImpl servicio = new   ProductoInterfaceImpl(); 
		
		
    @RequestMapping("/producto")
    public String index() {
        return "Saludos desde el Controlador ProductoController!";
    }

    
    
    @GetMapping("/mostrarProducto/{descripcion}" )
    public Producto mostrarProductoPorDescripcion(@PathVariable("descripcion") String descripcion) {
    	servicio.buscarPorDescripcion(descripcion);
    	return null;
    }
    
    
    /*Servicio usando metodo POST con parametros*/ 
    @PostMapping("/producto")
    public Producto crearProducto(@RequestBody Producto productoCrearse) {
    	servicio.crearProducto(productoCrearse);
    	
    
        return productoCrearse;
    }
}
