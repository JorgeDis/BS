package com.springboot.BS8.Utils;

import com.springboot.BS8.infrastructure.controller.dto.input.PersonaInputDto;

public class utils {

    public static boolean checkLengthUsr(PersonaInputDto personaInputDto){
        if (personaInputDto.getUser().length() > 6 && personaInputDto.getUser().length() < 10) {
            return false;
        } else {return true;}
    }
}
