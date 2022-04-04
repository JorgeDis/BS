package com.springboot.BS8.infrastructure.controller.dto;

import com.springboot.BS8.Aplication.PersonaService;
import com.springboot.BS8.infrastructure.controller.dto.input.PersonaInputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("persona")
@RestController
public class CreatePersonaController {

    @Autowired
    PersonaService personaService;

    @PostMapping
    public PersonaInputDto addPersona(@RequestBody PersonaInputDto personaInputDto) throws Exception {
        return personaService.addPersona(personaInputDto);
    }
}
