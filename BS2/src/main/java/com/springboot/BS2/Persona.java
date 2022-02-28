package com.springboot.BS2;

import lombok.Data;

@Data
public class Persona {
    String nombre;
    int edad;
    String provincia;

    public Persona() {
    }

    public Persona(String nombre, int edad, String provincia) {
        this.nombre = nombre;
        this.edad = edad;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}