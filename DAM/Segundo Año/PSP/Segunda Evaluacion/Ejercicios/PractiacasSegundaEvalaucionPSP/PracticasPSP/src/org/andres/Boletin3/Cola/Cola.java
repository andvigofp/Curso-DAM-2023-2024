package org.andres.Boletin3.Cola;

public class Cola {
    private int numero;
    private boolean disponible=false;

    public synchronized  int get() {
        if (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponible = false;
        notify();
        return numero;
    }

    public synchronized void put(int valor) {
        if (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        numero = valor;
        disponible=true;
        notify();
    }
}
