package Boletin4.SuperMarket;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
public class SuperMarket {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero de clientes");
        int M = sc.nextInt();
        System.out.println("Introduzca numero de cajas");
        int N = sc.nextInt();

        Caja cajas[] = new Caja[N];
        for (int i = 0; i < N; i++) {
            cajas[i] = new Caja(i);
        }
        Cliente clientes[] = new Cliente[M];
        for (int i = 0; i < M; i++) {
            // Seleccionamos ya en qué caja se situara
            int j = new Random().nextInt(N);
            clientes[i] = new Cliente(i, cajas[j]);
            clientes[i].start();
        }
        try {
            for (int i = 0; i < M; i++) {
                clientes[i].join();
            }
        } catch (InterruptedException ex) {
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Supermercado cerrado.");
        System.out.println("Ganancias: " + ResultadosTotales.ganancias);
    }

}
