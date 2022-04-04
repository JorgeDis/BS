package com.springboot.bs4perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class Perfil2 implements Perfiles {

    private final String perfil = "perfil2";

    public String miFuncion() {
        return perfil;
    }
}