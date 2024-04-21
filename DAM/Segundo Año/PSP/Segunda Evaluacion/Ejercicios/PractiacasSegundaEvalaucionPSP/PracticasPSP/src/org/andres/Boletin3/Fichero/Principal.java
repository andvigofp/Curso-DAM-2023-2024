package org.andres.Boletin3.Fichero;

public class Principal {
    public static void main(String[] args) {
        Compartido cola = new Compartido();

        Productor p = new Productor(cola, "Fichero.txt");
        Consumidor c1 = new Consumidor(cola,1);
        Consumidor c2 = new Consumidor(cola,2);
        Consumidor c3 = new Consumidor(cola,3);

        p.start();
        c1.start();
        c2.start();
        c3.start();

        try {
            p.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Estado Consumidor 1: " +  c1.getState());
        System.out.println("Estado Consumidor 2: " + c2.getState());
        System.out.println("Estado Consumidor 3: " + c3.getState());

        if (c1.isAlive())  {
            cola.put(-1);
            c1.interrupt();
        }

        if (c2.isAlive()) {
            cola.put(-1);
            c2.interrupt();
        }

        if (c3.isAlive()) {
            cola.put(-1);
            c3.interrupt();
        }
    }
}
