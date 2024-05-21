package Examen.ParqueAtracciones;

import java.io.Serializable;

public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L; // Identificador de versión para serialización
    private String nombre;
    private int tipoEntrada;

    public Ticket() {
    }

    public Ticket(String nombre, int tipoEntrada) {
        this.nombre = nombre;
        this.tipoEntrada = tipoEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(int tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public String toString() {
        return "Tiquet{" +
                "nombre='" + nombre + '\'' +
                ", tipoEntrada=" + tipoEntrada +
                '}';
    }
}
