package com.Joel_Santana_Rodriguez.Spring_boot.service;

import com.Joel_Santana_Rodriguez.Spring_boot.model.Estudiante;
import com.Joel_Santana_Rodriguez.Spring_boot.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    public List<Estudiante> obtenerTodos() {
        return repository.findAll();
    }
}
