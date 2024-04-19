package org.andres.Ejercicios.Examen.CincoAtletas;

public class Carrera {
    public synchronized void esperarJuez() {
        try {
            wait(); // Espera la señal del juez
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void darSalida() {
        System.out.println("¡Comienza la carrera!");
        notifyAll(); // Da la señal a todos los atletas para que comiencen
    }
}
