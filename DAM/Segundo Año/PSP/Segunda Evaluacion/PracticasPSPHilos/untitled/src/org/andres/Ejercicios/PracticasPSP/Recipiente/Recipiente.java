package org.andres.Ejercicios.PracticasPSP.Recipiente;

public class Recipiente {
    private String cadena;
    private boolean lleno=false;

    public synchronized void producir(String frase) {
        while (lleno==true) {
            try {
                wait();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lleno=true;
        cadena=frase;
        notifyAll();
    }

    public synchronized String consumir() {
        while (lleno==false) {
            try {
                wait();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lleno=false;
        notifyAll();
        return cadena;
    }
}
