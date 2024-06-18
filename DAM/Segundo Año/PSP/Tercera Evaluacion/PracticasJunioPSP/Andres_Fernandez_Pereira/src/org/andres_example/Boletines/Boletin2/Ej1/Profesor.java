package org.andres_example.Boletines.Boletin2.Ej1;

import java.io.Serializable;
import java.util.Arrays;

public class Profesor implements Serializable {
    private int idProfesor;
    private String nombre;
    private Asignatura[] asignaturas;
    private Especialidad espe;

    public Profesor() {
        super();
    }

    public Profesor(int idProfesor, String nombre, Asignatura[] asignaturas, Especialidad espe) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.espe = espe;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Especialidad getEspe() {
        return espe;
    }

    public void setEspe(Especialidad espe) {
        this.espe = espe;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idProfesor=" + idProfesor +
                ", nombre='" + nombre + '\'' +
                ", asignaturas=" + Arrays.toString(asignaturas) +
                ", espe=" + espe +
                '}';
    }
}
