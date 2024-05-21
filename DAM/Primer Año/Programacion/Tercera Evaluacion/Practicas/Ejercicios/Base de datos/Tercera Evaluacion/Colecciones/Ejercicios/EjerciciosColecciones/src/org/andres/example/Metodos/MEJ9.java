package org.andres.example.Metodos;

import org.andres.example.Modelo.Cartas2_Ej9;

import java.util.*;

public class MEJ9 {
    // Método para generar 10 cartas de la baraja española sin repetir
    public static List<Cartas2_Ej9> generarBaraja() {
        ArrayList<Cartas2_Ej9> baraja = new ArrayList<>();

        Cartas2_Ej9 cartaAux = new Cartas2_Ej9();
        baraja.add(cartaAux);

        for (int i=0; i<9; i++) {
            do {
                cartaAux = new Cartas2_Ej9();
            }while (baraja.contains(cartaAux));
            baraja.add(cartaAux);
        }

        return baraja;
    }

    // Método para ordenar las cartas
    public static void ordenarCartas(List<Cartas2_Ej9> baraja) {
        Collections.sort(baraja);
    }
}
