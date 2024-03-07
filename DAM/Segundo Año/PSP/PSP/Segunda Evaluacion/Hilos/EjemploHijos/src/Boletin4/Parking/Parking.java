package Boletin4.Parking;

import java.util.Random;
import java.util.Scanner;

/*
Escribe una clase llamada Parking que solicite el numero de plazas del parking
 y el numero de coches existentes en el sistema.Se debe crear tantos threads
 como coches haya.
 .El parking dispondra de una unica entrada y unica salida
 .En la entrada de vehiculos habra un dispositivo de control
 que permita o impida el acceso de los mismos al parking,
 dependiendo del estado acutal del mismo(plazas de aparcamiento diponibles)
 .Los tiempos de espera de los vehiculos dentro del parking son aleatorios
 .En el momento en el que un vehiculo sale del parking,notifica al dipositivo
 de control el numero de la plaza que tenia asignada y se libera la plaza que
 estuviera ocupando,quedando asi estas nuevamente disponibles
 .Un vehiculo que ha salido del parking esparara un tiempo aleatorio para volver
 a entrar nuevamente en el mismo
 .Por tanto, los vehiculos estaran entrando y saliendo indefinidamente del parking
 .Es importante que se diseñe el programa de tal forma que se asegure que,
 antes o despues un vehiculo que permanece esperando a la entrada del parking
 entrara en el mismo(no se produzca inanicion)
 */
public class Parking {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero de clientes");
        int nClientes = sc.nextInt();
        System.out.println("Introduzca numero de cajas");
        int nPlazas = sc.nextInt();

        Plazas cajas[] = new Plazas[nPlazas];

        for (int i=0; i <nPlazas; i++) {
            cajas[i] = new Plazas(i);
        }
        Cliente clientes[] = new Cliente[nPlazas];
        for (int i=0; i<nClientes; i++) {
            int j = new Random().nextInt();
            clientes[i] = new Cliente(i, cajas[j]);
            clientes[i].start();
        }
        try {
            for (int i=0; i<nClientes; i++) {
                clientes[i].join();
            }
        }catch (InterruptedException ex) {
            System.out.println("Hilo principal interrupido.");
        }
        System.out.println("Supermercado cerrado.");
        System.out.println("Ganncias: " + ResultadosTotales.ganacias);

    }
}

