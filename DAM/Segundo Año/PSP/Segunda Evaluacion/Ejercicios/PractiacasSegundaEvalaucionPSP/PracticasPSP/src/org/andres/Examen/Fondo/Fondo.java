package org.andres.Examen.Fondo;

public class Fondo {
   private double cantidad;
   private String nombre;

    public Fondo( String nombre) {
        this.nombre = nombre;
    }

    public synchronized void sumarCantidad(double importe) {
        cantidad+=importe;
    }

    public double getCantidad() {
        return cantidad;
    }
}
