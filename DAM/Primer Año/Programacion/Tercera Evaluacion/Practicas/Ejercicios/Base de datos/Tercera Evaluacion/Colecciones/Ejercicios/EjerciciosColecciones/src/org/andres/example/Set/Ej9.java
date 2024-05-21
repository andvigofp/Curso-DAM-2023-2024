package org.andres.example.Set;


import org.andres.example.Metodos.MEJ9;
import org.andres.example.Modelo.Cartas2_Ej9;

import java.util.List;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán
 * por palo: bastos, copas, espadas, oros. Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7,
 * sota, caballo, rey.
 */
public class Ej9 {
    public static void main(String[] args) {
        List<Cartas2_Ej9> baraja = MEJ9.generarBaraja();
        MEJ9.ordenarCartas(baraja);

        // Imprimir las cartas generadas
        System.out.println("Las 10 cartas elegidas al azar son: ");
        for (Cartas2_Ej9 carta : baraja) {
            System.out.println(carta);
        }
    }
}
