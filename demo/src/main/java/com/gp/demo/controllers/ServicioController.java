package com.gp.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gp.demo.model.Servicio;

@RestController
public class ServicioController {

    @GetMapping("/servicio")
    public String index() {
        return "Saludos desde el Controlador ServicioController!";
    }

    /*Servicio usando metodo POST SIN parametros*/ 
    @RequestMapping(value="/servicio/mostrar" ,method = RequestMethod.POST)
    public Servicio mostrarServicio() {
       
    	Servicio servicio = new Servicio();
    	servicio.setPrecio(100000);
        servicio.setCodigo(159) ;
        servicio.setDescripcion("FOTOCOPIAS TAMANO OFICIO");
        servicio.setCantidadPersonas(2);
        return servicio;
    }  
    
    /*Servicio usando metodo POST con parametros*/ 
    @PostMapping("/servicio")
    public Servicio crearServicio(@RequestBody Servicio serviceAFacturar) {
        Servicio servicio = new Servicio();
        servicio= serviceAFacturar;
        
        System.out.println(servicio.getCodigo());
        System.out.println("descripcion" + servicio.getDescripcion());
        System.out.println(servicio.getPrecio());
        System.out.println(servicio.getTipoImpuesto());
        System.out.println(servicio.getCantidadPersonas());
       
        return servicio;
    }
    
 

}
