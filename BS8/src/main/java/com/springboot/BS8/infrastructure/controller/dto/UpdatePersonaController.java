package com.springboot.BS8.infrastructure.controller.dto;

import com.springboot.BS8.Aplication.PersonaService;
import com.springboot.BS8.infrastructure.controller.dto.input.PersonaInputDto;
import com.springboot.BS8.infrastructure.controller.dto.output.PersonaOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("persona")
@RestController
public class UpdatePersonaController {

    @Autowired
    PersonaService personaService;

    @PutMapping("{id}")
    public PersonaOutputDto updatePersona(@PathVariable Integer id, @RequestBody PersonaInputDto personaInputDto) throws Exception {

        return personaService.updatePersona(id, personaInputDto);

    }
}
