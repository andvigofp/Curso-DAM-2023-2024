package org.andres.Ejercicios.Examen.Gestionrestaurante;

public class FondoComun {
    private int importeTotal = 0;

    public synchronized void incrementar(int cantidad) {
        importeTotal += cantidad;
    }

    public synchronized int consultar() {
        return importeTotal;
    }
}
