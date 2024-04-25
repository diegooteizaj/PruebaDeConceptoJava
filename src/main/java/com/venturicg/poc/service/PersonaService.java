package com.venturicg.poc.service;


import com.venturicg.poc.service.model.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> obtenerPersona();

    void insertarPersona(Persona persona);

    void actualizarPersona(Persona persona);

    void eliminarPersona(long id);
}
