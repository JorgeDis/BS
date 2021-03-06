package com.springboot.BS8.Aplication;

import com.springboot.BS8.infrastructure.controller.dto.input.PersonaInputDto;
import com.springboot.BS8.infrastructure.controller.dto.output.PersonaOutputDto;


import java.util.List;

public interface PersonaService {
    public List<PersonaOutputDto> getAllPersonas();

    public PersonaOutputDto filterPersonaById(int id) throws Exception;

    public List<PersonaOutputDto> filterPersonaByUser(String user);

    public PersonaInputDto addPersona(PersonaInputDto personaInputDto) throws Exception;

    public PersonaOutputDto updatePersona(Integer id, PersonaInputDto personaInputDto) throws Exception;

    public PersonaOutputDto updatePatchPersona(Integer id, PersonaInputDto personaInputDto) throws Exception;

    public void deletePersona(Integer id) throws Exception;
}
