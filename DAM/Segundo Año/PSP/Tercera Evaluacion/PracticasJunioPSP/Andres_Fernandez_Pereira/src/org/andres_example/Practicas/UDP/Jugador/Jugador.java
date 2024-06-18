package org.andres_example.Practicas.UDP.Jugador;

import java.io.Serializable;

public class Jugador implements Serializable {
    private int id;
    private String nombre;
    private String apellido;
    private String posicion;
    private int goles;


    public Jugador() {
        super();
    }

    public Jugador(int id, String nombre, String apellido, String posicion, int goles) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.goles = goles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion='" + posicion + '\'' +
                ", goles=" + goles +
                '}';
    }
}
