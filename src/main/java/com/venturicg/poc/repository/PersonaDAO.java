package com.venturicg.poc.repository;

import com.venturicg.poc.service.model.Persona;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonaDAO {

    @Select("SELECT * FROM persona")
    List<Persona> obtenerPersona();

    @Insert("INSERT INTO persona (nombre, apellido, pais_id) VALUES (#{nombre}, #{apellido}, #{paisId})")
    void insertarPersona(Persona persona);

    @Update("UPDATE persona SET nombre = #{nombre}, apellido = #{apellido}, pais_id = #{paisId} WHERE id = #{id}")
    void actualizarPersona(Persona persona);

    @Delete("DELETE FROM persona WHERE id = #{id}")
    void eliminarPersona(long id);
}
