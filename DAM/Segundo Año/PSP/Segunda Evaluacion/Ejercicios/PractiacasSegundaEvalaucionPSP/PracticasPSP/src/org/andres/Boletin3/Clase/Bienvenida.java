package org.andres.Boletin3.Clase;

public class Bienvenida {
    boolean claseComenzada;

    public Bienvenida() {
        this.claseComenzada = false;
    }

    public synchronized void entrarySaludar(int num) {
        try {
            if (!claseComenzada) {
                wait();
            }
            System.out.println("Alumno " + num + ": Buenos días profesor");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void llegadaProfesor(String nombre) {
        System.out.println("Buenos días a todos. Soy " + nombre);
        this.claseComenzada = true;
        notifyAll();
    }
}
