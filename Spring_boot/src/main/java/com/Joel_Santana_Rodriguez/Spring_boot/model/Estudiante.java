package com.Joel_Santana_Rodriguez.Spring_boot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "estudiantes")
@Data
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //IA
    @NotBlank(message = "El nombre no puede estar vacío")
    private String nombre;

    @Email(message = "El email debe ser válido")
    @NotBlank(message = "El email no puede estar vacío")
    private String email;

    @Min(value = 1, message = "La edad debe ser mayor que 0")
    private int edad;
}
