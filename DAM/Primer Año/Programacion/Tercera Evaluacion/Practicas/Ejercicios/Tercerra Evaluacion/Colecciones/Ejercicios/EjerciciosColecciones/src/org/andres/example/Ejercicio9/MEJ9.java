package org.andres.example.Ejercicio9;

import java.util.*;

public class MEJ9 {
    // Método para generar 10 cartas de la baraja española sin repetir
    public static List<Cartas> generarBaraja() {
        ArrayList<Cartas> baraja = new ArrayList<>();

        Cartas cartaAux = new Cartas();
        baraja.add(cartaAux);

        for (int i=0; i<9; i++) {
            do {
                cartaAux = new Cartas();
            }while (baraja.contains(cartaAux));
            baraja.add(cartaAux);
        }

        return baraja;
    }

    // Método para ordenar las cartas
    public static void ordenarCartas(List<Cartas> baraja) {
        Collections.sort(baraja);
    }
}
