package org.andres.example.Ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MEJ12 {
    // Generar una mano de 5 cartas aleatorias
    public static List<Cartas> generarMano() {
        List<Cartas> mano = new ArrayList<>();
        Baraja baraja = new Baraja();
        for (int i = 0; i < 5; i++) {
            mano.add(baraja.tomarCarta());
        }
        return mano;
    }

    // Mostrar las cartas de la mano
    public static void mostrarCartas(List<Cartas> mano) {
        System.out.println("Cartas:");
        for (Cartas carta : mano) {
            System.out.println(carta);
        }
    }

    // Calcular el total de puntos de una mano de cartas
    public static int calcularPuntos(List<Cartas> mano) {
        // Mapa de valores para las figuras
        // as → 11, tres → 10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale nada.
        int totalPuntos = 0;
        for (Cartas carta : mano) {
            String figura = carta.getFigura();
            switch (figura) {
                case "as":
                    totalPuntos += 11;
                    break;
                case "tres":
                    totalPuntos += 10;
                    break;
                case "sota":
                    totalPuntos += 2;
                    break;
                case "caballo":
                    totalPuntos += 3;
                    break;
                case "rey":
                    totalPuntos += 4;
                    break;
                default:
                    // El resto de las cartas no suma puntos
                    break;
            }
        }
        return totalPuntos;
    }
}