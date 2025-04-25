package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class HolaMundoController {

    @GetMapping("/hola")
    public String homaMundo() {
        return "¡Hola Mundo!";
    }

    @PostMapping("/holapost")
    public String homaMundoPost(@RequestBody String entity) {
        //TODO: process POST request
        
        return "Hola " +entity;
    }
    
    
}
