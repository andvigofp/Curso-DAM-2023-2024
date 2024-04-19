package org.andres.Ejercicios.Examen.CincoAtletas;

import java.util.Random;

public class Atletas extends Thread{
    private String nombre;
    private Carrera carrera;
    private Random random = new Random();

    public Atletas(String nombre, Carrera carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public void run() {
        try {
            Thread.sleep(random.nextInt(2000)); // Espera un tiempo aleatorio antes de llegar a la línea de salida
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + " ha llegado a la línea de salida.");
        carrera.esperarJuez();
        correr();
        System.out.println(nombre + " ha terminado la carrera.");
    }

    private void correr() {
        try {
            Thread.sleep(random.nextInt(5000)); // Simula el tiempo de carrera aleatorio
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}