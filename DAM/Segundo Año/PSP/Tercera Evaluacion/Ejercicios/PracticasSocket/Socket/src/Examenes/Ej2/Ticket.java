package Examenes.Ej2;

import java.io.Serializable;

public class Ticket implements Serializable {
    private static final long serialVersionUID = 1L; // Identificador de versión para serialización
    private String nombre;
    private int tipoEntrada;

    public Ticket(String nombre, int tipoEntrada) {
        this.nombre = nombre;
        this.tipoEntrada = tipoEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipoEntrada() {
        return tipoEntrada;
    }


}
