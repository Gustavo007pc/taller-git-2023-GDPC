package com.gp.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.gp.demo.model.Gramaje_Papel;
import com.gp.demo.model.ProductoPapel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Gramaje_PapelController {

    @RequestMapping("/gramaje_papel")
    public String index() {
        return "Saludos desde el Controlador Gramaje_PapelController!";
    }

 
    @GetMapping("/agregarGramaje" )
    public  Gramaje_Papel agregarGramaje() {
    	Gramaje_Papel papelOficio = new Gramaje_Papel();
    	papelOficio.setCodigo(3456);
    	papelOficio.setDescripcion("Papel Oficio");
    	papelOficio.setPrecio(154000);
    	papelOficio.setMarca("Chamex");
    	papelOficio.setGramaje("5gr/m2");
    	papelOficio.setTipo("Legal");
        
        
    	 return papelOficio;
    }
    
    /*Servicio usando metodo POST con parametros*/ 
    @PostMapping("/mostrarProductoPapel")
    public Gramaje_Papel mostrarGramaje(@RequestBody Gramaje_Papel gramaje) {

        return gramaje;
    }
    
    
    
}
