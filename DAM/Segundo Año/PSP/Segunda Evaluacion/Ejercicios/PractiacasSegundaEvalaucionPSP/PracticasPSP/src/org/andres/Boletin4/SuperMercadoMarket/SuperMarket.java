package org.andres.Boletin4.SuperMercadoMarket;

import java.util.Random;
import java.util.Scanner;

public class SuperMarket {
    /**
     * Escribe una clase SuperMarket que implemente el funcionamiento de N
     * cajas de un supermercado
     * . Los M clientes del supermercado estarán un tiempo aleatorio comprando y
     * con posterioridad seleccionán de forma aleatoria en qué caja poscionarse
     * para situarse en su cola correspondiente.
     * . Cuando les toque el turno serán atendidos, procediendo el pago
     * correspodiente e ingresando en la variable Resultados del supermercado.
     *
     * Se deben crear tantos theads como cleintes haya y los parámetros M y N se deben
     * leer por entrada estándar. Para simplicar la implementación, el valor de pago de
     * cada cliente puede ser aleatorio en el momento de su pago.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n_Clientes, n_Cajas;

        System.out.println("Intrdouzca númmero de clientes");
        n_Clientes = teclado.nextInt();
        System.out.println("Introduzca número de cajas");
        n_Cajas = teclado.nextInt();

        Caja cajas[] = new Caja[n_Cajas];
        for (int i=0; i<n_Cajas; i++) {
            cajas[i] = new Caja(i);
        }
        Cliente clientes[] = new Cliente[n_Clientes];
        for (int i=0; i<n_Clientes; i++) {
            //Selecciona ya que están en caja se situará
            int j= new Random().nextInt(n_Cajas);
            clientes[i] = new Cliente(i, cajas[j]);
            clientes[i].start();
        }
        try {
            for (int i=0; i<n_Clientes; i++) {
                clientes[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrupido.");
        }
        System.out.println("Supermercado cerrado.");
        System.out.println("Ganancias: " + ResultadoTotales.ganancias);
    }
}
