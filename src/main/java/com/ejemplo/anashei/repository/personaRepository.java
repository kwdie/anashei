package com.ejemplo.anashei.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.ejemplo.anashei.model.persona;

@Repository
public class personaRepository {
    private List<persona> people = new ArrayList<>();

    public  List<persona> ListarPersonas() {
        return people;
    }
    
    public persona crearPersona(persona p){
        people.add(p);
        return p;
    }
}
