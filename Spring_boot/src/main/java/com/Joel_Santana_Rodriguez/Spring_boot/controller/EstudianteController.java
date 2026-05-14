package com.Joel_Santana_Rodriguez.Spring_boot.controller;

import com.Joel_Santana_Rodriguez.Spring_boot.model.Estudiante;
import com.Joel_Santana_Rodriguez.Spring_boot.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return service.guardarEstudiante(estudiante);
    }

    @GetMapping
    public List<Estudiante> listarTodos() {
        return service.obtenerTodos();
    }
}
