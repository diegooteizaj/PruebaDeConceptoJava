package com.venturicg.poc.service.impl;


import com.venturicg.poc.repository.PersonaDAO;
import com.venturicg.poc.service.PersonaService;
import com.venturicg.poc.service.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaDAO personaDAO;


    @Override
    public List<Persona> obtenerPersona() {
        return personaDAO.obtenerPersona();
    }

    @Override
    public void insertarPersona(Persona persona) {
        personaDAO.insertarPersona(persona);
    }

    @Override
    public void actualizarPersona(Persona persona) {
        personaDAO.actualizarPersona(persona);
    }

    @Override
    public void eliminarPersona(long id) {
        personaDAO.eliminarPersona(id);
    }
}
