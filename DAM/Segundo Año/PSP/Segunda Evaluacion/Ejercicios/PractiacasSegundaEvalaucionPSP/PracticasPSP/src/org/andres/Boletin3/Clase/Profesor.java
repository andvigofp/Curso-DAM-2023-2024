package org.andres.Boletin3.Clase;

public class Profesor extends Thread{
    Bienvenida saludo;
    String nombre;

    public Profesor(Bienvenida saludo, String nombre) {
        this.saludo = saludo;
        this.nombre = nombre;
    }

    public void run() {
        System.out.println("Profesor " + nombre + " llegó");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
