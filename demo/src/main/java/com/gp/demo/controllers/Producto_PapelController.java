package com.gp.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.gp.demo.model.Producto;
import com.gp.demo.model.ProductoPapel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Producto_PapelController {
	//GET
    @RequestMapping("/producto_papel")
    public String index() {
        return "Saludos desde el Controlador Producto_PapelController!";
    }
    
    
    
    
    @GetMapping("/crearPapel" )
    public  ProductoPapel crearPapel() {
    	ProductoPapel hoja = new ProductoPapel();
        hoja.setCodigo(134);
        hoja.setDescripcion("Papel A4");
        hoja.setPrecio(154000);
        hoja.setMarca("Medina");
        
        
    	 return hoja;
    }
    
    /*Servicio usando metodo POST con parametros*/ 
    @PostMapping("/productoPapel")
    public ProductoPapel crearPapel(@RequestBody ProductoPapel pro) {
    	// Producto_Papel hoja = new Producto_Papel();
       // hoja= pro;
        
  
       
       // FacturaUtil.facturar(serviceAFacturar);
        return pro;
    }

}
