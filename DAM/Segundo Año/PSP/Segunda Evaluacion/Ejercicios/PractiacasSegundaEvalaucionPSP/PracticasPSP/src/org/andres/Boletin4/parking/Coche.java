package org.andres.Boletin4.parking;

import java.util.Random;

public class Coche extends Thread{
    private static final int MAX_DELAY =2000;
    private int id;
    private Barrera barrera;

    Coche(int id, Barrera barrera) {
        this.id =id;
        this.barrera = barrera;
    }

    public void run() {
        try {
            Thread.sleep(new Random().nextInt(MAX_DELAY));
            System.out.println("Coche " + id + " intenta entrar en el parking");

            int plaza = barrera.entradaCoches(id);
            System.out.println("Coche " + id + " aparcando en " + plaza);
            barrera.imprimirEstadoParking();

            Thread.sleep(new Random().nextInt(MAX_DELAY));
            barrera.saleCoche(plaza);
            System.out.println("Coche " + id + " saliendo");
            barrera.imprimirEstadoParking();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
