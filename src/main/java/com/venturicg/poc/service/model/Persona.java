package com.venturicg.poc.service.model;
import java.io.Serializable;
public class Persona implements Serializable{
    private  Integer id;
    private String nombre;
    private String apellido;
    private String paisId;

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

    public void setpaisId(String paisId) {
        this.paisId = paisId;
    }
}
