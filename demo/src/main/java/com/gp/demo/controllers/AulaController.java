package com.gp.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gp.demo.model.*;
import com.gp.demo.interfaces.service.*;

@RestController
@RequestMapping("/aula")
public class AulaController {

	@Autowired
	private AulaService aulaService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Aula greetings(@PathVariable("id") Long id) {
        Aula baseInstitute = aulaService.findById(id);
        return baseInstitute;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Aula> list() {
        return aulaService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Aula institute) {
    	aulaService.save(institute);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	aulaService.delete(id);
    }
    
    @RequestMapping(value = "/buscar", method = RequestMethod.GET)
    public List<Aula> buscarPorDescripcion(@RequestParam("descripcion") String descripcion) {
        System.out.println("Parametro descripcion: " + descripcion);
        return aulaService.findAll();
    }

}