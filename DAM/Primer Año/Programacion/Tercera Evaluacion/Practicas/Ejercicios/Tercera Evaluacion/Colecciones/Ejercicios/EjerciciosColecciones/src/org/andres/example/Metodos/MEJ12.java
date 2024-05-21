package org.andres.example.Metodos;

import org.andres.example.Modelo.Cartas_Ej12;

import java.util.*;

public class MEJ12 {
    // Método para generar las cartas
    public static List<Cartas_Ej12> crearMazo() {
        ArrayList<Cartas_Ej12> mazo = new ArrayList<>();
        Cartas_Ej12 cartaAux = new Cartas_Ej12();
        mazo.add(cartaAux);

        for (int i = 0; i < 5; i++) {
            do {
                cartaAux = new Cartas_Ej12();
            } while (mazo.contains(cartaAux));

            mazo.add(cartaAux);
        }
        return mazo;
    }

    // Método para asignar los puntos de las cartas
    public static HashMap<String,Integer> asignarValoresCartas() {
        HashMap<String, Integer> valoresCartas = new HashMap<>();
        valoresCartas.put("As",11);
        valoresCartas.put("2",0);
        valoresCartas.put("3",10);
        valoresCartas.put("4",0);
        valoresCartas.put("5",0);
        valoresCartas.put("6",0);
        valoresCartas.put("7",0);
        valoresCartas.put("Sota",2);
        valoresCartas.put("caballo",3);
        valoresCartas.put("Rey",4);

        return valoresCartas;
    }

    // Método para calcular el total de puntos de una mano de cartas
    public static int calcularPuntos(List<Cartas_Ej12> mazo, HashMap<String, Integer> valoresCartas) {
        int puntos = 0;
        for (Cartas_Ej12 miCarta : mazo) {
            puntos += valoresCartas.get(miCarta.getNumero());
        }
        return puntos;
    }

    // Método para mostrar los puntos de las cartas
    public static void mostrarPuntos(List<Cartas_Ej12> mazo, int totalPuntos) {
        for (Cartas_Ej12 c : mazo) {
            System.out.println(c);
        }
        System.out.println("Tienes " + totalPuntos + " puntos.");
    }
}