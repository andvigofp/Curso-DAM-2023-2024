package org.andres.Ejercicios.PracticasPSP.CajaCentral;

public class CajaCentral {
    private double cantidad;

    public CajaCentral() {
        this.cantidad = 0;
    }

    public double getCantidad() {
        return cantidad;
    }

    public synchronized void facturar(double cant) {
        cantidad+=cant;
    }
}
