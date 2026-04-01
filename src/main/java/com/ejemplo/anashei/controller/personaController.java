package com.ejemplo.anashei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.anashei.model.persona;
import com.ejemplo.anashei.service.personaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/personas")
public class personaController {
    @Autowired
    private personaService personaService;
    
    @GetMapping
    public List<persona> getPersonas() {
        return personaService.readAll();
    }
    
    @PostMapping
    public persona postPersona (@RequestBody persona Persona) {
        personaService.create(Persona);

        return Persona;
    }
    
}
