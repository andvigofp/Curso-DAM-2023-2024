package org.andres.Ejercicios.Examen.CincoAtletas;

public class Juez extends Thread{
    private Carrera carrera;

    public Juez(Carrera carrera) {
        this.carrera = carrera;
    }

    public void run() {
        try {
            Thread.sleep(2000); // El juez espera 2 segundos antes de dar la señal
            carrera.darSalida();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

