package com.springboot.BS2_Bean;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioCiudad {
    ArrayList<Ciudad> listaCiudad = new ArrayList<>();

    public void addCiudad(String nombre, int nHabitantes){
        Ciudad c = new Ciudad();
        c.setNombre(nombre);
        c.setNumeroHabitantes(nHabitantes);
        listaCiudad.add(c);
    }

    public ArrayList getCiudad() {
        return listaCiudad;
    }
}
