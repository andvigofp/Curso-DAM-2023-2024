package org.andres.Boletin4.ParkingCamiones;

import java.util.Scanner;

public class ParkingCamion {
    public static void main(String[] args)  {
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Introduzca número de coches");
        int nCoches = teclado.nextInt();
        System.out.println("Introduzca número de camiones");
        int Camiones = teclado.nextInt();
        System.out.println("Introduzca número plazas");
        int nPlazas = teclado.nextInt();

        //Inicializar el parking
        Barrera barrera = new Barrera(nPlazas);
        Coche coches[] = new Coche[nCoches];
        for (int i=0; i<nCoches;  i++) {
            coches[i] = new Coche(1 + 1, barrera);
            coches[i].start();
        }
        Camion camiones[] = new Camion[Camiones];
        for (int i=0; i<Camiones; i++) {
            camiones[i] = new Camion(1 + 100, barrera);
            camiones[i].start();
        }

        try {
            for (int i=0; i<nCoches; i++) {
                coches[i].join();
            }
            for (int i=0; i<Camiones; i++) {
                camiones[i].join();
            }
        }catch (InterruptedException ex) {
            System.out.println("Hilo principal interrumpido.");
        }
    }
}
