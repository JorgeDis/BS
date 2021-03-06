package com.springboot.bs4perfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class Perfil implements Perfiles {

    private final String perfil = "Default profile";

    public String miFuncion() {
        return perfil;
    }
}
