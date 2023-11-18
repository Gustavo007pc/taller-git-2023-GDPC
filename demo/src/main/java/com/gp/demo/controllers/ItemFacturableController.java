package com.gp.demo.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ItemFacturableController {

    @RequestMapping("/itemfacturable")
    public String index() {
        return "Saludos desde el Controlador Item FacturableController!";
    }
    

}
