package com.ejemplo.anashei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.anashei.model.persona;
import com.ejemplo.anashei.repository.personaRepository;

@Service
public class personaService {
    @Autowired
    private personaRepository personaRepository;

    public List<persona> readAll() {
        return personaRepository.ListarPersonas();
    }
    

    public persona create(persona p) {
        return personaRepository.crearPersona(p);
        
    }
}
