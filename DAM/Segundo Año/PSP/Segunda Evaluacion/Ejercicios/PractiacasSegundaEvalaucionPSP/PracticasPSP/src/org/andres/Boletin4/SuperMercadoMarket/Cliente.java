package org.andres.Boletin4.SuperMercadoMarket;

import java.util.Random;

public class Cliente extends Thread{
    private static final int MAX_DELAY = 2000;
    private static final int MAX_COST = 1000;
    private int id;
    private Caja caja;

    Cliente(int id, Caja caja) {
        this.id = id;
        this.caja = caja;
    }

    public void run() {
        try {
            System.out.println("Cliente " + id + " realizado compra");
            Thread.sleep(new Random().nextInt(MAX_DELAY));

            caja.esperarEnCola(id);
            System.out.println("Cliente " + id  + " en cola de la caja " + caja.inicioCola);
            //caja.imprimir();
           caja.atender(new Random().nextInt(MAX_COST));
            System.out.println("Cliente " + id + " atendido y saliendo");

        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
}
