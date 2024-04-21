package org.andres.Examen.CajaCentral;

public class CajaCentral {
    private double cantidad;

    public CajaCentral() {
        this.cantidad =0;
    }

    public synchronized double  getCantidad() {
        return cantidad;
    }

    public synchronized void facturar(double cant) {
        cantidad +=cant;
    }
}
