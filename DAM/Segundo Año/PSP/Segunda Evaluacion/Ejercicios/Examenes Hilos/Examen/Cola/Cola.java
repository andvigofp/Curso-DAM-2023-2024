package org.andres.Examen.Cola;

public class Cola {
    private String frase;
   private boolean disponible=false;

    public Cola() {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public synchronized void get() throws InterruptedException {
        while (!disponible) {
            wait();
        }
        System.out.println("Se  consume " + frase);
        disponible=false;
        notifyAll();
    }

    public synchronized void put(String cadena) {
        while (disponible) {
            try {
                wait();
            }catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        }
        System.out.println("Se produce " + cadena);
        frase=cadena;
        disponible=true;
        notify();
    }
}
