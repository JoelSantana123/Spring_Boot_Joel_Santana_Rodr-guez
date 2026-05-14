package com.Joel_Santana_Rodriguez.Spring_boot.controller;

import com.Joel_Santana_Rodriguez.Spring_boot.model.Estudiante;
import com.Joel_Santana_Rodriguez.Spring_boot.service.EstudianteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;  //Intenté usar @WebMvcTest pero ha cambiado en las nuevas versiones
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class EstudianteControllerTest {

    @Mock
    private EstudianteService service;

    @InjectMocks
    private EstudianteController controller;

    @Test
    void testListarTodos() {
        Estudiante e = new Estudiante();
        e.setNombre("Ana");
        when(service.obtenerTodos()).thenReturn(List.of(e));

        List<Estudiante> result = controller.listarTodos();

        assertEquals(1, result.size());
        assertEquals("Ana", result.get(0).getNombre());
        verify(service, times(1)).obtenerTodos();
    }

    @Test
    void testCrearEstudiante() {
        Estudiante e = new Estudiante();
        e.setNombre("Juan");
        when(service.guardarEstudiante(any(Estudiante.class))).thenReturn(e);

        Estudiante result = controller.crear(new Estudiante());

        assertNotNull(result);
        assertEquals("Juan", result.getNombre());
        verify(service, times(1)).guardarEstudiante(any(Estudiante.class));
    }
}
