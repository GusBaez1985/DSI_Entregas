package domain.facultad;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void testInscricionesAprobadas() {
        // Materias
        Materia algoritmos = new Materia("Algoritmos", List.of());
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        Materia disenio = new Materia("Diseño", List.of(paradigmas));

        // alumno que aprobo Algoritmo y Paradigma
        Alumno pepeLui = new Alumno("Pepe", "Lui", List.of(algoritmos, paradigmas));

        // Inscripcion a Diseño
        Inscripcion inscripcion = new Inscripcion(pepeLui);
        inscripcion.getMaterias().add(disenio);

        assertTrue(inscripcion.aprobada());
        }
    @Test
    public void testInscripcionNoAprobada() {
        // Materias
        Materia algoritmos = new Materia("Algoritmos", List.of());
        Materia paradigmas = new Materia("Paradigmas", List.of(algoritmos));
        Materia disenio = new Materia("Diseño", List.of(paradigmas));

        // Alumno que aprobó solo Algoritmos
        Alumno juan = new Alumno("Juan", "Cruz", List.of(algoritmos));

        // Inscripción a Diseño
        Inscripcion inscripcion = new Inscripcion(juan);
        inscripcion.getMaterias().add(disenio);

        // Validación
        assertFalse(inscripcion.aprobada());
    }

}