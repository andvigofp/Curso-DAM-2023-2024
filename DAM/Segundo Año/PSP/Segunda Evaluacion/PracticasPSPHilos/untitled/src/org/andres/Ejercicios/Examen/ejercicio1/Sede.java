package org.andres.Ejercicios.Examen.ejercicio1;

import java.util.Random;

public class Sede extends Thread{
    private String nombresede;
    private Fondo fondo;

    public Sede(String nombresede, Fondo fondo) {
        this.nombresede = nombresede;
        this.fondo = fondo;
    }

    @Override
    public void run(){
        System.out.println("Abre sede "+nombresede);
        int totalSede=0;
        for (int i=0;i<40;i++) {
            int ingreso=new Random().nextInt(100);
            fondo.ingresar(ingreso);
            totalSede+=ingreso;
            System.out.println("Sede "+nombresede+" ingresa "+ingreso+" en su cobro "+(i+1));
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Error al dormir el hilo "+currentThread().getName());
            }
        }
        System.out.println("La sede "+nombresede+" ha ingresado "+totalSede);
    }

}
