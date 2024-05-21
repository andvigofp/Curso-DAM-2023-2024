package Boletines.Boletin2.Ej1;

import java.io.Serializable;
import java.util.Arrays;

public class Profesor implements Serializable {
    private int idPorofesor;
    private String nombre;
    private Asignatura[] asignaturas;
    private Especialidad espe;

    public Profesor() {
        super();
    }

    public Profesor(int idPorofesor, String nombre, Asignatura[] asignaturas, Especialidad espe) {
        super();
        this.idPorofesor = idPorofesor;
        this.nombre = nombre;
        this.asignaturas = asignaturas;
        this.espe = espe;
    }

    public int getIdPorofesor() {
        return idPorofesor;
    }

    public void setIdPorofesor(int idPorofesor) {
        this.idPorofesor = idPorofesor;
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
                "idPorofesor=" + idPorofesor +
                ", nombre='" + nombre + '\'' +
                ", asignaturas=" + Arrays.toString(asignaturas) +
                ", espe=" + espe +
                '}';
    }
}
