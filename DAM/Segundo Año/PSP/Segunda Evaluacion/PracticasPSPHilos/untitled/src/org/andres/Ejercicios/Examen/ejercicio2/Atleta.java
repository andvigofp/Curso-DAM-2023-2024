package org.andres.Ejercicios.Examen.ejercicio2;

import java.util.Random;

public class Atleta extends Thread{
    private int idAtleta;
    private Carrera carrera;

    public Atleta(int idAtleta, Carrera carrera) {
        this.idAtleta = idAtleta;
        this.carrera=carrera;
    }

    @Override
    public void run(){
        System.out.println("se inicia "+idAtleta);
        try {
            sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("LLega atleta "+idAtleta);
        carrera.listos();
        while (!carrera.salida()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (IllegalMonitorStateException ex){

            }
        }
        try {

            sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El corredor "+idAtleta+" ha llegado");
    }
}
