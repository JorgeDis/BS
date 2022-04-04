package com.springboot.BS8.infrastructure.repository.jpa;

import com.springboot.BS8.Domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {
    List<Persona> findByUser(String usuario);
    void deleteById(Integer id);
}