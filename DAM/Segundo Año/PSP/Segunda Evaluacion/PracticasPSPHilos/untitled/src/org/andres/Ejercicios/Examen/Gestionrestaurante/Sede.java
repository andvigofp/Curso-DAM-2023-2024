package org.andres.Ejercicios.Examen.Gestionrestaurante;

import java.util.Random;

public class Sede extends Thread{
    private int sedeId;
    private FondoComun fondo;
    private Random random = new Random();

    public Sede(int sedeId, FondoComun fondo) {
        this.sedeId = sedeId;
        this.fondo = fondo;
    }

    public void run() {
        int totalRecaudado = 0;
        for (int i = 0; i < 40; i++) {
            int cobro = generarCobroAleatorio();
            totalRecaudado += cobro;
            fondo.incrementar(cobro);
            System.out.println("Sede " + sedeId + ": Cobro realizado por $" + cobro);
            try {
                Thread.sleep(3000); // Descanso de 3 segundos entre cobros
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sede " + sedeId + ": Total recaudado hoy $" + totalRecaudado);
    }

    private int generarCobroAleatorio() {
        return random.nextInt(100) + 50; // Cobro aleatorio entre $50 y $149
    }
}
