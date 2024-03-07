package Ejercicio2;

import java.util.TreeMap;

public class Consumidor extends Thread {
    private Cola cola;
    private int numero;

    public Consumidor(Cola cola, int numero) {
        this.cola = cola;
        this.numero = numero;
    }

    public void run() {
        int valor=0;
        for (int i=1; i<=10; i++) {
            valor = cola.vacio();
            System.out.println("Consumidor " + numero + " toma valor " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("Interrupción del hilo...");
        }
    }
}
