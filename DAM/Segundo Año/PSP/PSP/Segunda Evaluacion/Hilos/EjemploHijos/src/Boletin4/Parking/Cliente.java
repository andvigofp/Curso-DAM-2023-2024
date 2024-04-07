package Boletin4.Parking;

import java.util.Random;

public class Cliente extends Thread{
    private static final int MAX_DELAY=2000;
    private static final int MAX_COST = 100;
    private int id;
    private Plazas plazas;

    Cliente(int id, Plazas plazas) {
        this.id= id;
        this.plazas = plazas;
    }

    public void run() {
        try {
            System.out.println("Cliente " + id + " realizando compra");
            Thread.sleep(new Random().nextInt(MAX_DELAY));
            plazas.impprimir;
            plazas.atender(new Random().nextInt(MAX_COST));
            System.out.println("Cliente " + id + " atendiendo y saliendo ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
