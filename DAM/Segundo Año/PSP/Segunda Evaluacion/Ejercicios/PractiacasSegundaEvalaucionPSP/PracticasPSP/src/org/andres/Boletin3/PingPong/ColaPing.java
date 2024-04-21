package org.andres.Boletin3.PingPong;

public class ColaPing {
    private String pinpon;
    private boolean disponible = false;

    public synchronized  String get() {
        while (!disponible) {
            try {
                wait();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        disponible = false;
        notifyAll();
        return pinpon;
    }

    public synchronized void put(String valor) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pinpon = valor;
        disponible = true;
        notifyAll();
    }
}
