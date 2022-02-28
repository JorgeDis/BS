package com.springboot.BS2;

import org.springframework.stereotype.Service;

@Service
public class Servicio implements ServInt {

    Persona p = new Persona();

    @Override
    public Persona createPersona(String nombre, int edad, String provincia){
        p.setNombre(nombre);
        p.setEdad(edad);
        p.setProvincia(provincia);
        return p;
    }
    public Persona getPersona(){
        return p;
    }
}
