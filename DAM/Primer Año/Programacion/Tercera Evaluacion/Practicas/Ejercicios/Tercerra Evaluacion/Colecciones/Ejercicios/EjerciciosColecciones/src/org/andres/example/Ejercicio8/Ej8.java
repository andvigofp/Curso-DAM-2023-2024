package org.andres.example.Ejercicio8;

import java.util.List;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos de la clase Carta).
 * Emplea un objeto de la clase ArrayList para almacenarlas y asegúrate de que no se repite ninguna.
 */
public class Ej8 {
    public static void main(String[] args) {
        List<Cartas> baraja = MEJ8.generarBaraJa();
        List<Cartas> cartasElegidas = MEJ8.elegirCartas(baraja,10);

        // Imprimir las cartas generadas
        System.out.println("Las 10 cartas elegidas al azar son: ");
        for (Cartas carta : cartasElegidas) {
            System.out.println(carta);
        }
    }
}
