package org.andres.Boletin4.parking;

import java.util.Scanner;

public class Parking {
    /**
     *
     * Escribe una clase llamada Parking que solicite el numero de plazas del parking
     *  y el numero de coches existentes en el sistema.Se debe crear tantos threads
     *  como coches haya.
     *  .El parking dispondra de una unica entrada y unica salida
     *  .En la entrada de vehiculos habra un dispositivo de control
     *  que permita o impida el acceso de los mismos al parking,
     *  dependiendo del estado acutal del mismo(plazas de aparcamiento diponibles)
     *  .Los tiempos de espera de los vehiculos dentro del parking son aleatorios
     *  .En el momento en el que un vehiculo sale del parking,notifica al dipositivo
     *  de control el numero de la plaza que tenia asignada y se libera la plaza que
     *  estuviera ocupando,quedando asi estas nuevamente disponibles
     *  .Un vehiculo que ha salido del parking esparara un tiempo aleatorio para volver
     *  a entrar nuevamente en el mismo
     *  .Por tanto, los vehiculos estaran entrando y saliendo indefinidamente del parking
     *  .Es importante que se diseñe el programa de tal forma que se asegure que,
     *  antes o despues un vehiculo que permanece esperando a la entrada del parking
     *  entrara en el mismo(no se produzca inanicion)
     *  */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nCoches, nPlazas;

        System.out.println("Intrdouzca número de coches:");
        nCoches = teclado.nextInt();
        System.out.println("Introduzca número de plazas: ");
        nPlazas = teclado.nextInt();

        Barrera barrera = new Barrera(nPlazas);
        Coche coche[] = new Coche[nCoches];

        for (int i=0; i<nCoches; i++) {
            coche[i] = new Coche(i + 1, barrera);
            coche[i].start();
        }
        try {
            for (int i=0; i<nCoches; i++) {
                coche[i].join();
            }
        }catch (InterruptedException ex) {
            System.out.println("Hilo principal interrumpido.");
        }
    }

}
