package org.andres.example.Metodos;

import org.andres.example.Modelo.Cartas;

import java.util.*;

public class MEJ8 {
    // Método para generar la baraja española completa
    public static List<Cartas> generarBaraJa() {
        List<Cartas> baraja = new ArrayList<>();
        int carta = 9;

        Cartas cartaAux = new Cartas();
        baraja.add(cartaAux);

        for (int i=0; i<carta; i++) {
            do {
                cartaAux = new Cartas();
            }while (baraja.contains(cartaAux));
            baraja.add(cartaAux);
        }
        return baraja;
    }

    // Método para elegir n cartas al azar de la baraja sin repeticiones
    public static List<Cartas> elegirCartas(List<Cartas> baraja, int n) {
        List<Cartas> cartasElegir = new ArrayList<>();

        // Mezclar la baraha para obtener una selección aleatoria
        Collections.shuffle(baraja);

        //Elegemos las n primeras cartas mezcladas
        for (int i=0; i<n; i++) {
            cartasElegir.add(baraja.get(i));
        }
        return cartasElegir;
    }
}
