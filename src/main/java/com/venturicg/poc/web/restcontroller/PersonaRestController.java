package com.venturicg.poc.web.restcontroller;

import com.venturicg.poc.service.PersonaService;
import com.venturicg.poc.web.dto.PersonaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/persona")
public class PersonaRestController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("")
    public ResponseEntity<List<PersonaDTO>> obtenerPersonas() {
        List<PersonaDTO> personasDTO = personaService.obtenerPersona().stream()
                .map(persona -> new PersonaDTO(persona.getId(), persona.getNombre(), persona.getApellido(), persona.getpaisId()))
                .collect(Collectors.toList());
        return new ResponseEntity<>(personasDTO, HttpStatus.OK);
    }

    @PostMapping("/insertar")
    public ResponseEntity<PersonaDTO> insertarPersona(@RequestBody PersonaDTO personaDTO) {
        personaService.insertarPersona(personaDTO.convertToEntity());
        return new ResponseEntity<>(personaDTO, HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<PersonaDTO> actualizarPersona(@PathVariable("id") Integer id, @RequestBody PersonaDTO personaDTO) {
        personaDTO.setId(id); // Establecer el ID de la persona en el DTO
        personaService.actualizarPersona(personaDTO.convertToEntity());
        return new ResponseEntity<>(personaDTO, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminarPersona(@PathVariable("id") long id) {
        personaService.eliminarPersona(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
