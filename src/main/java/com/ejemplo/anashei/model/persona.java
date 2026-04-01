package com.ejemplo.anashei.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class persona {
    private String nombre;
    private String apellido;
    private  int edad;
    
}
