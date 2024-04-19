package org.andres.Ejercicios.Examen.ejercicio1;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Sede>listasedes=new ArrayList<>();
        Fondo fondo=new Fondo(0);
        for (int i=0;i<4;i++)listasedes.add(new Sede(String.valueOf(i),fondo));
        for (Sede sede:listasedes) sede.start();
        try {
        for (Sede sede:listasedes) sede.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println("Los ingresos en el fondo suman "+fondo.saldo());
    }
}