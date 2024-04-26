package org.andres.example.Ejercicio9;


import java.util.ArrayList;
import java.util.List;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán
 * por palo: bastos, copas, espadas, oros. Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7,
 * sota, caballo, rey.
 */
public class Ej9 {
    public static void main(String[] args) {
        List<Cartas> baraja = MEJ9.generarBaraja();
        MEJ9.ordenarCartas(baraja);

        // Imprimir las cartas generadas
        System.out.println("Las 10 cartas elegidas al azar son: ");
        for (Cartas carta : baraja) {
            System.out.println(carta);
        }
    }
}
