package org.andres.Boletin3.Fichero;

public class Consumidor extends Thread{
    private Compartido compartido;
    private int n;

    public Consumidor(Compartido c, int n) {
        this.compartido = c;
        this.n = n;
    }

    public void run() {
        char valor;
        int i= compartido.get();
        while (i !=-1) {
            System.out.printf("%c  [%d] %n", (char) i,n);
            i = compartido.get();
        }
        System.out.println("\nFin consumidor " + n);
    }
}
