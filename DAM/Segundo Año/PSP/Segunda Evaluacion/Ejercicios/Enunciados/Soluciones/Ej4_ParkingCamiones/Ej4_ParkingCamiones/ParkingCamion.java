package Ej4_ParkingCamiones;

import java.util.Scanner;

public class ParkingCamion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero de coches");
        int nCoches = sc.nextInt();
        System.out.println("Introduzca numero de camiones");
        int Camiones = sc.nextInt();
        System.out.println("Introduzca numero de plazas");
        int nPlazas = sc.nextInt();

        //Inicializar el parking
        Barrera barrera = new Barrera(nPlazas);
        Coche coches[] = new Coche[nCoches];
        for (int i = 0; i < nCoches; i++) {
            coches[i] = new Coche(i + 1, barrera);
            coches[i].start();
        }
        Camion camiones[] = new Camion[Camiones];
        for (int i = 0; i < Camiones; i++) {
            camiones[i] = new Camion(i + 100, barrera);
            camiones[i].start();
        }
        try {
            for (int i = 0; i < nCoches; i++) {
                coches[i].join();
            }
            for (int i = 0; i < Camiones; i++) {
                camiones[i].join();
            }
        } catch (InterruptedException ex) {
            System.out.println("Hilo principal interrumpido.");
        }
    }
}
