package org.andres.Boletin4.ParkingCamiones;

import java.util.Random;

public class Camion extends Thread{
    private static final int MAX_DELAY=2000;
    private int id;
    private Barrera barrera;

    Camion(int id, Barrera bar) {
        this.id = id;
        this.barrera = bar;
    }

    public void run() {
            try {
                Thread.sleep(new Random().nextInt(MAX_DELAY));
                System.out.println("Camión " + id + " intenta entrada en parking");

                int plaza = barrera.entraCoches(id);
                System.out.println("Camión " + id + " aparcado en " + plaza + " y " + (plaza + 1));
                barrera.imprimirEstadoParking();

                Thread.sleep(new Random().nextInt(MAX_DELAY));
                barrera.salidaCamion(plaza);
                System.out.println("Camión " + id + " saliendo");
                barrera.imprimirEstadoParking();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


