package org.andres.Boletin3.PingPong;

public class Productor extends Thread{
    private ColaPing cola;

    public Productor(ColaPing cola) {
        this.cola = cola;
    }

    public void run() {
        String cadena = " ";
        for (int i=0; i<40; i++) {
            if (i %2 ==0)
                cadena = " PING ";
            else
                cadena = " PONG ";

            cola.put(cadena);
        }
    }
}
