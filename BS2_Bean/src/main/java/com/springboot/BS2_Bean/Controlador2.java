package com.springboot.BS2_Bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador2 {

    @Autowired
    ServicioCiudad servicioCiudad;

    @GetMapping("/controlador2/getCiudad")
    public ArrayList getPersona(){
        return servicioCiudad.getCiudad();
    }

}

