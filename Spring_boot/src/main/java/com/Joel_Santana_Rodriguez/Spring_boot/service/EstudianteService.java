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

    //IA

    public Estudiante actualizarEstudiante(Long id, Estudiante datos) {
        Estudiante existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado con id: " + id));
        existente.setNombre(datos.getNombre());
        existente.setEmail(datos.getEmail());
        existente.setEdad(datos.getEdad());
        return repository.save(existente);
    }

    public void eliminarEstudiante(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Estudiante no encontrado con id: " + id);
        }
        repository.deleteById(id);
    }
}
