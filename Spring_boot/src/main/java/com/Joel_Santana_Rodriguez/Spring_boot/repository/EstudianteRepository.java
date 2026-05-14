package com.Joel_Santana_Rodriguez.Spring_boot.repository;

import com.Joel_Santana_Rodriguez.Spring_boot.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
