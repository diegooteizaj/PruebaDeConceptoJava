package com.venturicg.poc.web.dto;
import com.venturicg.poc.service.model.Persona;

import java.io.Serializable;
public class PersonaDTO implements Serializable {

    private  Integer id;
    private String nombre;
    private String apellido;
    private String paisId;

    public PersonaDTO(Integer id ,String nombre, String apellido, String paisId){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisId = paisId;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getpaisId() {
        return paisId;
    }

    public void setpaisId(String pais_id) {
        this.paisId = paisId;
    }

    public Persona convertToEntity() {
        Persona persona = new Persona();
        persona.setId(this.id);
        persona.setNombre(this.nombre);
        persona.setApellido(this.apellido);
        persona.setpaisId(this.paisId);
        return persona;
    }
}
