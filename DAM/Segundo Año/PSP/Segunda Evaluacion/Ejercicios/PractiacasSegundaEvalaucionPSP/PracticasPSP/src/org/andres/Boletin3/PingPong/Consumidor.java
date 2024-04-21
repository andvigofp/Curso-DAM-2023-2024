package org.andres.Boletin3.PingPong;

public class Consumidor extends Thread{
    private ColaPing cola;

    public Consumidor(ColaPing cola) {
        this.cola = cola;
    }

    public void run() {
        String valor = " ";
        for (int i=0; i<40; i++) {
            valor = cola.get();
            System.out.print(valor);
        }
    }
}
