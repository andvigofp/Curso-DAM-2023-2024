package org.andres.Boletin3.Clase;

public class Alumno extends Thread{
Bienvenida saludo;
int numAluno;

    public Alumno(Bienvenida saludo, int numAluno) {
        this.saludo = saludo;
        this.numAluno = numAluno;
    }

    public void run() {
        System.out.println("Alumno " + numAluno + " llego");
        try {
            Thread.sleep(1000);
            saludo.entrarySaludar(numAluno);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
