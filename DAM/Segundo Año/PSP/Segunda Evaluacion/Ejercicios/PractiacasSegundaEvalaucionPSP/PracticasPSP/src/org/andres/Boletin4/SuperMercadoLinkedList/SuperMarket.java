package org.andres.Boletin4.SuperMercadoLinkedList;

import org.andres.Boletin4.SuperMercadoMarket.ResultadoTotales;

import java.util.Random;
import java.util.Scanner;

public class SuperMarket {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int M,N;

        System.out.println("Introduzca número de  clientes.");
        M = teclado.nextInt();
        System.out.println("Introduzca número de cajas.");
        N = teclado.nextInt();

        Caja cajas[] = new Caja[N];
        for (int i=0; i<N;  i++) {
            cajas[i] = new Caja(i);
        }
        Cliente clientes[] = new Cliente[M];
        for (int i=0; i<M; i++) {
            //Seleccionamos ya en qué caja se situara
            int j = new Random().nextInt(N);
            clientes[i] = new Cliente(i, cajas[j]);
            clientes[i].start();
        }
        try {
            for (int i=0; i<M;  i++) {
                clientes[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Supermercado cerrado.");
        System.out.println("Ganacias " + ResultadoTotales.ganancias);
    }
}
