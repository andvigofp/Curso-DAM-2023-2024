package org.andres_example.Practicas.UDP.Curso;

import java.io.Serializable;

public class Curso implements Serializable {
    private String id;
    private String descripcion;

    public Curso() {
        super();
    }

    public Curso(String id, String descripcion) {
        super();
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
