package org.andres.Ejercicios.Examen.ejercicio2;

public class Juez extends Thread{
    private String nombreJuez;
    private Carrera carrera;

    public Juez(String nombreJuez, Carrera carrera) {
        this.nombreJuez = nombreJuez;
        this.carrera = carrera;
    }

    @Override
    public void run(){
        carrera.listos();
        while (carrera.llegaron()<carrera.numcorredores()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }catch (IllegalMonitorStateException ex){

            }

        }
        carrera.setSalida(true);

    }
}
