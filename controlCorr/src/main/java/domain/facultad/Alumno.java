package domain.facultad;

import java.util.List;

public class Alumno {
    private String nombre;
    private String apellido;
    private List<Materia> materias;

    public Alumno(String nombre, String apellido, List<Materia> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
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

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Boolean aproboCorrelativasDe(Materia materia) {
        return this.materias.containsAll(materia.getCorrelativas());
    }

}