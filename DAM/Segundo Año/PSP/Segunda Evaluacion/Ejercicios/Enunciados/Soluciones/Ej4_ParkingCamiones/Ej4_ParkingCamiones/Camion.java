package Ej4_ParkingCamiones;

import java.util.Random;

public class Camion extends Thread {
    private static final int MAX_DELAY = 2000;
    private int id;
    private Barrera barrera;

    Camion(int id, Barrera bar) {
        this.id = id;
        this.barrera = bar;
    }

    public void run() {
        try {
            Thread.sleep(new Random().nextInt(MAX_DELAY));
            System.out.println("Camion " + id + " intenta entrar en parking");

            int plaza = barrera.entrada_camion(id);
            System.out.println("Camion " + id + " aparcado en plazas " + plaza + " y " + (plaza + 1));
            barrera.imprimirEstadoParking();

            Thread.sleep(new Random().nextInt(MAX_DELAY));
            barrera.salida_camion(plaza);
            System.out.println("Camion " + id + " saliendo");
            barrera.imprimirEstadoParking();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
