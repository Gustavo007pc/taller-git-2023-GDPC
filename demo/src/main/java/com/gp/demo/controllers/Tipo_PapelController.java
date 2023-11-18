package com.gp.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.gp.demo.model.Servicio;
import com.gp.demo.model.Tipo_Papel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Tipo_PapelController {

    @RequestMapping("/tipo_papel")
    public String index() {
        return "Saludos desde el Controlador Tipo_PapelController!";
    }
    /*Servicio usando metodo POST con parametros*/ 
    @PostMapping("/crearTipo")
    public Tipo_Papel crearTipo(@RequestBody Tipo_Papel tipo) {
         Tipo_Papel p = new Tipo_Papel();
         p = tipo;
       
        System.out.println(p.getCodigo());
        System.out.println("descripcion" + p.getDescripcion());
        System.out.println(p.getPrecio());
      
       // FacturaUtil.facturar(serviceAFacturar);
        return p;
    }

}
