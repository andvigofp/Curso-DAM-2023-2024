package org.andres.Examen.Caja;

public class Caja {
    private double importe=0;
    private String nombre;

    public Caja(String nombre) {
        this.nombre = nombre;
    }

    public synchronized void sumarImporte(double importe) {
        this.importe +=importe;
    }

    public double mostarImporte() {
        return importe;
    }
}
